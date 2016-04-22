package InterfacesChallenge;

import java.util.ArrayList;

/**
 * Created by robertsg on 4/21/2016.
 */
public class Player implements ISave {

    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health -= health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void dealDamage(Player player, Monster monster) {
        if (player.weapon == "sword") {
            monster.setHealth(20);
        } else {
            System.out.println("You missed! only swords can hurt creepers!");
        }
    }

    public void checkLife(Player player) {
        if (player.health <= 0) {
            System.out.println("You have died");
        }
    }

    @Override
    public String toString() {
        return "Player.toString() has been overridden";
    }

    @Override
    public ArrayList returnList() {
        return null;
    }

    @Override
    public void populateList() {

    }
}
