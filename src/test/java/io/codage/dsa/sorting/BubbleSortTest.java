package io.codage.dsa.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void bubbleSort1() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {7, 6, 5, 4, 1};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 4, 5, 6, 7}, arr);
    }

    @Test
    public void bubbleSort2() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, arr);
    }
}