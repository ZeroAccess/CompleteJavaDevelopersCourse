package AutoBoxingChallenge;

import java.util.ArrayList;

/**
 * Created by robertsg on 12/11/2015.
 */
public class Branch {
    private ArrayList<Customer> customerArrayList = new ArrayList<>();
    private double accountNumber;
    private String branchName;

    public Branch(int accountNumber, String branchName) {
        this.accountNumber = accountNumber;
        this.branchName = branchName;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public String getBranchName() {
        return branchName;
    }


    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(Customer customer) {
        customerArrayList.add(customer);
    }
}

