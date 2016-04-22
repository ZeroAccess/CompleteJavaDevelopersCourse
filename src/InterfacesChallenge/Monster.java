package InterfacesChallenge;

import java.util.ArrayList;

/**
 * Created by robertsg on 4/21/2016.
 */
public class Monster implements ISave {

    String type;
    int health;

    public Monster() {
    }

    public Monster(String type, int health) {
        this.type = type;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health -= health;
    }

    public void checkLife(Monster monster) {
        if (monster.health <= 0) {
            System.out.println("You have slained the evil creeper!");
        }
    }

    public String toString() {
        return "Monster.toString() has been overridden";
    }

    @Override
    public ArrayList returnList() {
        return null;
    }

    @Override
    public void populateList() {

    }
}
