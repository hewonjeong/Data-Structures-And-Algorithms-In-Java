package com.hewonjeong.algorithms.sorts;

/**
 * Created by Hewon Jeong on 27/03/2017.
 */
public class SelectionSort {
    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) minIdx = j;
            }
            swap(arr, i, minIdx);
        }
        return arr;
    }

    private static <T extends Comparable<T>> void swap(T[] arr, int idx1, int idx2) {
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
