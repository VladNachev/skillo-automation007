package lecture7.excersices;

public class MyTempTest {
    private String robotName;
    private int robotAge;

    public MyTempTest(String robotName, int robotAge){
        this.robotName = robotName;
        this.robotAge = robotAge;
    }

    public void speak() {
        System.out.println("Hello, human! I am a robot. My name is " + this.robotName);
    }

    public int getRobotAge() {
        return this.robotAge;
    }
    public static void main(String[] args) {
        MyTempTest Alpha007 = new MyTempTest("Alpha007", 27);
        Alpha007.speak();

        int actualAge = Alpha007.getRobotAge();
        System.out.println("Actual age: " + actualAge);

    }
}