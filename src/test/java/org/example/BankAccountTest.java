package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;
    @BeforeEach
    void setUp(){
        account = new BankAccount(50000,10);
    }
    @Test
    void depositShouldReturnZero() {

    }

    @Test
    void withdraw() {
    }

    @Test
    void transfer() {
    }

    @Test
    void addInterest() {
    }

    @Test
    void getBalance() {
    }
}