package PolymorphismChallenge;

/**
 * Created by robertsg on 12/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            if (i == 1) {

            } else {
                System.out.println();
            }
            Car car = randomCar();
            System.out.println("Car # " + i + " : " + car.getManufacturer() + " " + car.getName() + "\n"
                    + "Equipped with: " + car.getEngineCylinders() + " cylinder " + car.getEngineType() + " engine"
                    + " with " + car.wheels() + " wheels");
            car.startEngine();
            car.accelerate();
            car.brake();
        }
        System.out.println(" \n" + "Printing some Ford Stuff" + "\n");
        FordFocus ford = new FordFocus();
        ford.startEngine();
        ford.accelerate();
        ford.brake();
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random Number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new ToyotaSupra();
            case 2:
                return new SubaruImpreza();
            case 3:
                return new FordFocus();
        }
        return null;
    }
}

class Car {
    private String manufacturer;
    private String name;
    private boolean engine;
    private String engineType;
    private int engineCylinders;
    private int wheels;

    public Car(String manufacturer, String name, String engineType, int engineCylinders) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.engineType = engineType;
        this.engineCylinders = engineCylinders;
    }

    public boolean engine() {
        return true;
    }

    public int wheels() {
        return 4;
    }

    public String getManufacturer() {
            return manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getEngineCylinders() {
        return engineCylinders;
    }

    public void startEngine() {
        System.out.println("Car Class -> startEngine()");
    }

    public void accelerate() {
        System.out.println("Car Class -> accelerate()");
    }

    public void brake() {
        System.out.println("Car Class -> brake()");
    }
}

class ToyotaSupra extends Car {
    public ToyotaSupra() {
        super("Toyota", "Supra", "turbo", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("ToyotaSupra Class -> startEngine()");
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class SubaruImpreza extends Car {
    public SubaruImpreza() {
        super("Subaru", "Impreza", "naturally aspirated", 4);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("SubaruImpreza Class -> accelerate()");
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class FordFocus extends Car {
    public FordFocus() {
        super("Ford", "Focus", "naturally aspirated", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("FordFocus Class -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("FordFocus Class -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("FordFocus Class -> brake()");
    }
}