package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        printDoubled(arrBuild());

    }
    private static void printDoubled(ArrayList n) {
        for (Object i : n){
            System.out.println((Integer) i * 2);
        }
    }

    private static ArrayList<Integer> arrBuild(){
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(5);
        return items;
    }
}
