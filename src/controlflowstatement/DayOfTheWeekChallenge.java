package controlflowstatement;



public class DayOfTheWeekChallenge {

    public static void main(String[]args){
        printDayOfTheWeekSwitch(2);
        printDayOfTheWeekUsingIfElse(2);
    }
    public static void printDayOfTheWeekSwitch(int day){
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeekUsingIfElse(int day){
        if(day==1){
            System.out.println("Sunday");
        }
        else if(day==2){
            System.out.println("Monday");
        }
        else if(day==3){
            System.out.println("Tuesday");
        }
        else{
            System.out.println("Invalid day");
        }
    }
}
