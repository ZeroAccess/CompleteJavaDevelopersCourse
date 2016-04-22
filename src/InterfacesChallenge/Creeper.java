package InterfacesChallenge;

/**
 * Created by robertsg on 4/22/2016.
 */
public class Creeper extends Monster {

    public Creeper(String type, int health) {
        super(type, health);
    }

    public void explode(String type, Player player, int proximity) {
        if (type == "creeper" && proximity < 10) {
            if (proximity > 5) {
                player.setHealth(5);
                System.out.println("You took a little damage");
            } else if (proximity <= 5 && proximity > 2) {
                player.setHealth(10);
                System.out.println("You took moderate damage");
            } else {
                player.setHealth(20);
                System.out.println("You took a lot of damage");
            }
        }
    }
}
