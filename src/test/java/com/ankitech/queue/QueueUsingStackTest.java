package com.ankitech.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueUsingStackTest {

    @Test
    public void dequeue() throws Exception {

        QueueUsingStack<Integer> queueUsingStack = new QueueUsingStack<>();

        queueUsingStack.enqueue(45);
        queueUsingStack.enqueue(95);
        queueUsingStack.enqueue(41);


        assertEquals(Integer.valueOf(45), queueUsingStack.dequeue());
        assertEquals(Integer.valueOf(95), queueUsingStack.dequeue());
        assertEquals(Integer.valueOf(41), queueUsingStack.dequeue());

        queueUsingStack.enqueue(12);
        queueUsingStack.enqueue(36);
        queueUsingStack.enqueue(75);

        assertEquals(Integer.valueOf(12), queueUsingStack.dequeue());
    }
}