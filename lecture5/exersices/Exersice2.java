package lecture5.exersices;

// Print elements of a given 2-d matrix with 4 rows and 3 columns
public class Exersice2 {
    public static void main(String[] args) {
        int[][] myArray = {
                {34, 34, 6},
                {334, 55, 1},
                {12, 34, 5},
                {123, 34, 69}
        };
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(myArray[row][column] + " ");
            }
            System.out.println();
        }
    }
}
