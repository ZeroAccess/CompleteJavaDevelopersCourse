package Inheritance;

/**
 * Created by robertsg on 11/24/2015.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Alaskan Malamute", 10,100,2,4,1,20,"tons of fur");
        //dog.eat();
        dog.walk();
        //dog.run();

        Fish fish = new Fish("Shark",5,5,2,2,4);
        fish.swim(5);
    }
}
