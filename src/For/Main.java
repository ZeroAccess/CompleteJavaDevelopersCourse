package For;

/**
 * Created by robertsg on 11/20/2015.
 */
public class Main {
    public static void main(String[] args) {
//      go();
        go2();
    }

    public static void go() {

        //Challenge
        for(int i = 2; i < 9; i++){
            System.out.println("$10,000 at " + i + "% interest = $" + calculateInterest(10000.0,i));
        }

        System.out.println();

        //Challenge 2
        for(int i = 8; i > 1; i--){
            System.out.println("$10,000 at " + i + "% interest = $" + calculateInterest(10000.0,i));
        }
    }

    public static void go2() {
        int count = 0;
            for(int i = 1; i < 1000 ;i++){
                    if (isPrime(i)) {
                        System.out.println(i + " is a prime number");
                        count++;
                    }
                if(count == 3) {
                    break;
                }
            }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100.0);
    }
}
