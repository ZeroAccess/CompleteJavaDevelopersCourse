package ByteShortInt;

public class Main {

    public static void main(String[] args) {

        //Since Java 1.7 you can use underscores to make large numbers more readable

        //byte has a width of 8
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;

        //short has a width of 16
        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;


        //int has a width of 32
        int myIntMinValue = -2_147_483_648;
        int myIntMaxValue = 2_147_483_647;

        //long has a width of 64
        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;

        //Challenge
        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println("My long value equation is equal to " + myLongValue);
    }
}