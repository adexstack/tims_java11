package OOPPart2.createroom;

public class Furniture {
    private String television;
    private String fan;
    private String Wardrobe;

    public String getTelevision() {
        return television;
    }

    public String getFan() {
        return fan;
    }

    public String getWardrobe() {
        return Wardrobe;
    }

    public Furniture(String television, String fan, String wardrobe) {
        this.television = television;
        this.fan = fan;
        Wardrobe = wardrobe;
    }
}
