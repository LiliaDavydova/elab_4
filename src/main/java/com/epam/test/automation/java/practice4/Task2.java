package com.epam.test.automation.java.practice4;

public class Task2 {

    private Task2() {

    }

    public static int[] transform(int[] array, SortOrder order) {
        if (array == null) {
            throw new IllegalArgumentException();
        }
        if(Task1.isSorted(array, order)) {
            for (int i = 0; i < array.length; i++) {
                array[i] += i;
            }
        }
        return array;
    }
}
