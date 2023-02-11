package lecture7.samples.contructors;

public class Employee {
    String firstName;
    String lastName;
    int birthYear;

    public Employee(String fName, String lName, int bYear) {
        firstName = fName;
        lastName = lName;
        birthYear = bYear;
    }

    public Employee(String fName, String lName) {
        this(fName, lName, 2000);
    }
}