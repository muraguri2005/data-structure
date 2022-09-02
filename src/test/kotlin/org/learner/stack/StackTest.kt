package org.learner.stack

import org.junit.jupiter.api.Test

class StackTest {
    @Test
    fun testStack() {
        val stack = Stack()
        stack.push(10)
        stack.push(20)
        assert(stack.pop() == 20)
        assert(stack.pop() == 10)
        assert(stack.pop() == null)
    }
}
