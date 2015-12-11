package AutoBoxingChallenge;

import java.util.ArrayList;

/**
 * Created by robertsg on 12/11/2015.
 */
public class Customer {
    ArrayList<Double> transactions = new ArrayList<>();
    private String customerName;
    private Double initialAmount;

    public Customer(String customerName, Double initialAmount) {
        this.customerName = customerName;
        this.initialAmount = initialAmount;
    }

    private void deposit(Double depositAmount) {
        /* Lock the accountBalance verify last amount of viewTransactions with the amount before the deposit then verify
           that the amount with the deposit added is equal to viewTransactions + Deposit. If not return to try again.
         */
        transactions.add(depositAmount);
    }

    private void withdraw(Double withdrawAmount) {
        /* Lock the accountBalance verify last amount of viewTransactions with the amount before the withdrawal then
           verify that the amount with the withdrawal removed is equal to viewTransactions - withdrawal. If not return
           to try again.
        */
        transactions.add(withdrawAmount);
    }

    private void viewTransactions() {

    }


}
