package AutoBoxingChallenge;

import java.util.Scanner;

/**
 * Created by robertsg on 12/11/2015.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        Customer test = new Customer(123, "John", 123456789);
        Branch.customerArrayList.add(test);
        test.deposit(20.0);

        System.out.println("Welcome to the Banking Deluxe Program");
        System.out.println("Please select your option");
        System.out.println("Instructions are option 0");

        while (!quit) {
            System.out.println("\n-| Current Location: Admin panel");
            int option = scanner.nextInt();

            switch (option) {
                case 0:
                    printAdminInstructions();
                    break;
                case 1:
                    displayBankMenu();
                    break;
                case 2:
                    displayBranchMenu();
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Please select a valid option. Hit 0 for instructions.");
                    break;
            }
        }
    }

    public static void printAdminInstructions() {
        System.out.println(
                "-| 0: Print Instructions\n"
                        + "-| 1: Login to Bank menu\n"
                        + "-| 2: Login to Branch menu\n"
                        + "-| 3: Logout");
    }

    private static void displayBankMenu() {
        Bank newBank = new Bank();
        newBank.bankMenu();
    }

    private static void displayBranchMenu() {
        Branch newBranch = new Branch();
        newBranch.branchMenu();
    }
}
