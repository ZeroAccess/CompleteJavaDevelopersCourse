package Encapsulation.EncapsulationChallenge;

/**
 * Created by robertsg on 12/1/2015.
 */
public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(100,0,true);

        System.out.println("Printer is a " + printer.isDuplexPrinter());
        System.out.println("Printer has " + printer.getTonerLevel() + " toner left.");
        printer.printPage(10);
        System.out.println("Printer has " + printer.getTonerLevel() + " toner left.");

        System.out.println("Let's fill the toner back up");
        printer.fillUpToner();
        System.out.println("Printer has " + printer.getTonerLevel() + " toner left.");
        System.out.println("Printed has printed " + printer.getPagesPrinted() + " pages");
    }
}
