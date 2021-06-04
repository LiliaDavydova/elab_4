package com.epam.test.automation.java.practice4;

public class Task1 {

    private Task1() {

    }

    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || order == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        if (order == SortOrder.ASC) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
        } else if (order == SortOrder.DESC) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
