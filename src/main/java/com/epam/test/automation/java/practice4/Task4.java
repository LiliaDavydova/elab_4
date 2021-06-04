package com.epam.test.automation.java.practice4;

public class Task4 {
    
    private Task4() {

    }

    public static double sumGeometricElements(int a1, double t, int alim) {
        if (t <= 0 || t >= 1 || a1 <= 0 || a1 <= alim) {
            throw new IllegalArgumentException();
        }
        double result = a1;
        double value = a1;
        while (value * t > alim) {
            value = value * t;
            result += value;
        }
        return Math.round(result);
    }
}
