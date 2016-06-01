package Abstraction;

/**
 * Created by robertsg on 5/31/2016.
 */
public class Parrot extends Bird implements CanFly {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
