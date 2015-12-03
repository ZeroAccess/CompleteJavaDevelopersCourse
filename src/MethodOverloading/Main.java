package MethodOverloading;

/**
 * Created by robertsg on 11/19/2015.
 */
public class Main {
    public static void main(String[] args) {
        calculateScore("Tim", 500);
        calculateScore(750);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " , score was " + score);
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unknown Player " + " , score was " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unknown Player and no score");
        return -1;
    }
}
