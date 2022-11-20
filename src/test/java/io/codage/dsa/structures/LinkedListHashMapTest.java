package io.codage.dsa.structures;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListHashMapTest {
    @Test
    public void testHashMap1() {
        //["MyHashMap","put","put","get","get","put","get","remove","get"]
        //[[],[1,1],[2,2],[1],[3],[2,1],[2],[2],[2]]
        LinkedListHashMap hashMap = new LinkedListHashMap();
        hashMap.put(1,1);
        hashMap.put(2,2);
        assertEquals(1, hashMap.get(1));
        assertEquals(-1, hashMap.get(3));
        hashMap.put(2,1);
        assertEquals(1, hashMap.get(2));
        hashMap.remove(2);
        assertEquals(-1, hashMap.get(2));
    }

}