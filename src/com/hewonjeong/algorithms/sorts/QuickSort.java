package com.hewonjeong.algorithms.sorts;

/**
 * Created by Hewon Jeong on 27/03/2017.
 */
public class QuickSort {
    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        return (arr == null || arr.length == 0) ? arr : qs(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> T[] qs(T[] arr, int left, int right) {
        int l = left, r = right;
        T pivot = arr[left + (right - left) / 2];

        while (l <= r) {
            while (arr[l].compareTo(pivot) < 0) l++;
            while (arr[r].compareTo(pivot) > 0) r--;
            if (l <= r) {
                swap(arr, l, r);
                l++;
                r--;
            } else break;
        }

        if (left < r) qs(arr, left, r);
        if (l < right) qs(arr, l, right);

        return arr;
    }

    private static <T extends Comparable<T>> void swap(T[] arr, int idx1, int idx2) {
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
