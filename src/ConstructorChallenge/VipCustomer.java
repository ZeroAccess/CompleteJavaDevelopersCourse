package ConstructorChallenge;

/**
 * Created by robertsg on 11/24/2015.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        //Setting Default Parameters
        this("Unknown VIP Name", 50000.00 , "Unknown VIP Email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit,"JohnSmith@default.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}