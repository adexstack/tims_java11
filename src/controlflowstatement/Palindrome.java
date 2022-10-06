package controlflowstatement;

public class Palindrome {

    public static void main(String[] args) {
        isPalindrome2();
    }

    // This checks
    /*private static boolean isPalindrome(int number) {

        int remainder, sum = 0, temp;

        temp = number;
        while (number > 0) {
            remainder = number % 10;  //getting remainder
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
*/
    // Checking both number and String for palindrome
    private static void isPalindrome2() {
        {
            String original, reverse = ""; // Objects of String class
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter a string/number to check if it is a palindrome");
            original = "ade";
            int length = original.length();
            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);
            if (original.equals(reverse))
                System.out.println("Entered string/number is a palindrome.");
            else
                System.out.println("Entered string/number isn't a palindrome.");
        }
    }
}

