package io.codage.dsa.structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class BucketEntry {
    int key;
    int value;

    public BucketEntry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BucketEntry entry = (BucketEntry) o;
        return key == entry.key && value == entry.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}

class Bucket {
    List<BucketEntry> values;
    public Bucket() {
        this.values = new ArrayList<>();
    }

    public BucketEntry getBucketEntry(int key) {
        for (BucketEntry entry : this.values) {
            if (entry.key == key) {
                return entry;
            }
        }
        return null;
    }

    public void put(int key, int value) {
        BucketEntry bucketEntry = getBucketEntry(key);
        if (bucketEntry == null) {
            this.values.add(new BucketEntry(key, value));
        } else {
            bucketEntry.value = value;
        }
    }

    public int get(int key) {
        BucketEntry bucketEntry = getBucketEntry(key);
        if (bucketEntry == null) {
            return -1;
        } else {
            return bucketEntry.value;
        }
    }

    public void remove(int key) {
        BucketEntry bucketEntry = getBucketEntry(key);
        if (bucketEntry != null) {
            this.values.remove(bucketEntry);
        }
    }
}

public class LinkedListHashMap {
    private final Bucket[] buckets;
    private static final int TOTAL_BUCKETS = 2000;

    public LinkedListHashMap() {
        this.buckets = new Bucket[TOTAL_BUCKETS];
    }

    public void put(int key, int value) {
        int index = key % TOTAL_BUCKETS;
        if (this.buckets[index] == null) {
            this.buckets[index] = new Bucket();
        }
        this.buckets[index].put(key, value);
    }

    public int get(int key) {
        int index = key % TOTAL_BUCKETS;
        if (this.buckets[index] == null) {
            return -1;
        }
        return this.buckets[index].get(key);
    }

    public void remove(int key) {
        int index = key % TOTAL_BUCKETS;
        if (this.buckets[index] != null) {
            this.buckets[index].remove(key);
        }
    }
}
