package Generics;

import java.util.ArrayList;

// Optimising Main.java using Generics
public class MainUsingGenerics {
    public static void main(String[] args) {

        printDoubled(arrBuild());

    }
    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n){
            System.out.println( i * 2);
        }
    }

    private static ArrayList<Integer> arrBuild(){
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        //items.add("String here"); //compile time error
        items.add(3);
        items.add(5);
        return items;
    }
}
