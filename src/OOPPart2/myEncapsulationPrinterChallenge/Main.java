package OOPPart2.myEncapsulationPrinterChallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(70,50,true);
        printer.printPaper(20);
        printer.getPagesPrinted();
    }
}
