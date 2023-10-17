package ObjectOrientedChallenge;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Random rand = new Random();
        int randomAccountNumber = rand.nextInt(9999999);
        bankAccount.setAccountNumber(randomAccountNumber);
        bankAccount.depositFunds(250.00);
        bankAccount.withdrawFunds(50);
        bankAccount.withdrawFunds(100.00);
        bankAccount.withdrawFunds(99.95);
        bankAccount.setCustomerName("Tracy Campbell");
        bankAccount.setEmail("email@gamil.com");
        bankAccount.setPhoneNumber("3072560891");

        bankAccount.describeBankAccount();
    }
}
