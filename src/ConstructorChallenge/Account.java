package ConstructorChallenge;

/**
 * Created by robertsg on 11/23/2015.
 */
public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    public Account() {
        //Setting default
        this(123456789, 2.50, "Unknown Customer Name", "Unknown@unknown.com",555-555-5555);
    }

    public Account(int number, double balance, String customerName, String customerEmail, int customerPhoneNumber) {
        this.number = number;
        this.balance =  balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, int customerPhoneNumber) {
        //Setting number and balance by default and assigning the other variables
        this(99999,100.55, customerName, customerEmail, customerPhoneNumber);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void addFunds(double addFunds) {
        this.balance += addFunds;
        System.out.println("Added $" + addFunds + " your new account balance is $" + this.balance);
    }

    public void withdrawFunds(double removeFunds) {
        if (balance >= removeFunds) {
            this.balance -= removeFunds;
            System.out.println("Withdrew $" + removeFunds + " your new account balance is $" + this.balance);
        } else {
            System.out.println("You don't have enough money. Your current balance is $" + this.balance);
        }
    }
}