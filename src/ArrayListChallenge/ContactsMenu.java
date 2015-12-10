package ArrayListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robertsg on 12/9/2015.
 */
public class ContactsMenu {
    static Scanner scanner = new Scanner(System.in);

    ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

    public static void displayMenu() {
        boolean quit = false;
        printInstructions();

        while (!quit) {
            System.out.println("\nContacts Menu");
            System.out.println("Select 0 for instructions");
            int selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    displayAllContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    displayContact();
                    break;
                case 6:
                    quit = true;
                    MobilePhone.timerDelay(3);
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\n Press # for option");
        System.out.println("\t 0 - Print choice options.");
        System.out.println("\t 1 - Display All Contacts");
        System.out.println("\t 2 - Add Contact");
        System.out.println("\t 3 - Modify Contact");
        System.out.println("\t 4 - Remove Contact");
        System.out.println("\t 5 - Display Contacts Information");
        System.out.println("\t 6 - Close Contacts");
    }

    private static void displayAllContacts() {

    }

    private static void addContact() {

    }

    private static void modifyContact() {

    }

    private static void removeContact() {

    }

    private static void displayContact() {

    }
}
