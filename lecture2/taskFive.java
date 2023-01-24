package lecture2;

import java.util.Scanner;

public class taskFive {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter side-A: ");
        float a = myObj.nextInt();

        System.out.println("Enter side-B: ");
        float b = myObj.nextInt();

        System.out.println("Enter side-C: ");
        float c = myObj.nextInt();

        System.out.println("Perimeter of the triangle: " + (a + b + c));

        System.out.println("Enter triangle's height: ");
        float h = myObj.nextInt();
        System.out.println("Area of the triangle: " + ((b * h) / 2));

    }

}