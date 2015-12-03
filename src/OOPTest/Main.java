package OOPTest;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Created by robertsg on 12/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        Burger orderOne = new Burger("roll","beef",BigDecimal.valueOf(2.50));
        System.out.println("Hey, you know exactly what you want. Take your time building your masterpiece.");
        orderOne.addLettuce();
        orderOne.addCarrot();
        System.out.println("Your bread type is " + orderOne.getBreadType() + ", meat is " + orderOne.getMeat()
                + " the base price is " + NumberFormat.getCurrencyInstance().format(orderOne.getBasePrice()) + " with your additions being "
                + orderOne.getAdditions() + " and the total price is " + NumberFormat.getCurrencyInstance().format(orderOne.calculatePrice()));

        System.out.println();

        HealthyBurger orderTwo = new HealthyBurger("turkey",BigDecimal.valueOf(4.00));
        System.out.println("Hey, you're a Healthy kind of man. You want to be able to flex in the mirror and say \"Ohh Yea I'm a sexy beast\".");
        orderTwo.addCarrot();
        orderTwo.addAvocado();
        orderTwo.addSprouts();
        System.out.println("Your bread type is " + orderTwo.getBreadType() + ", meat is " + orderTwo.getMeat()
                + " the base price is " + NumberFormat.getCurrencyInstance().format(orderTwo.getBasePrice()) + " with your additions being "
                + orderTwo.getAdditions() + " and the total price is " + NumberFormat.getCurrencyInstance().format(orderTwo.calculatePrice()));

        System.out.println();

        DeluxeBurger orderThree = new DeluxeBurger("sesame seed bun","angus beef",BigDecimal.valueOf(11.00),"Sprite","medium fries");
//        orderThree.addTomato();
        System.out.println("Hey, you're a Deluxe kind of man. You want to have delicious toppings dropping from your mouth to your beard for safe keeping later.");
        System.out.println("Your bread type is " + orderThree.getBreadType() + ", meat is " + orderThree.getMeat()
                + " the base price is " + NumberFormat.getCurrencyInstance().format(orderThree.getBasePrice()) + " with your additions being "
                + orderThree.getDrink() + " and " + orderThree.getFries() +  " and the total price is " + NumberFormat.getCurrencyInstance().format(orderThree.calculatePrice()));
    }
}
