package conditionifandelse;

public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(15,13,19);
    }

    public static boolean hasTeen(int first, int second, int third) {

        boolean checkTeen = true;
        if( (isTeen(first)) || (isTeen(second))  || (isTeen(third)) ) {

            System.out.println(checkTeen);
            return checkTeen;
        }
        System.out.println(!checkTeen);
        return !checkTeen;

    }

    public static boolean isTeen (int number) {
        return (number >= 13 && number <= 19);
    }
}
