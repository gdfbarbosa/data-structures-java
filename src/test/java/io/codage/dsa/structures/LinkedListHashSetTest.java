package io.codage.dsa.structures;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListHashSetTest {
    @Test
    public void hashSetTest1() {
        LinkedListHashSet linkedListHashSet = new LinkedListHashSet();
        linkedListHashSet.add(1);
        linkedListHashSet.add(2);
        assertTrue(linkedListHashSet.contains(1));
        assertFalse(linkedListHashSet.contains(3));
        linkedListHashSet.add(2);
        assertTrue(linkedListHashSet.contains(2));
        linkedListHashSet.remove(2);
        assertFalse(linkedListHashSet.contains(2));
    }
}