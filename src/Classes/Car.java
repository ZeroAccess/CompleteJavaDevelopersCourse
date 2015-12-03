package Classes;

/**
 * Created by robertsg on 11/23/2015.
 */
public class Car {
    private int doors;
    private int wheels;
    private String make;
    private String model;
    private String name;
    private String engine;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {

        /*        String validMake = make.toLowerCase();
        if(validMake.equals("porsche") || validMake.equals("toyota")){
            this.make = make;
        } else  {
            this.make = "Unknown";
        }*/
        this.make = make;

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
