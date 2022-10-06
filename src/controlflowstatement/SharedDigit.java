package controlflowstatement;

import java.util.ArrayList;
import java.util.List;

public class SharedDigit {

    public static void main(String[] args) {
        //System.out.println(hasSharedDigit(9, 100));
        //System.out.println(hasSharedDigitCopied(54,25));
        System.out.println(hasSharedDigit2(8,88));
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            List<Integer> listNum1 = new ArrayList<>();
            List<Integer> listNum2 = new ArrayList<>();

            while (num1 > 0 || num2 > 0) {
                int digit1 = num1 % 10;
                int digit2 = num2 % 10;
                listNum1.add(digit1);
                listNum2.add(digit2);
                num1 /= 10;
                num2 /= 10;

            }
            System.out.println(listNum1);
            System.out.println(listNum2);
            for (int i = 0; i < listNum1.size(); i++) {
                for (int j = 0; j < listNum2.size(); j++) {
                    if (listNum1.get(i) == listNum2.get(j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasSharedDigit2(int firstNumber, int secondNumber) {
        if((firstNumber>=10 && firstNumber<=99) && (secondNumber>=10 && secondNumber<=99)){
            int firstNumberDigit1 = firstNumber % 10;
            int firstNumberDigit2 = firstNumber / 10;
            int secondNumberDigit1 = secondNumber % 10;
            int secondNumberDigit2 = secondNumber / 10;
            if((firstNumberDigit1==secondNumberDigit1) || (firstNumberDigit1==secondNumberDigit2)
                    || (firstNumberDigit2==secondNumberDigit1) || (firstNumberDigit2==secondNumberDigit2)){
                return true;
            }
        }
        return false;
    }

    public static boolean hasSharedDigitCopied(int firstNumber, int secondNumber) {
        if ((firstNumber < 10) || (firstNumber > 99) || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        }
        int firstNumberFirstDigit = firstNumber / 10;
        int firstNumberSecondDigit = firstNumber % 10;
        int secondNumberFirstDigit = secondNumber / 10;
        int secondNumberSecondDigit = secondNumber % 10;
        return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberSecondDigit)
                || (firstNumberSecondDigit == secondNumberFirstDigit) || (firstNumberSecondDigit == secondNumberSecondDigit));
    }

}




