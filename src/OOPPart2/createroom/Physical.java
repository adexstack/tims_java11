package OOPPart2.createroom;

public class Physical {
    private Walls walls;
    private int door;
    private int window;
    private int ceiling;

    public Physical(Walls walls, int door, int window, int ceiling) {
        this.walls = walls;
        this.door = door;
        this.window = window;
        this.ceiling = ceiling;
    }

    public void decideRoomStandard(){
        System.out.println("The room is exquisite standard with "+getCeiling()+" ceilings");
    }

    public Walls getWalls() {
        return walls;
    }

    public int getDoor() {
        return door;
    }

    public int getWindow() {
        return window;
    }

    public int getCeiling() {
        return ceiling;
    }
}
