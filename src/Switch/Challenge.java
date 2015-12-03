package Switch;

/**
 * Created by robertsg on 11/20/2015.
 */
public class Challenge {

    public static void main(String[] args) {
        char letter = 'A';

        switch (letter) {
            case 'A':
                System.out.println("Letter was A");
                break;
            case 'B':
                System.out.println("Letter was B");
                break;
            case 'C':
                System.out.println("Letter was C");
                break;
            case 'D':
                System.out.println("Letter was D");
                break;
            case 'E':
                System.out.println("Letter was E");
                break;
            default:
                System.out.println("Letter wasn't A-E");
                break;
        }

        String month = "February";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not Sure");
        }
    }
}
