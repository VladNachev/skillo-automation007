package lecture6.testPackage;

public class Testing2 {
    private int age;

    public void setTesting2(int age){
        this.age = age;

    }
    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        Testing2 t1 = new Testing2();
        t1.setTesting2(21);

        System.out.println(t1.getAge());


    }
}
