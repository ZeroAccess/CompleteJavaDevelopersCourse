package MethodOverloading;

/**
 * Created by robertsg on 11/19/2015.
 */
public class Challenge {

    public static void main(String[] args) {
        go();
    }

    public static void go(){
        calcFeetAndInchesToCentimeters(5.0,10.0);
        calcFeetAndInchesToCentimeters(70);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >=0 && inches >= 0 && inches <=12) {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;

            System.out.println(feet + " feet and " + inches + " inches is equal to " + centimeters +
                    " centimeters");
            return centimeters;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int)inches / 12;
            double remainingInches = inches - (feet * 12.0);
            calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}
