package controlflowstatement;

public class forLoop {

    public static void main(String[] args) {
        double amount = 10000;
        for(int i=2; i<9; i++ ){
            System.out.println(String.format("%.2f", calculateInterest(amount, (double) i)));
        }

        for(int i=8; i>=2; i-- ){
            System.out.println(String.format("%.2f", calculateInterest(amount, (double) i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount *(interestRate/100));
    }
}
