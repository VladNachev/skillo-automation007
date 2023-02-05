package lecture6.exersices;

import java.util.*;
import java.util.Scanner;

public class Exersice3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scn.nextLine();

        if (word.length() % 2 == 0) {
            System.out.println(evenFunc(word));


        } else {
            System.out.println(oddFunc(word));
        }

    }

    static Character oddFunc(String word) {
        int middleIndex = (word.length() / 2);
        return word.charAt(middleIndex);


    }

    static String evenFunc(String word) {
        int middleIndex = (word.length() / 2);
        char middleChar;
        char nexChar;
        middleChar = word.charAt(middleIndex);
        nexChar = word.charAt(middleIndex - 1);

        String strConcatenate = String.format("%s%s", middleChar, nexChar);
        return strConcatenate;
    }
}
