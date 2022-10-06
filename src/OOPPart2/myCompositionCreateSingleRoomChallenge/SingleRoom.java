package OOPPart2.myCompositionCreateSingleRoomChallenge;

public class SingleRoom {
    private Interior interior;
    private Structure structure;

    public SingleRoom(Interior interior, Structure structure) {
        this.interior = interior;
        this.structure = structure;

    }
    public void roomAdvert(){
        interior.getCotton().cottonDescription(getCottonDimension(), "Green");

    }

    private Double getCottonDimension(){
        double dimension = interior.getCotton().setDimension(2.5,3.2);
        return dimension;
    }
}
