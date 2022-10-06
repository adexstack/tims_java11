package OOPPart1.inheritancechallenge1;

public class Car extends Vehicle {
    private int color;
    private int size;

    public Car(int speed, String name, String model, int wheels, int gear, String direction, int color, int size) {
        super(speed, name, model, wheels, gear, direction);
        this.color = color;
        this.size = size;
    }

    public Car(int speed, String name, String model, int wheels, int gear, String direction) {
        super(speed, name, model, wheels, gear, direction);


    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
