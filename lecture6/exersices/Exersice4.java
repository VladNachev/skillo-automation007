package lecture6.exersices;

import java.util.Scanner;

public class Exersice4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = scn.nextLine();

        System.out.println("Number of the words in your sentence is: " + countWords(sentence));

    }

    public static int countWords(String sentence) {
        int wordCount = 0;

        boolean word = false;
        int endOfLine = sentence.length() - 1;

        for (int i = 0; i < sentence.length(); i++) {

            if (Character.isLetter(sentence.charAt(i)) && i != endOfLine) {
                word = true;

            } else if (!Character.isLetter(sentence.charAt(i)) && word) {
                wordCount++;
                word = false;

            } else if (Character.isLetter(sentence.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
