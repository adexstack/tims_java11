package InnerClassSourceCode;

public class MainGearbox {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(4,2.5);
        System.out.println(first.driveSpeed(1000));
    }

}
