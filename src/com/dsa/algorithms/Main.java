package com.dsa.algorithms;

import com.dsa.algorithms.sorting.QuickSort;

public class Main {

    public static void main(String[] args) {

        int[] array = {4,6,0,1,2,9,-1};

        System.out.println("Before sorting:");
        for(int num : array) {
            System.out.print(num + " ");
        }

        QuickSort.sort(array, 0, array.length);

        System.out.println("\nAfter sorting:");
        for(int num : array) {
            System.out.print(num + " ");
        }
    }
}
