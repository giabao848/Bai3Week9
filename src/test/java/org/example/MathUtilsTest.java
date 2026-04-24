package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    private MathUtils math;
    @BeforeEach
    void setUp() {
        math = new MathUtils();
    }
    @Test
    void testFactorialPositive(){
        assertEquals(11, math.add(5, 6));
    }
    @Test
    void testDivideZero(){
        assertThrows(ArithmeticException.class, () -> math.divide(2, 0));
    }
}
