package com.hewonjeong.algorithms.sorts;

/**
 * Created by Hewon Jeong on 27/03/2017.
 */
public class BubbleSort<T extends Comparable<T>> {
     public static <T extends Comparable<T>> T[] sort(T[] arr) {
        boolean swapped = true;
        int len = arr.length;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < len; i++) {
                if (arr[i].compareTo(arr[i - 1]) < 0) {
                    swap(arr, i, i - 1);
                    swapped = true;
                }
            }
            len--;
        }
        return arr;
    }

    private static <T extends Comparable<T>> void swap(T[] arr, int idx1, int idx2) {
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}