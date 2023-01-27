package lecture3;

public class largestNumberInArray {
    public static void main(String[] args) {
        int[] myArray = {23, 44, 1, 65, 87, 9, 123, 556};
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > j) {
                j = myArray[i];
            }

        }
        System.out.println(j);
    }
}
