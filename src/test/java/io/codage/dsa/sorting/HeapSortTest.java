package io.codage.dsa.sorting;

import org.junit.Test;
import static org.junit.Assert.*;

public class HeapSortTest {
    @Test
    public void heapSort() {
        int[] arr = {7, 5, 6, 8, 1, 2, 3};
        new HeapSort().heapSort(arr);
        assertArrayEquals(new int[]{1,2,3,5,6,7,8}, arr);
    }
}