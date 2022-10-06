package controlflowstatement;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minNumber = 0;
        int maxNumber = 0;
        boolean first = true;
        while (true) {
            System.out.println("Please enter a number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();

                if(first){
                    first = false;
                    minNumber = number;
                    maxNumber = number;
                }
                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }

            }else{
                break;
            }
            scanner.nextLine(); //handle input


        }
        System.out.println("min " + minNumber + " max " + maxNumber);
    }
}

    /*// Using Constant approach
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     // Using another approach of setting min and max to int boundaries
        int minNumber = 2147483647; // Better to use Constants in place of this number Integer.MAX_VALUE;
        int maxNumber = -2147483647; // Integer.MAX_VALUE;

        while (true) {
            System.out.println("Please enter a number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();


                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }

            }else{
                break;
            }
            scanner.nextLine(); //handle input


        }
        System.out.println("min " + minNumber + " max " + maxNumber);
    }*/