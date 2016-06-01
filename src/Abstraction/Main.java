package Abstraction;

/**
 * Created by robertsg on 5/31/2016.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Shinobi");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian Ring Neck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
    }
}
