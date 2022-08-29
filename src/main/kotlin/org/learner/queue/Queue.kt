package org.learner.queue

class Queue(var head: Node? = null, var tail: Node? = null) {
    fun isEmpty(): Boolean {
        return head == null || tail == null
    }

    fun enqueue(data: Int) {
        if (isEmpty()) {
            head = Node(data = data)
            tail = head
        } else {
            val temp = Node(data = data)
            temp.previous = temp
            tail?.next = temp
            tail = temp
        }
    }

    fun dequeue(): Int? {
        val data = head?.data
        head = head?.next
        return data
    }
}
