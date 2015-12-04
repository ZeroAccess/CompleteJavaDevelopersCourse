package ArraysChallenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by robertsg on 12/3/2015.
 */
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntegers(5);
        printArray(myIntArray);
        sort(myIntArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers to form Array.");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        return values;
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println("Element at index: " + i + " is " + values[i]);
        }
    }

    public static void sort(int[] myIntArray) {
        int[] mySortedArray = myIntArray;
        Arrays.sort(mySortedArray);
        reverse(mySortedArray);
        for (int i = 0; i < mySortedArray.length; i++) {
            System.out.println("Reverse sorted array element at index: " + i + " is " + mySortedArray[i]);
        }
    }

    public static void reverse(int[] array) {
        if (input == null || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i]; //swap numbers
            array[i] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }
}
