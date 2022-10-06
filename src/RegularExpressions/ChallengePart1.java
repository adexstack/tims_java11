package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChallengePart1 {

    public static void main(String[] args) {
        //challenge 1
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        //challenge 2
        String challenge2 = "I want a ball.";
        String regExp = "I want a \\w+."; //character class + quantifier
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));

        String regExp1 = "I want a (bike|ball)."; //group
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));

        //challenge 3
        String regExp3= "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1); // using the matcher class
        System.out.println(matcher.matches());

        //challenge 4
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));// Replacing all white spaces

        //challenge 5
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+")); //required chars inclusive with + quantifier
        System.out.println(challenge5.matches("[a-g]+")); //using range, also * quantifier would work for both

        //challenge 6 (matching the string entirety - The start and end and not just any part)
        String regex6 = "^a{3}bc{8}d{3}ef{3}g$"; // using quantifiers
        System.out.println(challenge5.matches(regex6));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$","REPLACED"));//using this also works. would only replace if the regex is correct

        Pattern pattern2 = Pattern.compile(regex6);
        Matcher matcher2 = pattern2.matcher(challenge5);
        boolean b = matcher2.matches();
        System.out.println(b);

        //challenge 7
        System.out.println("challenge 7-------------->");
        String challenge7 = "AbcD.135";
        System.out.println(challenge7.matches("^[A-z]+\\.\\d+$"));


    }
}
