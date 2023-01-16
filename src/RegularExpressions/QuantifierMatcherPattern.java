package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
// https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html


public class QuantifierMatcherPattern {

    public static void main(String[] args) {
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println("2 : "+newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println("3 : "+newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println("4 : "+newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println("5 : "+newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println("6 : "+newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println("7 : "+newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println("8 : "+newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));
        System.out.println(hasWhitespace.replaceAll("\\S", ""));
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));

        String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

    }
}

