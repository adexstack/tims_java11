// Usins asList method . Smarter and cleaner than using many ".add"
package Generics;

import java.util.Arrays;
import java.util.List;

public class MainasList {
    public static void main(String[] args) {

        printDoubled(arrBuild());

    }
    private static void printDoubled(List n) {
        for (Object i : n){
            System.out.println((Integer) i * 2);
        }
    }

    private static List<Integer> arrBuild(){
        Integer[] nums = new Integer[] {1,2,3,5};

        List<Integer> items = Arrays.asList(nums);

        return items;
    }
}
