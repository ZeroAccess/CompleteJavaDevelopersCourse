package CompositionChallenge;

/**
 * Created by robertsg on 12/1/2015.
 */
public class Room extends SquareFootage {
    private String name;

    public Room(int length, int width, String name) {
        super(length, width);
        this.name = name;
    }

    public void calculateSquareFootage() {
        int area = super.getLength() * super.getWidth();
        System.out.println("Calculating Square Footage..." + area);

    }

    public String getName() {
        return name;
    }
}
