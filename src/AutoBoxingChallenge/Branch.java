package AutoBoxingChallenge;

import java.util.ArrayList;

/**
 * Created by robertsg on 12/11/2015.
 */
public class Branch {
    ArrayList<Customer> customerArrayList = new ArrayList<>();
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    private void createCustomer(String name, Double initialAmount) {
        Customer newCustomer = new Customer(name, initialAmount);
    }
}
