package controlflowstatement;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //System.out.println(isValid(1000));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (isValid(first) && isValid(second)) {
            int smallestNumber;
            if (first >= second) {
            }
            smallestNumber = first;

            for (int i = smallestNumber; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;
                }
            }
        }return -1;
    }

    public static boolean isValid (int number){
            return (number >= 10);
        }
    }

