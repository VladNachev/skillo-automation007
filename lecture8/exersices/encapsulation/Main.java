package lecture8.exersices.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Ivan Ivanov");
        b.getAccountBalance();
        b.getAccountNumber();

        System.out.println("Owner name: " + b.getOwnerName());
        System.out.println("Account Balance " + b.getAccountBalance());
        System.out.println("Account Number: " + b.getAccountNumber());
    }
}