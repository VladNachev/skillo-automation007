package lecture5.exersices;

// Description: Find sum of the diagonal of a given 2d matrix with 4 rows and 4 columns
public class Exersice6 {
    public static void main(String[] args) {
        int[][] myArray = {
                {34, 34, 6, 5},
                {334, 55, 1, 6},
                {12, 34, 5, 6},
                {123, 34, 69, 7}
        };
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                System.out.print(myArray[row][column] + " ");
            }
            System.out.println();
        }
    }
}
