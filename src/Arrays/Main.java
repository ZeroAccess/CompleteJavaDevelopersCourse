package Arrays;

/**
 * Created by robertsg on 12/3/2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[20];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ",value is " + array[i]);
        }
    }
}


