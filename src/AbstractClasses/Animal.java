package AbstractClasses;

/**
 * Created by robertsg on 5/31/2016.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void breath();

    public String getName() {
        return name;
    }
}