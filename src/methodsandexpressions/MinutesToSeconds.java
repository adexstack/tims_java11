package methodsandexpressions;


public class MinutesToSeconds {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value"; // Using constant

    public static void main(String[] args) {
        System.out.println(getDurationString(10, 5));
        System.out.println(getDurationString(608L));
        System.out.println(getDurationString(0));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;

        long remainingMinutes = minutes % 60;


        String leadHr = getLeadingZero("hourString", hours, "h");
        String leadMin = getLeadingZero("minutesString", remainingMinutes, "m");
        String leadSec = getLeadingZero("secondsString", seconds, "s");
        return leadHr + leadMin + leadSec;

    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getLeadingZero(String periodString, Long period, String abbreviate) {

        if (period>= 10) {
            return null;
        }
        periodString = period + "abbreviate";
        periodString = "0" + periodString;
        return periodString;
        }

    }


