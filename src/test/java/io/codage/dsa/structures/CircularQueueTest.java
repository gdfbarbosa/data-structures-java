package io.codage.dsa.structures;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircularQueueTest {
    @Test
    public void firstTest() {
        CircularQueue circularQueue = new CircularQueue(5);
        assertTrue(circularQueue.enQueue(1));
        assertTrue(circularQueue.enQueue(2));
        assertTrue(circularQueue.enQueue(3));
        assertTrue(circularQueue.deQueue());
        assertTrue(circularQueue.deQueue());
        assertTrue(circularQueue.enQueue(4));
        assertTrue(circularQueue.enQueue(5));
        assertTrue(circularQueue.enQueue(6));
        assertTrue(circularQueue.deQueue());
        assertTrue(circularQueue.deQueue());
        assertTrue(circularQueue.enQueue(4));
        assertTrue(circularQueue.enQueue(5));
        assertTrue(circularQueue.enQueue(6));
        assertTrue(circularQueue.isFull());
        assertFalse(circularQueue.enQueue(10));
    }

    @Test
    public void testFrontElementOfQueue() {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        assertEquals(1, circularQueue.front());
    }

    @Test
    public void testRearElementOfQueue() {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enQueue(10);
        circularQueue.enQueue(20);
        circularQueue.enQueue(30);
        assertEquals(30, circularQueue.rear());
    }

}