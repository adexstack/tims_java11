package DebuggingAndUnitTesting.Unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
Note : Every test must be self cantained (Each method should execute a test without depending on another method)
 Also, the test name should be detailed about what the test is doing
 Adding delta "0" is to ensure
*/

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        BankAccount bk = new BankAccount("Seyi","Ade",1000, 1);
        double balance = bk.deposit(200,true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        BankAccount bk = new BankAccount("Seyi","Ade",1000, 1);
        bk.withdraw(600,true);
        assertEquals(700, bk.getBalance());
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        BankAccount bk = new BankAccount("Seyi","Ade",1000, 1);
        bk.deposit(2000,true);
        assertEquals(3000, bk.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        BankAccount bk = new BankAccount("Seyi","Ade",1000, 1);
        bk.withdraw(800,true);
        assertEquals(200, bk.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() {
        BankAccount bk = new BankAccount("Seyi","Ade",1000, 1);
        assertTrue(bk.isChecking(), "The account is NOT a checking account");
    }

}