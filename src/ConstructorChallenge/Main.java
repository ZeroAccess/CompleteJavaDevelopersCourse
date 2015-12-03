package ConstructorChallenge;

import java.util.Scanner;

/**
 * Created by robertsg on 11/23/2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Account testAccount = new Account(12345, 0.00, "John Snow", "JohnSnowLives@got.com", 123-456-7789);

        System.out.println("Thanks " + testAccount.getCustomerName() + " for banking with us." + "");
        System.out.println("Account " + testAccount.getNumber() + " current balance is $" + testAccount.getBalance());

        System.out.println("Now let's deposit a little money into that account. How much would you like to deposit?");

        double addFundsEntered = scan.nextDouble();
        testAccount.addFunds(addFundsEntered);


        System.out.println("Now let's withdraw some of the money. How much would you like to withdraw?");
        double removeFundsEntered = scan.nextDouble();
        testAccount.withdrawFunds(removeFundsEntered);


        System.out.println("Testing VIP Constructors");

        VipCustomer testVipCustomer = new VipCustomer();
        System.out.println("Default VipCustomer");
        System.out.println("Thanks for banking with us " + testVipCustomer.getName() + " your credit limit is "
                + testVipCustomer.getCreditLimit() + "and your email on file is " + testVipCustomer.getEmailAddress());

        VipCustomer testVipCustmer2 = new VipCustomer("John Smith", 10000.00);
        System.out.println("VipCustomer with 2 parameters");
        System.out.println("Thanks for banking with us " + testVipCustmer2.getName() + " your credit limit is "
                + testVipCustmer2.getCreditLimit() + "and your email on file is " + testVipCustmer2.getEmailAddress());

        VipCustomer testVipCustmer3 = new VipCustomer("John Snow", 20000.00, "JohnSnow@got.com");
        System.out.println("VipCustomer with 3 parameters");
        System.out.println("Thanks for banking with us " + testVipCustmer3.getName() + " your credit limit is "
                + testVipCustmer3.getCreditLimit() + "and your email on file is " + testVipCustmer3.getEmailAddress());
    }
}