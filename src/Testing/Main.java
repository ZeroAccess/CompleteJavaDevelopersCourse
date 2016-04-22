package Testing;

import java.util.Scanner;

/**
 * Created by robertsg on 12/18/2015.
 * Trying to help explain how returns work
 */
public class Main {
    static String input;

    public static void main(String[] args) {
        System.out.println(input); //null value (nothing was initialized), you could initialize something if you wanted

        performMethod(); //We're going to go into the performMethod and set up our input

        //This runs after the performMethod completes so if you notice the input above is BEFORE the returns happened

        System.out.println("This is your return statement");
        System.out.println(input); //has return value
    }

    public static String performMethod() {
        //This is a method where it returns a String if it wasn't returning a String it'd say void or another type
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want I to be?");
        int i = scanner.nextInt();
        if (i > 0) {
            //return input = "Your input was greater than 0";   //Same exact thing as the below just split it so you can see
            input = "Your input was greater than 0";
            return input;
        } else {
            return input = "Your input was less than 0";
        }
    }
}
