package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void testFactorialOf0() {
        assertEquals(1, Factorial.calculate(0));
    }
    
    @Test
    public void testFactorialOf5() {
        assertEquals(120, Factorial.calculate(5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        Factorial.calculate(-1);
    }
}
