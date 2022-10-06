package conditionifandelse;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(10.78);
        checkNumber(-0.345);
        checkNumber(0);
        checkNumber(55);
    }

    public static void checkNumber(double number){

        if(number>0){
            System.out.println("positive");
        }else if (number<0){
            System.out.println("negative");
        }else  System.out.println("zero");
    }
}
