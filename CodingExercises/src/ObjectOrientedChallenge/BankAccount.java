package ObjectOrientedChallenge;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + accountBalance);
    }
    public void withdrawFunds(double withdrawalAmount) {
        if(accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + accountBalance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void describeBankAccount() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getAccountBalance());
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhoneNumber());
    }

}
