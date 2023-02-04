package lecture5.exersices;

import java.util.Scanner;

public class Exersice3 {
    public static void main(String[] args) {
        int[][] myArray = new int[4][4];
        int value = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                Scanner scn = new Scanner(System.in);
                System.out.println("Enter value: ");
                value = scn.nextInt();
                myArray[i][j] = value;
                value = 0;
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                System.out.print(myArray[row][column] + " ");
            }
            System.out.println();
        }

    }
}
