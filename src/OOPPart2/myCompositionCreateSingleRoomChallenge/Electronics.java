package OOPPart2.myCompositionCreateSingleRoomChallenge;

public class Electronics {
    private int bulb;
    private String fan;
    private String tv;
    private String fridge;

    public int getBulb() {
        return bulb;
    }

    public String getFan() {
        return fan;
    }

    public String getTv() {
        return tv;
    }

    public String getFridge() {
        return fridge;
    }

    public Electronics(int bulb, String fan, String tv, String fridge) {
        this.bulb = bulb;
        this.fan = fan;
        this.tv = tv;
        this.fridge = fridge;
    }
}
