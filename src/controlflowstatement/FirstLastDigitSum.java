package controlflowstatement;

import java.util.ArrayList;
import java.util.List;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println("sumofFirstAndlast is :"+sumFirstAndLastDigit(6921));
        System.out.println(sumFirstAndLastDigitOptimised(0));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number<0){
            return -1;
        }
        else if(number==0){
            return 0;
        }

        List<Integer> digits = new ArrayList<>();
        while(number>0){
            int digitLast = number%10;
            digits.add(digitLast);
            number/=10;

        }
        int lastdigit = digits.get(0);
        int firstdigit = digits.get(digits.size()-1);
        return (lastdigit + firstdigit);

    }

        public static int sumFirstAndLastDigitOptimised (int num) {
            if (num <0){
                return -1;
            }
            int lastDigit = num % 10;
            while (num >=10) {
                num /= 10;
            }
            return num + lastDigit;
        }
    }



