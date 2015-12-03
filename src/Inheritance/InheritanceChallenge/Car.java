package Inheritance.InheritanceChallenge;

/**
 * Created by robertsg on 11/25/2015.
 */
public class Car extends Vehicle {
    private String make;
    private String model;
    private String trim;
    private String color;
    private int wheels;
    private int windows;
    private int doors;
    private double engine;

    public Car(int year, int steering, int gear, boolean isManual, int move, String make, String model, String trim, String color,
               int wheels, int windows, int doors, double engine) {
        super(year, steering, gear, isManual, move);
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.color = color;
        this.wheels = wheels;
        this.windows = windows;
        this.doors = doors;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
