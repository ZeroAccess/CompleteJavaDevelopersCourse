package Inheritance.InheritanceChallenge;

/**
 * Created by robertsg on 11/25/2015.
 */
public class Vehicle {
    private int year;
    private int steering;
    private int gear;
    private int move;
    private boolean isManual;
    private boolean upShift;
    private boolean downShift;
    private String gearString = "neutral";

    public Vehicle() {
    }

    public Vehicle(int year, int steering, int gear,boolean isManual, int move) {
        this.year = year;
        this.steering = steering;
        this.gear = gear;
        this.isManual = isManual;
        this.move = move;
        this.isManual = isManual;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public String isManual() {
        if(isManual) {
            return "manual";
        } else {
            return "automatic";
        }
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int setUpShift(boolean upShift, int gear) {
        if(upShift) {
            return setGear(gear);
        } else {
            return -1;
        }
    }
    public int setDownShift(boolean downShift, int gear) {
        if(downShift) {
            return setGear(gear);
        } else {
            return -1;
        }
    }

    public int setGear(int gear) {
        gearToString(gear);
        return gear;
    }

    public void gearToString(int gear) {
        switch (gear) {
            case 0:
                gearString = "neutral";
                break;
            case 1:
                gearString = "1st gear";
                break;
            case 2:
                gearString = "2nd gear";
                break;
            case 3:
                gearString = "3rd gear";
                break;
            case 4:
                gearString = "4th gear";
                break;
            case 5:
                gearString = "5th gear";
                break;
            case 6:
                gearString = "6th gear";
                break;
            case 7:
                gearString = "7th gear";
                break;
            case 8:
                gearString = "8th gear";
                break;
            case 9:
                gearString = "9th gear";
                break;
        }
    }
    public String getGear(){
        return this.gearString;
    }
}
