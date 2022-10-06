package controlflowstatement;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long average = 0;

        while(true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                sum+=number;
                count++;
            } else{
                break;
        }
            scanner.nextLine();
    }
        average = Math.round((double)sum/count);
        System.out.println("SUM = "+sum+" AVG = "+average);
        scanner.close();
    }
}
