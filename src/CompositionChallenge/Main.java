package CompositionChallenge;

/**
 * Created by robertsg on 12/1/2015.
 */
public class Main {
    public static void main(String[] args) {
        Room diningRoom = new Room(12,10,"Dining Room");
        House theHouse = new House(diningRoom,3,"shingles");

        theHouse.calculate();
    }
}
