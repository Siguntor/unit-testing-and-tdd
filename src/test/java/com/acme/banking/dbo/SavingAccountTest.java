package com.acme.banking.dbo;

import com.acme.banking.dbo.domain.Client;
import com.acme.banking.dbo.domain.SavingAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SavingAccountTest {
    // id
    @Test
    public void shouldNotCreateSavingAccountWhenIdZero () {
        assertThrows(
                IllegalArgumentException.class,
                () -> new SavingAccount(0, new Client(1, "Cl_1"),100)
        );
    }

    @Test
    public void shouldNotCreateSavingAccountWhenIdNegative () {
        assertThrows(
                IllegalArgumentException.class,
                () -> new SavingAccount(-1, new Client(1, "Cl_1"),100)
        );
    }

    @Test
    public void shouldNotCreateSavingAccountWhenIdCorrect () {
        assertDoesNotThrow(
                () -> new SavingAccount(1, new Client(1, "Cl_1"),100)
        );
    }

    // Client
    @Test
    public void shouldNotCreateSavingAccountWhenClientNull () {
        assertThrows(
                IllegalArgumentException.class,
                () -> new SavingAccount(1, new Client(1, null),100)
        );
    }

    @Test
    public void shouldNotCreateSavingAccountWhenClientCorrect () {
        assertDoesNotThrow(
                () -> new SavingAccount(1, new Client(1, "Cl_Correct"),100)
        );
    }

    // amount
    @Test
    public void shouldNotCreateSavingAccountWhenAmountZero () {
        assertThrows(
                IllegalArgumentException.class,
                () -> new SavingAccount(1, new Client(1, "Cl_1"),0)
        );
    }

    @Test
    public void shouldNotCreateSavingAccountWhenAmountNegative () {
        assertThrows(
                IllegalArgumentException.class,
                () -> new SavingAccount(1, new Client(1, "Cl_1"),-1)
        );
    }

    @Test
    public void shouldNotCreateSavingAccountWhenAmountCorrect () {
        assertDoesNotThrow(
                () -> new SavingAccount(1, new Client(1, "Cl_1"),100)
        );
    }
}
