package lecture5.exersices;

//Write program to print sum of a given array elements
public class Exersice1 {
    public static void main(String[] args) {
        int[] myArray = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("Sum of array elements: " + sum);

    }
}
