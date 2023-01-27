package lecture3;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = myObj.nextInt();
        if (age >= 16) {
            System.out.println("You are eligible to work");
        } else {
            System.out.println("You are not eligible to work");
        }
    }
}