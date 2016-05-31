package AbstractClasses;

/**
 * Created by robertsg on 5/31/2016.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Shinobi");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Australian Ring Neck");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
