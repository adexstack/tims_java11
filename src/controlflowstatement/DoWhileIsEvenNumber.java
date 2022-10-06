package controlflowstatement;

public class DoWhileIsEvenNumber {
    public static void main(String[] args) {
        isEvenNumber(11);

    }

    public static boolean isEvenNumber(int num){
        boolean isEven = (num % 2 == 0)? true : false;
        System.out.println(isEven + ":  " + num);
            return isEven;
        }
    }

