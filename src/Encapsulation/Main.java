package Encapsulation;

/**
 * Created by robertsg on 12/1/2015.
 */
public class Main {
    public static void main(String[] args) {
//        Incorrect Way of doing it (Doesn't have encapsulation)
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Calix",100,"Sword");
        System.out.println("Initial Health is " + player.getHealth());
    }
}
