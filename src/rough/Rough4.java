package rough;

import java.util.Scanner;

public class Rough4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Input a number : ");
            //int choice = Integer.parseInt(scanner.nextLine());
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("I am one");
                    break;
                case 2:
                    System.out.println("I am two");
                    break;
            }
        }
    }
}
