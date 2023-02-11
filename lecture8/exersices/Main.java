package lecture8.exersices;

public class Main {
    public static void main(String[] args) {
        ClassExample myObject = new ClassExample();
        ClassExample.attr = 0;
        System.out.println(myObject.toString());
    }
}