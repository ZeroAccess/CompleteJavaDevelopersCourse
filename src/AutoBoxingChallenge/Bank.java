package AutoBoxingChallenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robertsg on 12/11/2015.
 */
public class Bank {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Branch> branchesArrayList = new ArrayList<>();

    public void bankMenu() {
        boolean quit = false;

        while (!quit) {
            System.out.println("\n-| Current Location: Bank panel");
            printBankInstructions();
            int option = scanner.nextInt();

            switch (option) {
                case 0:
                    printBankInstructions();
                    break;
                case 1:
                    createBranch();
                    break;
                case 2:
                    createCustomer();
                    break;
                case 3:
                    listBranches();
                    break;
                case 4:
                    listCustomers();
                    break;
                case 5:
                    listCustomersWithTransactions();
                    break;
                case 6:
                    listCustomersWithBranches();
                    break;
                case 7:
                    transferCustomer();
                    break;
                case 8:
                    deposit();
                    break;
                case 9:
                    withdraw();
                    break;
                case 10:
                    quit = true;
                    break;
                default:
                    System.out.println("Please select a valid option. Hit 0 for instructions.");
                    break;
            }
        }
    }

    private void printBankInstructions() {
        System.out.println(
                "-| 0: Print Instructions\n"
                        + "-| 1: Create Branch\n"
                        + "-| 2: Create Customer\n"
                        + "-| 3: List Branches\n"
                        + "-| 4: List Customers\n"
                        + "-| 5: List Customer with transactions\n"
                        + "-| 6: List Customer with branches\n"
                        + "-| 7: Transfer Customer to different branch\n"
                        + "-| 8: Deposit\n"
                        + "-| 9: Withdraw\n"
                        + "-| 10: Quit");
    }

    private void createBranch() {
        scanner.useDelimiter("\\n");
        System.out.println("Enter Branch's Account Number");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter Branch's Name");
        String name = scanner.next();
        if (findBranch(name) >= 0 || findBranch(accountNumber) >= 0) {
            System.out.println("Branch is already on file");
        } else {
            branchesArrayList.add(new Branch(accountNumber, name));
            System.out.println("Branch " + name + " has been created.");
        }
    }

    private double findBranch(String branchName) {
        for (int i = 0; i < branchesArrayList.size(); i++) {
            Branch branch = branchesArrayList.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    private double findBranch(double accountNumber) {
        for (int i = 0; i < branchesArrayList.size(); i++) {
            Branch branch = branchesArrayList.get(i);
            if (branch.getAccountNumber() == accountNumber) {
                return i;
            }
        }
        return -1;
    }

    private void listBranches() {
        for (Branch branch : branchesArrayList) {
            System.out.println("Branch: " + branch.getBranchName());
        }
    }

    private void createCustomer() {
        scanner.useDelimiter("\\n");
        System.out.println("What Branch are we adding the customer to");
        String branchAccountNumberString = scanner.next();
        System.out.println("Enter customers account number");
        Double accountNumber = scanner.nextDouble();
        System.out.println("Enter customers name");
        String name = scanner.next();
        System.out.println("Enter customers initial balance");
        double initialAmount = scanner.nextDouble();
        double branchAccountNumber = findBranch(branchAccountNumberString);

        if (findBranch(branchAccountNumber) >= 0 && findCustomer(name) >= 0) {
            System.out.println("Customer is already on file for that Branch");
        } else {
            for (Branch branch : branchesArrayList) {
                if (branch.getAccountNumber() >= 0 && branch.getBranchName().contains(branchAccountNumberString)) {
                    Customer newCustomer = new Customer(name, initialAmount);
                    branch.setCustomerArrayList(newCustomer);
                    System.out.println("Customer " + name + " at branch " + branchAccountNumberString + " with balance of "
                            + initialAmount + " has been created.");
                    break;
                }
            }
        }
    }

    private double findCustomer(String name) {
        for (Branch branch : branchesArrayList) {
            if (branch.getCustomerArrayList().contains(name)) {
                return branch.getCustomerArrayList().indexOf(name);
            }
        }
        return -1;
    }

    private Customer isCustomerAtBranch(String branchName, String customerName) {
        for (Branch branch : branchesArrayList) {
            if (branchName.equals(branch.getBranchName())) {
                for (Customer customer : branch.getCustomerArrayList()) {
                    if (customerName.equals((customer.getName()))) {
                        return customer;
                    }
                }
            }
        }
        return null;
    }

    private void listCustomers() {
        for (Branch branch : branchesArrayList) {
            for (Customer customer : branch.getCustomerArrayList()) {
                System.out.println(customer.getName());
            }
        }
    }

    private void listCustomersWithBranches() {
        for (Branch branch : branchesArrayList) {
            System.out.println("Branch: " + branch.getBranchName());
            for (Customer customer : branch.getCustomerArrayList()) {
                System.out.println("               " + customer.getName());
            }
        }
    }

    private void listCustomersWithTransactions() {
        viewTransactions();
    }

    private void transferCustomer() {
        System.out.println("Transfer Customer -> called. No other action is in here.");
    }

    private void deposit() {
        scanner.useDelimiter("\\n");
        System.out.println("What's your home branch?");
        String branchName = scanner.next();
        System.out.println("What's your name?");
        String customerName = scanner.next();
        Customer customer = isCustomerAtBranch(branchName, customerName);
        if (customer != null) {
            System.out.println("How much would you like to deposit?");
            double depositAmount = scanner.nextDouble();
            customer.depositTransactionsArrayList(depositAmount);

        } else {
            System.out.println("We couldn't find you at that branch.");
        }
    }

    private void withdraw() {
        scanner.useDelimiter("\\n");
        System.out.println("What's your home branch?");
        String branchName = scanner.next();
        System.out.println("What's your name?");
        String customerName = scanner.next();
        Customer customer = isCustomerAtBranch(branchName, customerName);
        if (customer != null) {
            System.out.println("How much would you like to withdraw?");
            double withdrawAmount = scanner.nextDouble();
            customer.withdrawTransactionsArrayList(withdrawAmount);

        } else {
            System.out.println("We couldn't find you at that branch.");
        }
    }

    private void viewTransactions() {
        scanner.useDelimiter("\\n");
        System.out.println("What's your home branch?");
        String branchName = scanner.next();
        System.out.println("What's your name?");
        String customerName = scanner.next();
        Customer customer = isCustomerAtBranch(branchName, customerName);
        if (customer != null) {
            System.out.println(customer.getTransactionsArrayList());
        } else {
            System.out.println("We couldn't find you at that branch.");
        }

    }

    public ArrayList<Branch> getBranchesArrayList() {
        return branchesArrayList;
    }

    public void setBranchesArrayList(Branch branch) {
        branchesArrayList.add(branch);
    }
}
