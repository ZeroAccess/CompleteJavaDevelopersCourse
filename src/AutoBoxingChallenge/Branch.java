package AutoBoxingChallenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robertsg on 12/11/2015.
 */
public class Branch {
    static ArrayList<Customer> customerArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private double accountNumber;
    private String branchName;

    public Branch() {

    }

    public Branch(int accountNumber, String branchName) {
        this.accountNumber = accountNumber;
        this.branchName = branchName;
    }

    public static Branch createBranch(int accountNumber, String name) {
        return new Branch(accountNumber, name);
    }

    public static double findCustomer(String name) {
        for (int i = 0; i < customerArrayList.size(); i++) {
            Customer newCustomer = customerArrayList.get(i);
            if (name.equals(newCustomer.getName())) {
                return newCustomer.getAccountNumber();
            }
        }
        return -1;
    }

    public void branchMenu() {
        boolean quit = false;

        while (!quit) {
            System.out.println("\n-| Current Location: Branch panel");
            int option = scanner.nextInt();

            switch (option) {
                case 0:
                    printBranchInstructions();
                    break;
                case 1:
                    createCustomer();
                    break;
                case 2:
                    listCustomers();
                    break;
                case 3:
                    listCustomersWithTransactions();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Please select a valid option. Hit 0 for instructions.");
                    break;
            }
        }
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public String getBranchName() {
        return branchName;
    }

    private void printBranchInstructions() {
        System.out.println(
                "-| 0: Print Instructions\n"
                        + "-| 1: Create Customer\n"
                        + "-| 2: List Customers\n"
                        + "-| 3: List Customers with Transactions\n"
                        + "-| 4: Go Back");
    }

    private void createCustomer() {
        scanner.useDelimiter("\\n");
        System.out.println("Enter customers account number");
        accountNumber = scanner.nextDouble();
        System.out.println("Enter customers name");
        String name = scanner.next();
        System.out.println("Enter customers initial balance");
        double initialAmount = scanner.nextDouble();
        Customer newCustomer = new Customer(accountNumber, name, initialAmount);
        if (findCustomer(name) >= 0) {
            System.out.println("Customer is already on file");
        } else {
            customerArrayList.add(newCustomer);
            System.out.println("Customer " + name + " with balance of " + initialAmount + " has been created.");
        }
    }

    private void listCustomers() {
        for (int i = 0; i < customerArrayList.size(); i++) {
            Customer newCustomer = customerArrayList.get(i);
            System.out.println("Customer: " + newCustomer.getName());
        }
    }

    private void listCustomersWithTransactions() {
        Customer newCustomer = new Customer();
        newCustomer.viewTransactions();
    }
}

