package lecture6.testPackage;

public class Animal {
    public void displayInfo() {
        System.out.println("I am an animal");

    }
}

class Dog extends Animal{
    public void displayInfo() {
        System.out.println("I am also a dog");
    }
}

class Cat extends Animal {
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am just a cat");

    }
}

class Execution {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
        System.out.println();
        Cat c1 = new Cat();
        c1.displayInfo();
    }
}