package com.thoughtworks.wallet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {
    
    @Test
    void shouldReturn0WhenNewWalletIsCreated()throws Exception{
        Wallet wallet = new Wallet();
        Rupee expected = new Rupee(0);

        Rupee actual = wallet.balance();
        
        assertEquals(expected, actual);
    }

    @Test
    void shouldAddBalanceWhenAmountIsGiven()throws Exception{
        Rupee amount = new Rupee(10.0);
        Wallet wallet = new Wallet();
        Rupee expected = amount;

        wallet.put(amount);
        Rupee actual = wallet.balance();

        assertEquals(expected, actual);
    }

    @Test
    void shouldUpdateBalanceWhenAmountIsGiven()throws Exception{
        Rupee amount1 = new Rupee(10.0);
        Rupee amount2 = new Rupee(12.0);
        Wallet wallet = new Wallet();
        Rupee expected = new Rupee(10.0 + 12.0);

        wallet.put(amount1);
        wallet.put(amount2);
        Rupee actual = wallet.balance();

        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowExceptionWhenAmountIsNegative()throws Exception{
        assertThrows(Exception.class, () -> new Rupee(-10.0));
    }
}
