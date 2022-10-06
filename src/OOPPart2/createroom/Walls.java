package OOPPart2.createroom;

public class Walls {
    private int cement;
    private int brick;
    private int paint;

    public Walls(int cement, int brick, int paint) {
        this.cement = cement;
        this.brick = brick;
        this.paint = paint;
    }

    public int getCement() {
        return cement;
    }

    public int getBrick() {
        return brick;
    }

    public int getPaint() {
        return paint;
    }
}
