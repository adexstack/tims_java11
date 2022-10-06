package OOPPart2.myCompositionCreateSingleRoomChallenge;

public class BuildWall {
    private double size;
    private String brickType;
    private String colour;

    public double getSize() {
        return size;
    }

    public String getBrickType() {
        return brickType;
    }

    public String getColour() {
        return colour;
    }

    public BuildWall(int size, String brickType, String colour) {
        this.size = size;
        this.brickType = brickType;
        this.colour = colour;
    }
}
