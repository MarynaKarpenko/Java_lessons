package de.telran.practice;

public class TestAccount {
    public static void main(String[] args) {
        String badAccount = "59487687459322342";
        System.out.println("Account: " + badAccount + " is "
                + Accounts.isValidAccountNumber(badAccount));

        String goodAccount = "36473897462334";
        System.out.println("Account: " + goodAccount + " is "
                + Accounts.isValidAccountNumber(goodAccount));
    }
}
