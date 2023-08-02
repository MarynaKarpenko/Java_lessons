package de.telran.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {


    @Test
    void isValidAccountNumber_length14() {
        String badAccountLess14 = "734766778594";
        String badAccountMore14 = "7347667785941245";

        assertFalse(Accounts.isValidAccountNumber(badAccountLess14));
        assertFalse(Accounts.isValidAccountNumber(badAccountMore14));
    }
    @Test
    void isValidAccountNumber_allNumberNot0() {
        String badAccountAll0 = "00000000000000";

        assertFalse(Accounts.isValidAccountNumber(badAccountAll0));
    }
    @Test
    void isValidAccountNumber_allNumberNot0_NotEmpty() {
        assertFalse(Accounts.isValidAccountNumber(null));
        assertFalse(Accounts.isValidAccountNumber(""));
    }
    @Test
    void isValidAccountNumber_correct() {
        String goodAccount = "13984876564253";
        assertTrue(Accounts.isValidAccountNumber(goodAccount));
    }
}