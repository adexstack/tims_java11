package OOPPart2.myCompositionCreateSingleRoomChallenge;

public class Cotton {
    private Double dimension;
    private String colour;
    private String material;

    public Cotton(Double dimension, String colour, String material) {
        this.dimension = dimension;
        this.colour = colour;
        this.material = material;
    }

    public double setDimension(Double length, Double breadth) {
        this.dimension = length * breadth;
        return dimension;
    }

    public void cottonDescription(double dimension,String colour){
        System.out.println("The cotton is "+getDimension()+ " CM big and of colour "+getColour());
    }

    private Double getDimension() {
        return dimension;
    }

    private String getColour() {
        return colour;
    }

    private String getMaterial() {
        return material;
    }

}
