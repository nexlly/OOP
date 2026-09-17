package ru.nsu.nexlly;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class HeapSortTest {

    @Test
    void emptyArray() {
        int[] a = {};
        HeapSort.heapsort(a);
        assertArrayEquals(new int[] {}, a);
    }

    @Test
    void singleElement() {
        int[] a = {42};
        HeapSort.heapsort(a);
        assertArrayEquals(new int[] {42}, a);
    }

    @Test
    void twoElements() {
        int[] a = {2, 1};
        HeapSort.heapsort(a);
        assertArrayEquals(new int[] {1, 2}, a);
    }

    @Test
    void alreadySorted() {
        int[] a = {1, 2, 3, 4, 5};
        HeapSort.heapsort(a);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, a);
    }

    @Test
    void reverseSorted() {
        int[] a = {5, 4, 3, 2, 1};
        HeapSort.heapsort(a);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, a);
    }

    @Test
    void negativeNumbers() {
        int[] a = {-3, -1, -7, -2, -5};
        HeapSort.heapsort(a);
        assertArrayEquals(new int[] {-7, -5, -3, -2, -1}, a);
    }

    @Test
    void mixedSigns() {
        int[] a = {3, -1, 0, -10, 8, 2};
        HeapSort.heapsort(a);
        assertArrayEquals(new int[] {-10, -1, 0, 2, 3, 8}, a);
    }

    @Test
    void duplicates() {
        int[] a = {4, 1, 4, 2, 1, 4};
        HeapSort.heapsort(a);
        assertArrayEquals(new int[] {1, 1, 2, 4, 4, 4}, a);
    }

    @Test
    void allEqual() {
        int[] a = {7, 7, 7, 7};
        HeapSort.heapsort(a);
        assertArrayEquals(new int[] {7, 7, 7, 7}, a);
    }
}