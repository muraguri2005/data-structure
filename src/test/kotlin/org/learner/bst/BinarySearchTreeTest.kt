package org.learner.bst

import org.junit.jupiter.api.Test

class BinarySearchTreeTest {
    @Test
    fun testBinarySearchTree() {
        val binarySearchTree = BinarySearchTree()
        binarySearchTree.insert(3)
        binarySearchTree.insert(2)
        binarySearchTree.insert(1)
        binarySearchTree.insert(5)
        binarySearchTree.insert(4)
        binarySearchTree.insert(6)
        binarySearchTree.insert(7)
        assert(binarySearchTree.height(binarySearchTree.root) == 3)
        println(binarySearchTree.preOrder(binarySearchTree.root))
        println(binarySearchTree.inOrder(binarySearchTree.root))
        println(binarySearchTree.postOrder(binarySearchTree.root))
        println(binarySearchTree.checkBST(binarySearchTree.root))
    }
}
