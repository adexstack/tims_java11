package RegularExpressions;

public class ChallengePart3 {

    public static void main(String[] args) {
        //challenge 12 (Write a regex that would match US Zip code)
        System.out.println("challenge 12----(Write a regex that would match US Zip code)---------->");

        String challenge12 = "11111";
        String regexChallenge12 = "^\\d{5}$";
        System.out.println(challenge12.matches(regexChallenge12));

        //challenge 13 (Write a regex that would match 11111-1111)
        System.out.println("challenge 13----(Write a regex that would match 11111-1111)---------->");

        String challenge13 = "11111-1111";
        String regexChallenge13 = "^\\d{5}-\\d{4}$";
        System.out.println(challenge13.matches(regexChallenge13));

        //challenge 14 (Write a regex that would match 11111-1111)
        System.out.println("challenge 14----(Write a regex that would match both 11111 and 11111-1111)---------->");

        String regexChallenge12And13 = "^\\d{5}(-\\d{4})?$"; //using quantifier "?" to match 0 or 1 group occurence
        System.out.println(challenge12.matches(regexChallenge12And13));
        System.out.println(challenge13.matches(regexChallenge12And13));


    }
}

