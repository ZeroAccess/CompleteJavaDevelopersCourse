package Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many players are there?");
        int inNumOfPlayers = input.nextInt();

        for(int i = inNumOfPlayers; i > 0; i--) {
            System.out.println("What is your name?");
            String playerName = input.next();

            System.out.println("What was your score?");
            int score = input.nextInt();

            int highScore = calculateScore(true, score);
            int position = calculateHighScorePosition(highScore);

            displayHighScorePosition(playerName, position);
            System.out.println("Your final score was " + highScore);
            inNumOfPlayers--;
        }
    }

    public static int calculateScore(boolean gameOver, int score) {
        if (gameOver) {
            int finalScore = score * (int)(Math.random() * 11);;
            return finalScore;
        }
        return -1;
    }

    //Challenge

    public static void displayHighScorePosition(String playerName, int position) {
            System.out.println(playerName + " managed to get into position: " + position);
    }

    public static int calculateHighScorePosition(int highScore) {
        if (highScore >= 5000){
            return 1;
        } else if (highScore >= 4000 && highScore < 5000){
            return 2;
        } else if (highScore >= 2000 && highScore < 4000) {
            return 3;
        } else {
            return 4;
        }
    }
}
