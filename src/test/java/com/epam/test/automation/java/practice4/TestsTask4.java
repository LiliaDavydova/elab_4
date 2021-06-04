package com.epam.test.automation.java.practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask4 {
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask4ShouldThrowExceptionWhenProgressionStepIsNegative() {
        Task4.sumGeometricElements(2, -1, 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask4ShouldThrowExceptionWhenProgressionStepIsMoreThen1() {
        Task4.sumGeometricElements(2, 2, 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask4ShouldThrowExceptionWhenProgressionStepIs0() {
        Task4.sumGeometricElements(2, 0, 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask4ShouldThrowExceptionWhenProgressionStepIs1() {
        Task4.sumGeometricElements(2, 1, 2);
    }

    @Test
    public void testTask4SumGeometricElementsTest() {
        Assert.assertEquals(Task4.sumGeometricElements(100, 0.5, 20), 175d, "Should return 175.0");
    }
}
