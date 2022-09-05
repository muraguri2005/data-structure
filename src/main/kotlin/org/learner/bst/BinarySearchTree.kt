package org.learner.bst

import kotlin.math.max

class BinarySearchTree(var root: BstNode? = null) {
    fun insert(data: Int) {
        if (root != null) {
            insert(root!!, data)
        } else
            root = BstNode(data)
    }

    private fun insert(rootNode: BstNode, data: Int) {
        if (rootNode.data!! < data) {
            if (rootNode.left != null)
                insert(rootNode.left!!, data)
            else rootNode.left = BstNode(data)
        } else {
            if (rootNode.right != null)
                insert(rootNode.right!!, data)
            else rootNode.right = BstNode(data)
        }
    }

    fun height(treeRoot: BstNode? = null): Int {
        if (treeRoot == null)
            return 0
        val height = when (treeRoot.left != null || treeRoot.right != null) {
            true -> 1
            else -> 0
        }
        return height + max(height(treeRoot.left), height(treeRoot.right))
    }

    fun checkBST(root: BstNode?): Boolean {
        return check(root, HashMap())
    }

    private fun check(root: BstNode?, map: MutableMap<Int?, Int?>): Boolean {
        return if (root == null) {
            true
        } else if (map.containsKey(root.data)) {
            false
        } else {
            map[root.data] = 1
            check(root.right, map) && check(root.left, map)
        }
    }

    fun preOrder(rootNode: BstNode? = null): MutableList<Int> {
        if (rootNode == null)
            return mutableListOf()

        val items = mutableListOf(rootNode.data!!)
        items.addAll(preOrder(rootNode.left))
        items.addAll(preOrder(rootNode.right))
        return items
    }

    fun inOrder(rootNode: BstNode? = null): MutableList<Int> {
        if (rootNode == null)
            return mutableListOf()

        val items = inOrder(rootNode.left)
        items.add(rootNode.data!!)
        items.addAll(inOrder(rootNode.right))
        return items
    }

    fun postOrder(rootNode: BstNode? = null): MutableList<Int> {
        if (rootNode == null)
            return mutableListOf()
        val items = postOrder(rootNode.left)
        items.addAll(postOrder(rootNode.right))
        items.add(rootNode.data!!)
        return items
    }
}
