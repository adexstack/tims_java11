package OOPPart1.inheritancechallenge1;

public class Nissan extends Car{
    private int rev;

    public int getRev() {
        return rev;
    }

    public void setRev(int rev) {
        this.rev = rev;
    }

    public Nissan(int speed, String name, String model, int wheels, int gear, String direction, int color, int size, int rev) {
        super(speed, name, model, wheels, gear, direction, color, size);
        this.rev = rev;
    }

}
