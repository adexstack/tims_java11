package NamingConventionsAndPackage.scopeVisiblity;

import java.util.Scanner;

public class XscopeAndVisibilityChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number: ");
        X x = new X(Integer.parseInt(scanner.nextLine()));  // Read user input
        x.x();
    }
}
