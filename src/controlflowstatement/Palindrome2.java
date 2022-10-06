package controlflowstatement;

public class Palindrome2 {
    public static void main(String[] args) {
        isPalindrome("ade");
    }

        private static boolean isPalindrome (String input){

            boolean isPalindrome = true;
            String original = input;
            String reverse = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                System.out.println(i + ": " + original.charAt(i));
                reverse = reverse + original.charAt(i);

            }
            System.out.println(reverse);
            if (original.equals(reverse)) {
                System.out.println(isPalindrome);
                return isPalindrome;
            }
            System.out.println(!isPalindrome);
            return !isPalindrome;
            }
        }



