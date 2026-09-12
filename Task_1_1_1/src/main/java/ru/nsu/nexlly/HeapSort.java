package ru.nsu.nexlly;

public class HeapSort {
    public static void sort(int[] a) {
        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(a, i, n);
        }

        for (int end = n - 1; end > 0; end--) {
            swap(a, 0, end);
            siftDown(a, 0, end);
        }
    }

    private static void siftDown(int[] a, int i, int size) {
        while (true) {
            int left = 2 * i + 1;
            int right = left + 1;
            int largest = i;

            if (left < size && a[left] > a[largest]) largest = left;
            if (right < size && a[right] > a[largest]) largest = right;

            if (largest == i) return;

            swap(a, i, largest);
            i = largest;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
    }
}