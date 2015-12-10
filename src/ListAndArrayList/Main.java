package ListAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robertsg on 12/9/2015.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - Print choice options.");
        System.out.println("\t 1 - Print list");
        System.out.println("\t 2 - Add Item");
        System.out.println("\t 3 - Modify Item");
        System.out.println("\t 4 - Remove Item");
        System.out.println("\t 5 - Search Item");
        System.out.println("\t 6 - Process ArrayList");
        System.out.println("\t 7 - Quit");
    }

    public static void addItem() {
        System.out.println("Enter grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println("Item not found.");
        }
    }

    public static void processArrayList() {
        //Both of these do the same thing
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        //Converting an ArrayList to an Array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
