package com.epam.test.automation.java.practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask1 {
        @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask1ShouldThrowExceptionWhenArrayIsNull() {
        Task1.isSorted(null, SortOrder.ASC);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask1ShouldThrowExceptionWhenOrderIsNull() {

        Task1.isSorted(new int[]{1, 2, 3}, null);
    }

    @Test
    public void testTask1ShouldReturnFalseWhenAscending() {
        int[] array = {5, 17, 24, 88, 33, 2};
        Assert.assertFalse(Task1.isSorted(array, SortOrder.ASC), "Should return false when ascending");
    }

    @Test
    public void testTask1ShouldReturnTrueWhenAscending() {
        int[] array = {1, 2, 3, 4, 5};
        Assert.assertTrue(Task1.isSorted(array, SortOrder.ASC), "Should return true when ascending");
    }

    @Test
    public void testTask1ShouldReturnFalseWhenDescending() {
        int[] array = {5, 17, 24, 88, 33, 2};
        Assert.assertFalse(Task1.isSorted(array, SortOrder.ASC), "Should return false when Descending");
    }

    @Test
    public void testTask1ShouldReturnTrueWhenDescending() {
        int[] array = {5, 4, 3, 2, 1};
        Assert.assertTrue(Task1.isSorted(array, SortOrder.DESC), "Should return true when Descending");
    }
}
