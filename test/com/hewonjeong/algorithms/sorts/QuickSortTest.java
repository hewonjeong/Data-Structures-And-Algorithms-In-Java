package com.hewonjeong.algorithms.sorts;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class QuickSortTest {
    private static final Random RANDOM = new Random();
    private static final int SIZE = 10000;
    private static final int MAX = 100;

    private static Integer[] unsorted;
    private static String[] empty;
    private static String[] singleStr;
    private static String[] doubleStr;
    private static Integer[] duplicated;

    @BeforeAll
    public static void initAll() {
        unsorted = new Integer[SIZE];
        for (int i = 0; i < unsorted.length; i++) {
            int val = RANDOM.nextInt(MAX);
            unsorted[i] = val;
        }

        empty = new String[0];
        singleStr = new String[]{"apple"};
        doubleStr = new String[]{"Bape", "Apple"};
        duplicated = new Integer[]{5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5};

    }

    @Test
    public void testNull() {
        Integer[] result = QuickSort.sort(null);
        assertNull(result);
    }

    @Test
    public void testEmpty() {
        String[] result = QuickSort.sort(empty);
        assertEquals(result, empty);
    }

    @Test
    public void testSingle() {
        String[] result = QuickSort.sort(singleStr);
        assertTrue(TestUtil.isSorted(result));
    }

    @Test
    public void testDouble() {
        String[] result = QuickSort.sort(doubleStr);
        assertTrue(TestUtil.isSorted(result));
    }

    @Test
    public void testDuplicate() {
        Integer[] result = QuickSort.sort(duplicated);
        assertTrue(TestUtil.isSorted(result));
    }

    @Test
    public void testQuickSort() {
        long startTime = System.currentTimeMillis();
        QuickSort.sort(unsorted);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("elapsedTime: " + elapsedTime);
        assertTrue(TestUtil.isSorted(unsorted));
    }
}