package OOPPart2.createroom;

public class Room {
    private Physical physical;
    private Interior interior;

    public Room(Physical physical, Interior interior) {
        this.physical = physical;
        this.interior = interior;
    }

    public Physical getPhysical() {
        return physical;
    }

    public Interior getInterior() {
        return interior;
    }
}
