package operatorAndprecedence;

public class OperatorPrecedenceChallenge1 {

    public static void main(String[] args) {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double num3 = (num1+num2) * 100.00d;
        double num4 = num3 % 40.00d;

        boolean isZero = (num4==0)? true : false;
        System.out.println(isZero);
        if (!isZero)
            System.out.println("Got some remainder");


    }
}
