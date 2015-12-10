package ArrayListChallenge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robertsg on 12/9/2015.
 */
public class ContactsMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

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
                case 7:
                    saveContactList();
                    break;
                case 8:
                    loadContactList();
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
        System.out.println("\t 5 - Display Contact Information");
        System.out.println("\t 6 - Close Contacts");
        System.out.println("\t 7 - Save Contacts");
    }

    private static void displayAllContacts() {
        System.out.println("You have " + contactsArrayList.size() + " contacts");
        for (Contacts contacts : contactsArrayList) {
            System.out.println((contacts.getFirstName() + " " + contacts.getLastName()));
        }
    }

    private static void addContact() {
        System.out.println("Enter Contact Information");
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Mobile Number: ");
        int mobilePhoneNumber = scanner.nextInt();
        System.out.print("Enter Home Number: ");
        int homePhoneNumber = scanner.nextInt();
        System.out.println("Enter some notes: ");
        String notes = scanner.nextLine();
        scanner.nextLine();
        contactsArrayList.add(new Contacts(firstName, lastName, mobilePhoneNumber, homePhoneNumber, notes));
    }

    private static void modifyContact() {
        System.out.println("Please select contact you would like to change");
        String nameToModify = scanner.nextLine();
        for (Contacts contacts : contactsArrayList) {
            if (contacts.getFirstName().equals(nameToModify)) {
                int index = contactsArrayList.indexOf(contacts);
                System.out.println("We are going to modify " + contacts.getFirstName() + " " + contacts.getLastName());
                if (index >= 0) {
                    System.out.println("Enter Contact Information");
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Mobile Number: ");
                    int mobilePhoneNumber = scanner.nextInt();
                    System.out.print("Enter Home Number: ");
                    int homePhoneNumber = scanner.nextInt();
                    System.out.println("Enter some notes: ");
                    String notes = scanner.nextLine();
                    scanner.nextLine();
                    contactsArrayList.set(index, new Contacts(firstName, lastName, mobilePhoneNumber, homePhoneNumber, notes));
                }
            }
        }
        System.out.println("Enter new contact information");
    }

    private static void removeContact() {
        System.out.println("Please select contact you would like to remove");
        String nameToRemove = scanner.nextLine();
        outerloop:
        for (Contacts contacts : contactsArrayList) {
            if (contacts.getFirstName().equals(nameToRemove)) {
                int index = contactsArrayList.indexOf(contacts);
                System.out.println("We're going to remove " + contacts.getFirstName() + " " + contacts.getLastName());
                System.out.println("Type 'yes' to continue");
                String verify = scanner.nextLine();
                if (verify.matches("yes")) {
                    contactsArrayList.remove(index);
                    System.out.println(nameToRemove + " has been removed.");
                    break outerloop;
                }
            }
        }
    }

    private static void displayContact() {
        System.out.println("Enter name of person you would like to view");
        String nameToRetrieve = scanner.nextLine();
        for (Contacts contacts : contactsArrayList) {
            if (contacts.getFirstName().equals(nameToRetrieve)) {
                int index = contactsArrayList.indexOf(contacts);
                System.out.println(contacts.getFirstName() + " " + contacts.getLastName() + "\n Mobile: " + contacts.getMobilePhoneNumber()
                        + "\n Home: " + contacts.getHomePhoneNumber() + "\n Notes: " + contacts.getNotes());
            }
        }
    }

    private static void saveContactList() {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dataForArrayListChallenge.txt")));
            for (Contacts contacts : contactsArrayList) {
                out.println(contacts.getFirstName() + " " + contacts.getLastName() + "\n Mobile: " + contacts.getMobilePhoneNumber()
                        + "\n Home: " + contacts.getHomePhoneNumber() + "\n Notes: " + contacts.getNotes());
            }
            out.close();
            System.out.println("Data has been saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadContactList() {
        //TODO Finish This!
        System.out.println("Got a headache, going home");
    }
}

