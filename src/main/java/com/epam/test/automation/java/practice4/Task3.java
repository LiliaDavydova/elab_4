package com.epam.test.automation.java.practice4;

public class Task3 {
    
    private Task3() {

    }

    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        int result = a1;
        int value = a1;
        for (int i = 0; i < n - 1; i++) {
            value += t;
            result *= value;
        }
        return result;
    }
}
