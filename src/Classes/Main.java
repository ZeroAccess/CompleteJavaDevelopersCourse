package Classes;

/**
 * Created by robertsg on 11/23/2015.
 */
public class Main {
    public static void main(String[] args) {
        //Car names from Gone in 60 Seconds :)
        createCars();
    }

    public static void createCars() {
        Car tanya = new Car();
        tanya.setName("Tanya");
        tanya.setMake("Porsche");

        Car lynn = new Car();
        lynn.setMake("Toyota");

        System.out.println(tanya.getName() + "'s make is a " + tanya.getMake());
    }
}
