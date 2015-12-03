package CompositionChallenge;

/**
 * Created by robertsg on 12/1/2015.
 */
public class House {
    private Room room;
    private int floors;
    private String roof;

    public House(Room room, int floors, String roof) {
        this.room = room;
        this.floors = floors;
        this.roof = roof;
    }

    public void calculate() {
        room.calculateSquareFootage();
        bluePrints();
    }

    private void bluePrints() {
        System.out.println("Drawing Blue Prints");
    }
}
