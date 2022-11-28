package Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getPayment() {
        int payment = (int) 2.0;
        Wallet theWallet = new Wallet();
        theWallet.subtractMoney(payment);
        assertEquals(2.0, payment);
    }
}