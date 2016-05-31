package AbstractClasses;

/**
 * Created by robertsg on 5/31/2016.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
