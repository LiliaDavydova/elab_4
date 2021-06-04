package com.epam.test.automation.java.practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask3 {
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask3ShouldThrowExceptionWhenNIs0() {
        Task3.multiArithmeticElements(1, 2, 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask3ShouldThrowExceptionWhenNIsLessThan0() {
        Task3.multiArithmeticElements(1, 2, -5);
    }
    @Test
    public void testTask3MultiArithmeticElementsTest() {
        Assert.assertEquals(Task3.multiArithmeticElements(5, 3, 4), 6160, "Should return 6160");
    }
}
