package OOPTest;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by robertsg on 12/2/2015.
 */
public class Burger {
    public BigDecimal additionalPrice = BigDecimal.ZERO;
    public ArrayList<String> additions = new ArrayList<>();
    private String breadType;
    private String meat;
    private BigDecimal basePrice;

    public Burger(String breadType, String meat, BigDecimal basePrice) {
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public Burger(String breadType, String meat, BigDecimal basePrice, ArrayList<String> additions) {
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.additions = additions;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public ArrayList<String> getAdditions() {
        return additions;
    }

    public void addLettuce() {
        additions.add("lettuce");
        additionalPrice = additionalPrice.add((BigDecimal.valueOf(.25)));
        System.out.println("Lettuce has been added to your burger at a cost of $.25");
    }

    public void addTomato() {
        additions.add("tomatoes");
        additionalPrice = additionalPrice.add((BigDecimal.valueOf(.25)));
        System.out.println("Tomatoes have been added to your burger at a cost of $.25");
    }

    public void addCarrot() {
        additions.add("carrots");
        additionalPrice = additionalPrice.add((BigDecimal.valueOf(.25)));
        System.out.println("Carrots have been added to your burger at a cost of $.25");
    }

    public void addPickle(){
        additions.add("pickles");
        additionalPrice = additionalPrice.add((BigDecimal.valueOf(.25)));
        System.out.println("Pickles have been added to your burger at a cost of $.25");
    }

    public BigDecimal calculatePrice() {
        return basePrice.add(additionalPrice);
    }
}