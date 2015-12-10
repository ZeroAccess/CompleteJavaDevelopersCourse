package ArrayListChallenge;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by robertsg on 12/9/2015.
 */
public class MobilePhone {

    public static void go() {
        boolean quit = false;
        System.out.println("Welcome to your awesome phone");
        Scanner scanner = new Scanner(System.in);


        while (!quit) {
            System.out.println("Select what application you want to run");
            System.out.println("0 - Contacts");
            System.out.println("1 - An Amazing Game!");
            System.out.println("2 - Shut Down");

            int selection = scanner.nextInt();

            switch (selection) {
                case 0:
                    displayContactsMenu();
                    break;
                case 1:
                    playGames();
                    break;
                case 2:
                    quit = true;
                    shutdown();
                    break;
            }
        }
    }

    public static void displayContactsMenu() {
        ContactsMenu.displayMenu();
    }

    public static void playGames() {
        //Can't have a phone and not play a game!!!
        System.out.println("You lost the game...didn't even realize ya played right!?");
        timerDelay(3);
    }

    public static void timerDelay(int time) {
        try {
            System.out.println("Loading...");
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {

        }
    }

    public static void shutdown() {
        System.out.println("System Shutting Down");
    }
}
