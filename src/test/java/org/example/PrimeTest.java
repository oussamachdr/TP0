package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrimeShouldReturnFalseWhenNLessThan2() {
        assertFalse(Prime.isPrime(-1));
    }
    @Test

    void isPrimeShouldReturnTrueWhenNisEqualTo2And3() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
    }
    @Test
    void isPrimeShouldReturnTrueWhenNisPrime() {
        assertTrue(Prime.isPrime(19));
    }
    @Test
    void isPrimeShouldReturnFalseWhenNisNotPrime() {
        assertFalse(Prime.isPrime(10));
    }
}