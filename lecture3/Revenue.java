package lecture3;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        float discount;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter unit price: ");
        float singePrice = scn.nextInt();

        System.out.println("Enter quantity: ");
        float quantity = scn.nextInt();

        float total = singePrice * quantity;

        if (quantity >= 100 && quantity <= 120) {
            discount = 15;
            System.out.println("Discount: " + (total * 0.15) + "$ (" + discount + "%)");
            System.out.println("The revenue from sale: " + (total - (total * 0.15)) + "$");
        }
        if (quantity < 100) {
            discount = 0;
            System.out.println("Discount: " + (total * 0) + "$ (" + discount + "%)");
            System.out.println("The revenue from sale: " + (total - (total * 0)) + "$");
        }
        if (quantity > 120) {
            discount = 20;
            System.out.println("Discount: " + (total * 0.25) + "$ (" + discount + "%)");
            System.out.println("The revenue from sale: " + (total - (total * 0.25)) + "$");
        }

    }

}
