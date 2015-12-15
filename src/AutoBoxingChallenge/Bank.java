package AutoBoxingChallenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robertsg on 12/11/2015.
 */
public class Bank {
    static Scanner scanner = new Scanner(System.in);
    public ArrayList<Branch> branchesArrayList = new ArrayList<>();
    public String name;

    public void bankMenu() {
        boolean quit = false;

        while (!quit) {
            System.out.println("\n-| Current Location: Bank panel");
            int option = scanner.nextInt();

            switch (option) {
                case 0:
                    printBankInstructions();
                    break;
                case 1:
                    createBranch();
                    break;
                case 2:
                    listBranches();
                    break;
                case 3:
                    transferCustomer();
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

    public void printBankInstructions() {
        System.out.println(
                "-| 0: Print Instructions\n"
                        + "-| 1: Create Branch\n"
                        + "-| 2: List Branches\n"
                        + "-| 3: Transfer Customer\n"
                        + "-| 4: Go back");
    }

    private void createBranch() {
        scanner.useDelimiter("\\n");
        System.out.println("Enter Branch's Account Number");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter Branch's Name");
        String name = scanner.next();
        Branch newBranch = Branch.createBranch(accountNumber, name);
        System.out.println("Acc: " + accountNumber + " Name: " + name);
        if (findBranch(name) >= 0 || findBranch(accountNumber) >= 0) {
            System.out.println("Branch is already on file");
        } else {
            branchesArrayList.add(newBranch);
            System.out.println("Branch " + name + " has been created.");
        }
    }

    public int findBranch(Branch branch) {
        System.out.println(this.branchesArrayList.indexOf(branch));
        return this.branchesArrayList.indexOf(branch);
    }

    public int findBranch(String branchName) {
        for (int i = 0; i < branchesArrayList.size(); i++) {
            Branch branch = this.branchesArrayList.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public int findBranch(int accountNumber) {
        for (int i = 0; i < branchesArrayList.size(); i++) {
            Branch branch = this.branchesArrayList.get(i);
            if (branch.getAccountNumber() == accountNumber) {
                return i;
            }
        }
        return -1;
    }

    private void listBranches() {
        for (int i = 0; i < branchesArrayList.size(); i++) {
            Branch branch = this.branchesArrayList.get(i);
            System.out.println("Branch : " + branch.getBranchName());
        }
    }

    private void transferCustomer() {
        System.out.println("Transfer Customer -> called. No other action is in here.");
    }
}
