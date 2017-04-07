package com.hewonjeong.algorithms.sorts;

/**
 * Created by Hewon Jeong on 27/03/2017.
 */
public class InsertionSort {
    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T target = arr[i];
            int pointer = i;
            while (pointer > 0 && target.compareTo(arr[pointer - 1]) < 0) {
                arr[pointer] = arr[pointer - 1];
                pointer--;
            }
            arr[pointer] = target;
        }
        return arr;
    }
}