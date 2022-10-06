package OOPPart1.inheritancechallenge1;

public class Vehicle {
    private int speed;
    private int gear;
    private String direction;
    private String make;
    private String model;
    private int wheels;


    public Vehicle(int speed, String name, String model, int wheels, int gear, String direction) {
        this.speed = speed;
        this.make = make;
        this.model = model;
        this.wheels = wheels;
        this.gear = gear;
        this.direction = direction;
    }

    public void handleSteering(String direction){
        this.direction = direction;

    }
    public void changeGears(int gear){
        this.gear = gear;

    }
    public void move(int speed) {
        this.speed = speed;

    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
