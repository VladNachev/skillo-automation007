package lecture6.exersices;

// Write a Java method to find the smallest number among three numbers
public class Exersice1 {
    public static void main(String[] args) {
        System.out.println("Smallest number is: " + smallestNumber(23, 44, 7));
    }


    static int smallestNumber(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            return a;
        }
        if ((b < c) && (b < a)) {
            return a;

        } else {
            return c;
        }

    }
}

