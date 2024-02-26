package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;
    @BeforeEach
    void setUp(){
        stack = new Stack();
    }

    @Test
    void pushShouldAddElementOnTheTopOfTheStack() {
        int Elementexpected = 10;
        stack.push(Elementexpected);
        Assertions.assertEquals(1,stack.size());
        Assertions.assertEquals(Elementexpected,stack.peek());
    }
    @Test
    void pushShouldAddElementOnTheTopOfTheStackWhenStackIsFull() {
        int Elementexpected = 10;
        int length = 10;
        for (int i = 0; i < length; i++) {
            stack.push(2);
        }
        stack.push(Elementexpected);
        Assertions.assertEquals(length+1,stack.size());
        Assertions.assertEquals(Elementexpected,stack.peek());
    }

    @Test
    void popShouldThrowExceptionWhenStackIsEmpty() {
        Assertions.assertThrows(IllegalStateException.class, () -> stack.pop());
    }
    @Test
    void popShouldReturnValue() {
        stack.push(10);
        Assertions.assertEquals(10,stack.pop());
        Assertions.assertEquals(0,stack.size());
    }
    @Test
    void peekShouldThrowExceptionWhenStackIsEmpty() {
        Assertions.assertThrows(IllegalStateException.class, () -> stack.pop());
    }
    @Test
    void peekShouldReturnValue() {
        stack.push(10);
        Assertions.assertEquals(10,stack.peek());
    }
    @Test
    void isEmpty() {
    }

    @Test
    void size() {
        int size = stack.size();
        stack.push(10);
        System.out.println(size);
        Assertions.assertEquals(size+1,stack.size());
    }
}