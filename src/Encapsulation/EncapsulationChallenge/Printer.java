package Encapsulation.EncapsulationChallenge;

/**
 * Created by robertsg on 12/1/2015.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void printPage(int numOfPages) {
        System.out.println(numOfPages + " pages has been printed");
        pagesPrinted += numOfPages;
        tonerLevel -= numOfPages;
    }

    public void fillUpToner() {
        if(tonerLevel >= 0 && tonerLevel < 100) {
            this.tonerLevel = 100;
        } else {
            System.out.println("Toner is already at 100%");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public String isDuplexPrinter() {
        if(duplexPrinter) {
            return "duplex printer";
        } else {
            return "non-duplex printer";
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
