package lecture6.exersices;

import java.util.Scanner;

public class Exersice5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scn.nextInt();

        System.out.println(isEven(number));

    }
    static boolean isEven (int number){
        boolean check;
        if (number % 2 == 0) {
            check = true;
        }
        else {
            check = false;
        }
        return check;
    }
}
