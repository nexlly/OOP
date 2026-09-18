package ru.nsu.nexlly;

import java.util.Arrays;

public class HeapSort {

    /**
     * Сортирует массив по возрастанию пирамидальной сортировкой (in-place).
     * 1) Строит из массива max-кучу (наибольший элемент в корне).
     * 2) Раз за разом меняет корень (максимум) с последним элементом
     *    неотсортированной части, уменьшает размер кучи и восстанавливает её.
     */
    public static void heapsort(int[] a) {
        int n = a.length;

        // Построение max-кучи: просеиваем вниз все внутренние узлы,
        // начиная с последнего родителя (n/2 - 1) и до корня.
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(a, i, n);
        }

        // Извлечение максимумов: ставим текущий максимум в конец,
        // сужаем кучу и восстанавливаем её свойство от корня.
        for (int end = n - 1; end > 0; end--) {
            swap(a, 0, end);
            siftDown(a, 0, end);
        }
    }

    /**
     * Просеивание вниз: опускает элемент a[i] вниз по куче,
     * пока он не станет больше обоих потомков.
     * Рассматриваются только первые size элементов массива.
     */
    private static void siftDown(int[] a, int i, int size) {
        while (true) {
            int left = 2 * i + 1;   // индекс левого потомка
            int right = left + 1;   // индекс правого потомка
            int largest = i;        // индекс наибольшего из трёх

            if (left < size && a[left] > a[largest]) largest = left;
            if (right < size && a[right] > a[largest]) largest = right;

            // Узел уже больше потомков — свойство кучи выполнено.
            if (largest == i) return;

            // Меняем с наибольшим потомком и продолжаем спуск.
            swap(a, i, largest);
            i = largest;
        }
    }

    /**
     * Меняет местами элементы a[i] и a[j].
     */
    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * Точка входа: сортирует тестовый массив и выводит результат.
     */
    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 3, 2, 1};
        heapsort(arr);

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
    }
}