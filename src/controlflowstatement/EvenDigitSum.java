package controlflowstatement;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }
    private static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }

        int lastDigit,evenDigitSum=0;

        while(number>0){
            lastDigit = number%10;
            if(lastDigit%2==0){
                evenDigitSum+=lastDigit;
            }
            number/=10;
        }
        return evenDigitSum;
    }
}
