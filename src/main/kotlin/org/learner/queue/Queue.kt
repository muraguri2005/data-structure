package org.learner.queue

class Queue(var head: QueueNode? = null, var tail: QueueNode? = null) {
    fun isEmpty(): Boolean {
        return head == null || tail == null
    }

    fun enqueue(data: Int) {
        if (isEmpty()) {
            head = QueueNode(data = data)
            tail = head
        } else {
            val temp = QueueNode(data = data)
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
