package methodsandexpressions;

public class MinutesToYearsDaysCalculator {

    public static final String INVALID_PARAM = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println(INVALID_PARAM);
        }
        else{
            int hour = (int) minutes/60;
            int day = hour/24;
            int year = day/365;
            int remainingDays = (int) day % 365;

            System.out.println(minutes + " min = "+year+ " y and "+remainingDays+" d");


        }
        }

}
