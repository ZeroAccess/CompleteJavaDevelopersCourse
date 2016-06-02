/**
 * Created by robertsg on 5/31/2016.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i % 5) == 0 && (i % 7) == 0) {
                System.out.println("fizzbuzz");
            } else {
                if ((i % 5) == 0) {
                    System.out.print("fizz");
                } else if ((i % 7) == 0) {
                    System.out.print("buzz");
                } else {
                    System.out.print(i);
                }
                System.out.print(" ");

            }
        }
    }
}
