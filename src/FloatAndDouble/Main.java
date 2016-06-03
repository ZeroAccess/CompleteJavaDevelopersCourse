package FloatAndDouble;

public class Main {
    public static void main(String[] args) {

        //width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3;

        //width of double = 62 (8 bytes)
        double myDoubleValue = 5d / 3;

        /*
        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);
        */

        //Challenge
        double myValuePounds = 200d;
        double kilograms = 0.45359237d;

        double calculation = myValuePounds * kilograms;

        System.out.print(myValuePounds + "  pounds is equal to " + calculation + " kilograms.");
    }
}
