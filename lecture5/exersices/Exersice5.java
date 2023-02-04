package lecture5.exersices;


// Description: Reverse the order of the elements in a LinkedList using algorithm

import java.util.ArrayList;

public class Exersice5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>() {
            {
                add("Vlad");
                add("Peter");
                add("Monika");
                add("Constantin");
            }
        };
        System.out.println("Initial order of the ArrayList: " + names);

        int arrSize = names.size();
        int position = arrSize;
        ;
        for (int i = 0; i < arrSize; i++) {

            String tempName = names.get(0);
            names.add(position, tempName);
            position = position - 1;
            names.remove(0);
        }
        System.out.println("Same ArrayList after the reversing process: " + names);

    }
}
