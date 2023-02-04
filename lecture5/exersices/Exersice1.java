package lecture5.exersices;

public class Exersice1 {
    public static void main(String[] args) {
        System.out.println(smallestNumber(123, 34, 45));

    }
    public static int smallestNumber(int a, int b, int c) {
        int number = 0;
        if ((a < b) && (a < c)) {
            number = a;
        }
        if ((b < a) && (b < c)) {
            number = b;
        }
        if ((c < a) && (c < b)) {
            number = c;
        }
        return number;

    }
}
