package OOPPart2.myCompositionCreateSingleRoomChallenge;


public class Structure {
    private BuildWall wall;
    private Ceiling ceiling;
    private FloorLay floor;

    public BuildWall getWall() {
        return wall;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public FloorLay getFloor() {
        return floor;
    }

    public Structure(BuildWall wall, Ceiling ceiling, FloorLay floor) {
        this.wall = wall;
        this.ceiling = ceiling;
        this.floor = floor;
    }
}
