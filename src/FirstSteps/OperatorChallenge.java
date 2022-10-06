package FirstSteps;

public class OperatorChallenge {
    public static void main(String[] args) {
        double myVar = 20.00d;
        double mySecondvar = 80.00d;
        double result = (myVar + mySecondvar) * 100.00d;
        System.out.println("result "+ result);
        double remainder = result % 40.00d;
        System.out.println("remainder "+remainder);
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println(isZero);
        if(!isZero)
            System.out.println("Got some remainder");
    }
}
