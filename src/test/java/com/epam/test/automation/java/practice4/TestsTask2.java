package com.epam.test.automation.java.practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask2 {
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask2ShouldThrowExceptionWhenArrayIsNull() {
        Task1.isSorted(null, SortOrder.ASC);
    }
    @Test
    public void testTask2ShouldNotChangeUnsortedArrayWhenAsc() {
        int[] array = {5, 17, 24, 88, 33, 2};
        int[] expectedArray = {5, 17, 24, 88, 33, 2};
        Assert.assertEquals(Task2.transform(array, SortOrder.ASC), expectedArray, "Should not change array when ascending");
    }

    @Test
    public void testTask2ShouldNotChangeDescArrayWhenAsc() {
        int[] array = {15, 10, 3};
        int[] expectedArray = {15, 10, 3};
        Assert.assertEquals(Task2.transform(array, SortOrder.ASC), expectedArray, "Should not change array when it is not sorted by given order");
    }

    @Test
    public void testTask2ShouldChangeArrayWhenDesc() {
        int[] array = {15, 10, 3};
        int[] expectedArray = {15, 11, 5};
        Assert.assertEquals(Task2.transform(array, SortOrder.DESC), expectedArray, "Should replace the value of each element of an integer array with the sum of this element value and its index, only if the given array is sorted in the given order");
    }
}