package io.codage.dsa.structures;

import java.util.ArrayList;

/**
 * HashSet implemented as an array of LinkedList.
 * <a href="https://leetcode.com/problems/design-hashset/">705. Design HashSet</a>
 */
public class LinkedListHashSet {
    private final ArrayList<Integer>[] values;
    private static final Integer MAX_CAPACITY = 1000;

    public LinkedListHashSet() {
        this.values = new ArrayList<>[MAX_CAPACITY];
    }

    public void add(int key) {
        int index = key % MAX_CAPACITY;
        if (this.values[index] == null) {
            this.values[index] = new ArrayList<>();
        }
        int keyIndex = this.values[index].indexOf(key);
        // avoid duplicates
        if (keyIndex == -1) {
            this.values[index].add(key);
        }
    }

    public void remove(int key) {
        int index = key % MAX_CAPACITY;
        if (this.values[index] != null) {
            int delIndex = this.values[index].indexOf(key);
            if (delIndex != -1) {
                this.values[index].remove(delIndex);
            }
        }
    }

    public boolean contains(int key) {
        int index = key % MAX_CAPACITY;
        if (this.values[index] != null && !this.values[index].isEmpty()) {
            return this.values[index].contains(key);
        }
        return false;
    }
}
