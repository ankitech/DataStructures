package com.ankitech.queue.linkedlistimpl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueImplTest {

    @Test
    public void queueTest() {

        QueueImpl<Integer> integerQueue = new QueueImpl<>();

        integerQueue.enqueue(45);
        integerQueue.enqueue(78);
        integerQueue.enqueue(9);
        integerQueue.enqueue(89);
        integerQueue.enqueue(12);
        integerQueue.enqueue(65);
        integerQueue.enqueue(41);

        assertEquals(Integer.valueOf(45), integerQueue.dequeue());
    }
}