package Encapsulation;

/**
 * Created by robertsg on 12/1/2015.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
