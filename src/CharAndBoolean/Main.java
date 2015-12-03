package CharAndBoolean;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2 bytes)
        char myCopyrightChar = '\u00A9';
        System.out.println("The Copyright symbols is " + myCopyrightChar);

        //Challenge
        char myRegisteredChar = '\u00AE';
        System.out.println("The Registered symbol is " + myRegisteredChar);
    }
}
