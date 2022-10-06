package methodsandexpressions;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        double centimeters = MethodOverloading.calcFeetAndInchesToCentimeters(10,1);

        if (centimeters<0.0){
            System.out.println("invalid parameters");
        }

        MethodOverloading.calcFeetAndInchesToCentimeters(307.34);


    }


}
