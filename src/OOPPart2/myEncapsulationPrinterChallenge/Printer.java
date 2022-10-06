package OOPPart2.myEncapsulationPrinterChallenge;

public class Printer {
    private int tonerLevel ;
    private int pagesPrinted ;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if (tonerLevel <= 100 ){
            this.tonerLevel = tonerLevel;
        }

        this.isDuplex = isDuplex;
        this.pagesPrinted = pagesPrinted;
    }

    public void printPaper(int pagesPrinted) {
        if (isDuplex == true) {
            this.pagesPrinted = pagesPrinted * 2;
        } else {
            this.pagesPrinted = pagesPrinted;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
