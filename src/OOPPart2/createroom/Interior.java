package OOPPart2.createroom;

public class Interior {
    private Furniture furniture;
    private int cutton;

    public Interior(Furniture furniture, int cutton) {
        this.furniture = furniture;
        this.cutton = cutton;
    }

    public void getDesign(){
        System.out.println("The furnitures used are"+getFurniture());
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public int getCutton() {
        return cutton;
    }
}
