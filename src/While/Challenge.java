package While;

/**
 * Created by robertsg on 11/20/2015.
 */
public class Challenge {
    public static void main(String[] args) {
        int n = 1;
        int nFinish = 50;
        int evenNumbersFound = 0;


        while(n <= nFinish) {
            if(!isEvenNumber(n)) {
                n++;
                continue;
            }
            System.out.println("Even number " + n);
            n++;
            //Challenge
            evenNumbersFound++;
            if(evenNumbersFound == 5){
                System.out.println("Number of Evens " + evenNumbersFound);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
