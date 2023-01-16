package RegularExpressions;

public class Regex {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString+"\n");

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y")+"\n");

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY")+"\n");

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY")+"\n");

        System.out.println("Got "+ alphanumeric.matches("^hello")+"\n");
        System.out.println(alphanumeric.matches("^abcDeee")+"\n");
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z")+"\n");

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END")+"\n");
        System.out.println(alphanumeric.replaceAll("[aei]", "X")+"\n");
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here")+"\n");
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X")+"\n");




    }
}
