package com.example;

public class FactorialCalculator {
    
    public int calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        
        // 0! and 1! both equal 1
        if (n <= 1) {
            return 1;
        }
        
        // Calculate factorial iteratively
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
