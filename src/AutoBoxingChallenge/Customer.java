package AutoBoxingChallenge;

import java.util.ArrayList;
/**
 * Created by robertsg on 12/11/2015.
 */
public class Customer {
    private ArrayList<Double> transactionsArrayList = new ArrayList<>();
    private String name;
    private Double initialAmount;

    public Customer(String name, double initialAmount) {
        this.name = name;
        depositTransactionsArrayList(initialAmount);
    }

    public String getName() {
        return name;
    }

    public Double getInitialAmount() {
        return initialAmount;
    }

    public ArrayList<Double> getTransactionsArrayList() {
        return transactionsArrayList;
    }

    public void depositTransactionsArrayList(double deposit) {
        transactionsArrayList.add(deposit);
        System.out.println("You deposited " + deposit + " into your account.");
    }

    public void withdrawTransactionsArrayList(double withdraw) {
        transactionsArrayList.add(-withdraw);
        System.out.println("You removed " + withdraw + " from your account.");
    }
}
