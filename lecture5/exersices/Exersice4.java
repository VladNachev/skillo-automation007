package lecture5.exersices;

// Description: Find biggest element of an array and print it in the console

public class Exersice4 {
    public static void main(String[] args) {
        int[] myArray = {123, 44, 6663, 2, 4534};
        int element = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (element < myArray[i]) {
                element = myArray[i];
            }
        }
        System.out.println("The biggest element of the array is " + element);
    }

}
