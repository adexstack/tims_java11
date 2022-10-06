package OOPPart2.myCompositionCreateSingleRoomChallenge;

public class Interior {
    private Cotton cotton;
    private Electronics electronics;
    private Furnitures furniture;

    public Interior(Cotton cotton, Electronics electronics, Furnitures furniture) {
        this.cotton = cotton;
        this.electronics = electronics;
        this.furniture = furniture;
    }


    public Cotton getCotton() {
        return cotton;
    }

    public Electronics getElectronics() {
        return electronics;
    }

    public Furnitures getFurniture() {
        return furniture;
    }


}
