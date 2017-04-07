package com.hewonjeong.algorithms.sorts;


public class QuickSort {
    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        return (arr == null || arr.length == 0) ? arr : quicksort(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> T[] quicksort(T[] arr, int left, int right) {
        int l = left, r = right;
        T pivot = arr[(left + right) / 2];

        while (l <= r) {
            while (arr[l].compareTo(pivot) < 0) l++;
            while (arr[r].compareTo(pivot) > 0) r--;
            if (l <= r) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        if (left < r) quicksort(arr, left, r);
        if (l < right) quicksort(arr, l, right);

        return arr;
    }

    private static <T extends Comparable<T>> void swap(T[] arr, int idx1, int idx2) {
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
