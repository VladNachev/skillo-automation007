package lecture3;

public class task6 {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int n;
        for (int i = 0; i < numbers.length; i++) {
            n = numbers[i];
            if (n > 150){
                break;
            } else {
                if (n % 5 == 0){
                    System.out.println(n);
                }
            }

        }

    }
}
