package org.learner.bst

import org.junit.jupiter.api.Test

class BinarySearchTreeTest {
    @Test
    fun testQueue() {
        val binarySearchTree = BinarySearchTree()
        binarySearchTree.insert(10)
        assert(binarySearchTree.height(binarySearchTree.root) == 1)
        binarySearchTree.insert(20)
        assert(binarySearchTree.height(binarySearchTree.root) == 2)
        binarySearchTree.insert(30)
        assert(binarySearchTree.height(binarySearchTree.root) == 3)
    }
}
