package controlflowstatement;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
        //System.out.println(reverse(100));
    }
    public static int getDigitCount(int num) {

        int digitCount = 0;

        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            num /= 10;
            digitCount++;

        }
        return digitCount;
    }

    public static int reverse(int number) {
        int remainder = 0, reversed = 0, copy = number;
        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return reversed == 0 ? copy : reversed;
    }

    public static void numberToWords(int num) {
        if (num < 0) {

            System.out.println("Invalid Value");
        }
        int number = reverse(num);
        for (int i = 0; i < getDigitCount(num); number /= 10,i++)

            switch (number % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }

    }

}