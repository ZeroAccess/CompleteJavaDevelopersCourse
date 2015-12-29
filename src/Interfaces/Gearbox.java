package Interfaces;

/**
 * Created by robertsg on 12/29/2015.
 */
public class Gearbox {
    private boolean clutchIsIn;

    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}
