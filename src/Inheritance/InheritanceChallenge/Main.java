package Inheritance.InheritanceChallenge;

/**
 * Created by robertsg on 11/25/2015.
 */
public class Main {
    public static void main(String[] args) {
        Supra suzyQ = new Supra(1997, 0, 0,true, 0, "Toyota" ,"Supra", "Sport", "white", 4, 2, 2, 4.7,true,true);

        System.out.println("This " + suzyQ.getYear() + " " + suzyQ.getMake() + " " + suzyQ.getModel() + " " + suzyQ.getTrim() + " " + suzyQ.isTurbo() + " " + suzyQ.isManual() + " has " + suzyQ.getColor() + " paint," + suzyQ.getWheels() + " wheels," + suzyQ.getWindows() + " windows," + suzyQ.getDoors() + " doors,a " + suzyQ.getEngine() + " engine, and is " + suzyQ.isTargaRoof() + ".");
        System.out.println("The " + suzyQ.getModel() + " is in " + suzyQ.getGear() + ".");
        System.out.println("Let's shift to 6th gear");
        suzyQ.setUpShift(true,6);
        System.out.println("The " + suzyQ.getModel() + " is in " + suzyQ.getGear() + ".");
        suzyQ.setDownShift(true,1);
        System.out.println("Let's shift to 1st gear");
        System.out.println("The " + suzyQ.getModel() + " is in " + suzyQ.getGear() + ".");
    }
}
