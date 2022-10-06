package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChallengePart2 {
    public static void main(String[] args) {

        //challenge 8
        System.out.println("challenge 8-------------->");

        String challenge8 = "abcd.135uvqz.7tzik.999";
        String  challenge8Textgroup = ("[A-Za-z]+\\.(\\d+)"); // Grouping as interested in the digits contained
        Pattern pattern8 = Pattern.compile(challenge8Textgroup);
        Matcher matcher8 = pattern8.matcher(challenge8);
        while(matcher8.find()){
            System.out.println("Occurence at "+matcher8.group(1)); //The entire regex is group 0
        }

        //challenge 9
        System.out.println("challenge 9-------------->");

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String  challenge9Textgroup = ("[A-Za-z]+\\.(\\d+)\\s"); // the \\s would match all the whitespaces after the digits; i.e blank, tabs and newline
        Pattern pattern9 = Pattern.compile(challenge9Textgroup);
        Matcher matcher9 = pattern9.matcher(challenge9);
        while(matcher9.find()){
            System.out.println("Occurence at "+matcher9.group(1)); //The entire regex is group 0
        }

        //challenge 10 (Printing out the start and end index of the digits occurence in the string
        System.out.println("challenge 10-----Printing out the start and end index of the digits occurence in the string--------->");

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        String  challenge10Textgroup = ("[A-Za-z]+\\.(\\d+)\\s"); // the \\s would match all the whitespaces after the digits; i.e blank, tabs and newline
        Pattern pattern10 = Pattern.compile(challenge10Textgroup);
        Matcher matcher10 = pattern10.matcher(challenge10);
        while(matcher10.find()){
            System.out.println("Occurence: start at "+matcher10.start(1) + " end = " + (matcher10.end(1)-1));
        }

        //challenge 11 (Printing out everything inside the curly braces)
        System.out.println("challenge 11----Printing out only non Letters inside the curly braces---------->");

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String  challenge11Textgroup = "\\{(.+?)}";
        Pattern pattern11 = Pattern.compile(challenge11Textgroup);
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()){
            System.out.println("Occurence" +matcher11.group(1));
        }

        //challenge 11a (Printing out only non Letters inside the curly braces)
        System.out.println("challenge 11a----Printing out only non Letters inside the curly braces ---------->");

        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {x, y}, {2, 4}";
        String  challenge11Textgroupa = "\\{(\\d+, \\d+)\\}"; // "+" is a quantifier meaning more digits
        Pattern pattern11a = Pattern.compile(challenge11Textgroupa);
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while(matcher11a.find()){
            System.out.println("Occurence " +matcher11a.group(1));
        }


    }
}
