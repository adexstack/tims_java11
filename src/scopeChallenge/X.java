package scopeChallenge;

import java.util.Scanner;

public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x(){
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " times "+ this.x + " equals " + x * this.x );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        X x = new X(scanner.nextInt());
        x.x();

    }
}
