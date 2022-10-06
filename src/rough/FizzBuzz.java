package rough;

public class FizzBuzz {
    public static int fizz = 3;
    public static int buzz = 5;

    public static void getFizzBuzz(int n){
        if((n % fizz == 0) && (n % buzz == 0)){
            System.out.println("FizzBuzz");
        }
        else if(n % fizz == 0) {
            System.out.println("Fizz");
        }
        else if(n % buzz == 0) {
            System.out.println("buzz");
        }
        else{
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<=15;i++){
            getFizzBuzz(i);
        }
    }
}
