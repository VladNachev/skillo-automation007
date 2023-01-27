package lecture3;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7: ");
        int number = myObj.nextInt();

        if (number >= 1 && number <= 7) {
            switch (number) {
                case 1:
                    System.out.println("The " + number + "-st day of the week is Monday");
                    break;
                case 2:
                    System.out.println("The " + number + "-nd day of the week is Tuesday");
                    break;
                case 3:
                    System.out.println("The " + number + "-rd day of the week is Wednesday");
                    break;
                case 4:
                    System.out.println("The " + number + "-th day of the week is Thursday");
                    break;
                case 5:
                    System.out.println("The " + number + "-th day of the week is Friday");
                    break;
                case 6:
                    System.out.println("The " + number + "-th day of the week is Saturday");
                    break;
                case 7:
                    System.out.println("The " + number + "-th day of the week is Sunday");
                    break;
            }

        } else {
            System.out.println("Invalid number entered!");
        }
    }

}
