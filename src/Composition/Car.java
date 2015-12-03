package Composition;

/**
 * Created by robertsg on 11/30/2015.
 */
public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Car(String name, int engineCapacity, int doors) {
        super(name);
        this.engineCapacity = engineCapacity;
        this.doors = doors;
    }
}
