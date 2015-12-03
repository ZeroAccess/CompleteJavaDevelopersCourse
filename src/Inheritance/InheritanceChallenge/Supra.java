package Inheritance.InheritanceChallenge;

/**
 * Created by robertsg on 11/25/2015.
 */
public class Supra extends Toyota {
    private boolean targaRoof;
    private boolean turbo;

    public Supra(int year, int steering, int gear,boolean isManual, int move, String make, String model, String trim, String color,
                 int wheels, int windows, int doors, double  engine, boolean targaRoof, boolean turbo) {
        super(year, steering, gear, isManual, move, make, model, trim, color, wheels, windows, doors, engine);
        this.targaRoof = targaRoof;
        this.turbo = turbo;
    }

    public String isTargaRoof() {
        if(targaRoof) {
            return "targa roof equipped";
        }else{
            return "";
        }
    }

    public void setTargaRoof(boolean targaRoof) {
        this.targaRoof = targaRoof;
    }

    public String isTurbo() {
        if (turbo) {
            return "turbo";
        } else {
            return "";
        }
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

}
