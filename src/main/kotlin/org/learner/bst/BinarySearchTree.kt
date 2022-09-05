package org.learner.bst

import kotlin.math.max

class BinarySearchTree(var root: BstNode? = null) {
    fun isEmpty(): Boolean {
        return root == null
    }

    fun insert(data: Int) {
        val node = BstNode(data = data)
        if (isEmpty()) {
            root = node
        } else {
            var current = root
            while (current != null) {
                if (data < root?.data!!) {
                    if (current.left == null) {
                        current.left = node
                        break
                    } else {
                        current = current.left
                    }
                } else if (data > root?.data!!) {
                    if (current.right == null) {
                        current.right = node
                        break
                    } else {
                        current = current.right
                    }
                }
            }
        }
    }
    fun height(treeRoot: BstNode?=null): Int {
        return if (treeRoot==null)
            0
        else 1 + max(height(treeRoot.left),height(treeRoot.right))
    }
}
