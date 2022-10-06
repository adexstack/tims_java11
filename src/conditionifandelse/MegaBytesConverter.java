package conditionifandelse;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int calculatedMegaByte = (kiloBytes / 1024);

            int remainCalculatedMegabyte = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + calculatedMegaByte
                    + " MB and " + remainCalculatedMegabyte
                    + " KB");
        }
    }
}
