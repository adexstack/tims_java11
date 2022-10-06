package OOPPart2.myCompositionCreateSingleRoomChallenge;

public class Furnitures {
    private int chair;
    private int table;
    private String bed;

    public int getChair() {
        return chair;
    }

    public int getTable() {
        return table;
    }

    public String getBed() {
        return bed;
    }

    public Furnitures(int chair, int table, String bed) {
        this.chair = chair;
        this.table = table;
        this.bed = bed;
    }
}
