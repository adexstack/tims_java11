package OOPPart2.myCompositionCreateSingleRoomChallenge;

public class Ceiling {
    private double size;
    private String colour;

    public Ceiling(double size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    public void setSize(double length, double breadth) {
        this.size = length * breadth;
    }

    public double getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

}
