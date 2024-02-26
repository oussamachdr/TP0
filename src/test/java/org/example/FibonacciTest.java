package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciShouldThrouExeptionWhenNIsNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
    @Test
    void fibonacciReturn0WhenNIs0() {
        Assertions.assertEquals(0,Fibonacci.fibonacci(0));
    }
    @Test
    void fibonacciReturn1WhenNIs1() {
        Assertions.assertEquals(1,Fibonacci.fibonacci(1));
    }
    @Test
    void fibonacciWhenNIsGraterThan1() {
        Assertions.assertEquals(21,Fibonacci.fibonacci(8));
    }
}