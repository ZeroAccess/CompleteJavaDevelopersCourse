package IfKeywordAndCodeBlocks;

/**
 * Created by robertsg on 11/19/2015.
 */
public class Main {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was lower than 5000 but above 1000");
//        } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got Here");
//        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            int savedFinalScore = finalScore;
        }

        //Challenge
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}