package org.learner.stack

class Stack(var head: StackNode? = null) {
    fun push(data: Int? = null) {
        val newNode = StackNode(data)
        newNode.next = head
        head = newNode
    }

    fun pop(): Int? {
        val data = head?.data
        head = head?.next
        return data
    }
}
