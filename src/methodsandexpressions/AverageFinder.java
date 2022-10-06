package methodsandexpressions;

public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        AverageFinder a = new AverageFinder();
        double avg = a.findAverage(args);
        System.out.println("The average is " + avg);
    }

    private double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result/input.length;
    }
}
