package controlflowstatement;

public class SumOddRangeOptimise {
    public static void main(String[] args) {
        sumOdd(5,10);
    }
    public static boolean isOdd (int number){
        return number < 0? false : (number % 2 != 0);
    }

    public static int sumOdd(int start, int end){
        if ((end < start) || (start < 1) || (end < 1)){
            return -1;
        }
        int sum = 0;
        for (int i=start; i<=end; i++) {
            if (isOdd(i)) {
                sum+=i;
            }
        }
        System.out.println("sum is "+sum);

        return sum;
    }
}
