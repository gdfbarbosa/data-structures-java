package io.codage.dsa.sorting;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
    @Test
    public void test() {
        InsertionSort insertionSort = new InsertionSort();
        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, insertionSort.sort(new int[]{5,4,3,2,1}));
    }
}
