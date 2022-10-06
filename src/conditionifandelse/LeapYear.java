package conditionifandelse;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year <1 || year >9999) {
            return false;
        }

        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(" The year is a leap year ");
            return true;
        } else {
            System.out.println(" The year is not a leap year");
            return false;
        }

    }

}
