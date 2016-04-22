package InterfacesChallenge;

import java.util.Scanner;

/**
 * Created by robertsg on 4/21/2016.
 */
public class Main {
    static boolean gameMode = false;

    public static void main(String[] args) {
        Player player1 = new Player("Calix", 100, "sword");
        Monster monster1 = new Creeper("creeper", 40);
        runGame(player1, monster1);
    }

    private static void runGame(Player player, Monster monster) {
        Scanner scanner = new Scanner(System.in);

        int index = 0;

        System.out.println("Choose\n" +
                "1 to hit monster\n" +
                "2 to hit player\n" +
                "0 to quit");

        while (!gameMode) {
            System.out.println("Choose an option: ");
            int playerChoice = scanner.nextInt();
            scanner.nextLine();
            switch (playerChoice) {
                case 0:
                    gameMode = true;
                    System.out.println("The game has been ended and saved");
                    break;
                case 1:
                    player.dealDamage(player, monster);
                    System.out.println(player.getName() + " hit the " + monster.type + " with " + player.getWeapon() + " " + monster.type + "now has " + monster.getHealth() + " health");
                    checkHealth(player, monster);
                    break;
                case 2:
                    player.setHealth(20);
                    System.out.println(monster.type + " hit " + player.getName() + " now has " + player.getHealth() + " health");
                    checkHealth(player, monster);
                    break;
            }
        }
        System.out.println("Play Again?");
    }

    private static void checkHealth(Player player, Monster monster) {
        if (player.getHealth() <= 0) {
            System.out.println("You have lost");
            gameMode = true;
        } else if (monster.getHealth() <= 0) {
            System.out.println("You won!");
            gameMode = true;
        }
    }

//    public static ArrayList<String> readValues() {
//        ArrayList<String> values = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        int index = 0;
//        System.out.println("Choose\n" +
//        "1 to enter a string\n" +
//        "0 to quit");
//
//        while(!quit) {
//            System.out.println("Choose an option: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    System.out.println("Enter a string: ");
//                    String stringInput = scanner.nextLine();
//                    values.add(index, stringInput);
//                    index++;
//                    break;
//            }
//        }
//        return values;
//    }
}
