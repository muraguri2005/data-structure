package org.learner.queue

import org.junit.jupiter.api.Test

class QueueTest {
    @Test
    fun testQueue() {
        val queue = Queue()
        queue.enqueue(10)
        queue.enqueue(20)
        assert(queue.dequeue() == 10)
        assert(queue.dequeue() == 20)
        assert(queue.dequeue() == null)
    }
}
