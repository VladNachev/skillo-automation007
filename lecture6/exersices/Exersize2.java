package lecture6.exersices;

// Write a Java method to compute the average of three numbers
public class Exersize2 {
    public static void main(String[] args) {
        double averageSum = averageFunc(23, 54, 62);
        System.out.println("The average of the three numbers is " + averageSum);

    }

    static double averageFunc(int a, int b, int c) {
        return ((a + b + c) / 3);

    }
}
