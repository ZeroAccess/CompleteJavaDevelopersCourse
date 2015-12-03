package Composition;

/**
 * Created by robertsg on 11/30/2015.
 */
public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220b","Dell","240w",dimensions);
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.powerUP();
    }
}
