package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    private FactorialCalculator factorialCalculator;

    @Before
    public void setUp() {
        factorialCalculator = new FactorialCalculator();
        System.out.println("Setup before each test.");
    }

    @After
    public void tearDown() {
        factorialCalculator = null;
        System.out.println("Teardown after each test.");
    }

    @Test
    public void testFactorialOf0() {
        assertEquals(1, factorialCalculator.calculate(0));
    }

    @Test
    public void testFactorialOf1() {
        assertEquals(1, factorialCalculator.calculate(1));
    }

    @Test
    public void testFactorialOf5() {
        assertEquals(120, factorialCalculator.calculate(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        factorialCalculator.calculate(-1);
    }
}

class FactorialCalculator {
    /**
     * Calculates factorial of a non-negative integer
     * @param n the input number (must be >= 0)
     * @return factorial of n
     * @throws IllegalArgumentException if input is negative
     */
    public int calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
