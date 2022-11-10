package io.codage.dsa.structures;

/**
 * Circular queue using an index to control where it is like a ring.
 * <a href="https://leetcode.com/problems/design-circular-queue/description/">622. Design Circular Queue</a>
 * <a href="https://leetcode.com/problems/design-circular-queue/solutions/419656/official-solution/">Official Solution - Leetcode</a>
 */
public class CircularQueue {
    private final int[] queue;
    private int head = 0;
    private int count = 0;
    private final int capacity;

    public CircularQueue(int k) {
        this.queue = new int[k];
        this.capacity = k;
    }

    public boolean enQueue(int value) {
        if (this.isFull())
            return false;
        this.queue[(this.head + this.count) % this.capacity] = value;
        this.count++;
        return true;
    }

    public boolean deQueue() {
        if (this.isEmpty())
            return false;
        // remove value
        this.queue[this.head] = -1;
        // move pointer forward
        this.head = (this.head + 1) % this.capacity;
        this.count--;
        return true;
    }

    public int front() {
        if (this.isEmpty())
            return -1;
        return this.queue[this.head];
    }

    public int rear() {
        if (this.isEmpty())
            return -1;
        return this.queue[(this.head + this.count - 1) % this.capacity];
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == this.capacity;
    }
}
