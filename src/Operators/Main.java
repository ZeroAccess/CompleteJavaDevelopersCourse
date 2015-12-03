package Operators;

/**
 * Created by robertsg on 11/19/2015.
 */
public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;


        double firstValue = 20d;
        double secondValue = 80d;
        double resultValue = (firstValue + secondValue) * 25;
        double theRemainder = resultValue % 2300;

        if (theRemainder <= 200) {
            System.out.println("Remainder Value : " + theRemainder);
            System.out.println("Total was over the limit");
        }

    }
}
