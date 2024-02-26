package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account,account2;
    @BeforeEach
    void setUp(){
        account = new BankAccount(50000,10);
        account2 = new BankAccount(0,10);
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
    void withdrawShouldThrowExceptionWhenAmmountlessthanZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> account.withdraw(-20));
    }
    @Test
    void withdrawShouldThrowExceptionWhenNoBalanceAvailable() {
        Assertions.assertThrows(IllegalStateException.class, () -> account.withdraw(account.getBalance()+50));
    }
    @Test
    void withdrawShouldDecreseBalance() {
        account.withdraw(10000);
        Assertions.assertEquals(40000,account.getBalance());
    }
    @Test
    void transferShouldThrowException() {
        Assertions.assertThrows(NullPointerException.class, () -> account.transfer(10,null));
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