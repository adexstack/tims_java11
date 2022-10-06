package controlflowstatement;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(1004)); // failed with 0 at the start this gives 14, should be 5
        System.out.println(digitSum(-123));
        System.out.println(digitSum(8));
        System.out.println(digitSumOptimised(1004));
    }
    private static int digitSum(int number){
        if(number<10){
            return -1;
        }

        int lastDigit,sum=0;

        while(number>0){
            lastDigit = number%10;
            sum+=lastDigit;
            number/=10;
        }
        return sum;
    }

    public static int digitSumOptimised(int number){
        if(number<10){
            return -1;
        }

        int sum;
        for(sum=0; number>0; sum+=(number%10), number/=10);
        return sum;

    }
}
