package com.demo;

public class Factorial {
    
    public static long calculate(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        return (n == 0) ? 1 : n * calculate(n - 1);
    }
}
