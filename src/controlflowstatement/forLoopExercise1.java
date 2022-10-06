package controlflowstatement;

public class forLoopExercise1 {

    public static void main(String[] args) {
        //isPrime(4);
        printPrimeCount(5);
    }
    public static boolean isPrime(int n){
        if(n==1){
            System.out.println(false);
            return false;
        }
        //for(int i=2; i <= n/2; i++){
        for(int i=2; i <= (long) Math.sqrt(n); i++){ //for optimisation and reduce loop circles
            if(n % i == 0){
                System.out.println("false");
                return false;
            }

        }
        System.out.println("true");
        return true;
    }

    public static void printPrimeCount(int number){

            int count = 0;
            for(number=10;number<50;number++){
                if(isPrime(number)){
                    count++;
                    System.out.println("prime number is : "+number);
                    if (count == 3){
                            System.out.println("Exiting loop");
                            break;
                    }
                }

            }
        }
    }

