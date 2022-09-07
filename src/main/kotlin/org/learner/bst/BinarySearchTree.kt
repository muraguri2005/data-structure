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
        return checkBST(root?.left, Int.MIN_VALUE, Int.MAX_VALUE)
    }

    private fun checkBST(root: BstNode?, minimum: Int, maximum: Int): Boolean {
        return if (root == null) {
            true
        } else if (root.data!! < minimum || root.data!! > maximum) {
            false
        } else {
            checkBST(root.left, minimum, root.data!! - 1) && checkBST(root.right, root.data!! + 1, maximum)
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
