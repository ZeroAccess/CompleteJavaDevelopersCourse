package Inheritance.InheritanceChallenge;

/**
 * Created by robertsg on 11/25/2015.
 */
public class Toyota extends Car {

    private String make = "Toyota";

    public Toyota(int year, int steering, int gear, boolean isManual, int move, String make, String model, String trim, String color,
                  int wheels, int windows, int doors, double engine) {
        super(year, steering, gear, isManual, move, make, model, trim, color, wheels, windows, doors, engine);
    }

    @Override
    public String getMake() {
        return "Toyota";
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }
}
