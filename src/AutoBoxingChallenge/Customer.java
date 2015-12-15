package AutoBoxingChallenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robertsg on 12/11/2015.
 */
public class Customer {
    ArrayList<Double> transactionsArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private double accountNumber;
    private String name;
    private Double initialAmount;

    public Customer() {

    }

    public Customer(double accountNumber, String name, double initialAmount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.initialAmount = initialAmount;
    }

    public void deposit(Double depositAmount) {
        /* Lock the accountBalance verify last amount of viewTransactions with the amount before the deposit then verify
           that the amount with the deposit added is equal to viewTransactions + Deposit. If not return to try again.
         */
        transactionsArrayList.add(depositAmount);

    }

    private void withdraw(Double withdrawAmount) {
        /* Lock the accountBalance verify last amount of viewTransactions with the amount before the withdrawal then
           verify that the amount with the withdrawal removed is equal to viewTransactions - withdrawal. If not return
           to try again.
        */
        transactionsArrayList.add(-withdrawAmount);
    }

    public void viewTransactions() {
        System.out.println("Who's transactions would you like to see?");
        String name = scanner.nextLine();
        double accountNumber = Branch.findCustomer(name);
        if (accountNumber >= 0) {
            System.out.println("If Statement inside view Transactions -> called");
            for (int i = 0; i < transactionsArrayList.size(); i++) {
                System.out.println("Transactions: " + this.transactionsArrayList.get(i));
            }
        } else {
            System.out.println("There is no account for that person");
        }

    }

    public ArrayList<Double> getTransactions() {
        return transactionsArrayList;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public Double getInitialAmount() {
        return initialAmount;
    }
}
