package lecture3;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        String optionBeach = "Beach";
        String optionMountain = "Mountain";
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter destination: ");
        String optionUser = scn.next();

        if ((!optionUser.equals(optionBeach)) && (!optionUser.equals(optionMountain))) {
            System.out.println("No information about this type of vacation");

        } else {
            System.out.println("Enter budjet per day: ");
            int budjet = scn.nextInt();

            if (optionUser.equals(optionBeach)) {
                if (budjet < 50) {
                    System.out.println("You should visit bulgarian beaches");
                } else {
                    System.out.println("You could enjoy some foreigh beach resort");
                }
            }
            if (optionUser.equals(optionMountain)) {
                if (budjet < 30) {
                    System.out.println("You should visit bulgarian mountain resorts, like Bansko, Pamporovo, etc.");
                } else {
                    System.out.println("You could enjoy some foreigh mountain resort");
                }

            }

        }

    }
}