package OOPTest;

import java.math.BigDecimal;

/**
 * Created by robertsg on 12/3/2015.
 */
public class HealthyBurger extends Burger {
    public HealthyBurger(String meat, BigDecimal basePrice) {
        super("brown eye roll", meat, basePrice);
    }

    public void addAvocado() {
        additions.add("avocado");
        additionalPrice = additionalPrice.add((BigDecimal.valueOf(.50)));
        System.out.println("Avocado has been added to your burger at a cost of $.50");
    }

    public void addSprouts() {
        additions.add("sprouts");
        additionalPrice = additionalPrice.add((BigDecimal.valueOf(.50)));
        System.out.println("Sprouts have been added to your burger at a cost of $.50");
    }
}