package com.dsa.algorithms.sorting;

public final class QuickSort {

    private QuickSort() {}

    public static void sort(int[] array, int start, int end) {

        if(end - start < 2) {
            return;
        }

            int partitionIndex = partition(array, start, end);
            sort(array, start, partitionIndex);
            sort(array, partitionIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[start];
        int i = start;
        int j = end;

        while(i < j) {

            while(i < j && array[--j] >= pivot);

            if(i < j) {
                array[i] = array[j];
            }

            while(i < j && array[++i] <= pivot);

            if(i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;
        return j;
    }
}
