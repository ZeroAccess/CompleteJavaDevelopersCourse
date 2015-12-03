package OOPTest;

import java.math.BigDecimal;

/**
 * Created by robertsg on 12/3/2015.
 */
public class DeluxeBurger extends Burger {
    private String drink;
    private String fries;

    public DeluxeBurger(String breadType, String meat, BigDecimal basePrice, String drink, String fries) {
        super(breadType, meat, basePrice);
        this.drink = drink;
        this.fries = fries;
    }

    public String getDrink() {
        return drink;
    }

    public String getFries() {
        return fries;
    }

    @Override //Deluxe Burger cannot have additional toppings
    public void addLettuce() {
        System.out.println("Hey now, we made this Deluxe! What more do you want from us? A hug..ok you got it!");
    }

    @Override //Deluxe Burger cannot have additional toppings
    public void addTomato() {
        System.out.println("Hey now, we made this Deluxe! What more do you want from us? A hug..ok you got it!");
    }

    @Override //Deluxe Burger cannot have additional toppings
    public void addCarrot() {
        System.out.println("Hey now, we made this Deluxe! What more do you want from us? A hug..ok you got it!");
    }

    @Override //Deluxe Burger cannot have additional toppings
    public void addPickle() {
        System.out.println("Hey now, we made this Deluxe! What more do you want from us? A hug..ok you got it!");
    }
}