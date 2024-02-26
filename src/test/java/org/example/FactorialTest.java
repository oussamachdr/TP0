package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {
    @Test
    public void FactorialShouldReturnException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
    @Test
    public void FactorialShouldReturnCorrectAnswer(){
        Assertions.assertEquals(24,Factorial.factorial(4));
    }
}