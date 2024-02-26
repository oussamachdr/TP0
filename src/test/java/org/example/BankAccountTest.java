package org.example;

import org.junit.jupiter.api.Assertions;
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
    void depositShouldThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> account.deposit(-20));
    }
    @Test
    void depositShouldAddInBalance() {
        account.deposit(10000);
        Assertions.assertEquals(60000,account.getBalance());
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