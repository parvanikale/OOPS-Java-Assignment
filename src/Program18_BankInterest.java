class Bank {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Program18_BankInterest {
    public static void main(String[] args) {

        Bank b = new Bank();

        double interest1 = b.calculateInterest(10000);
        double interest2 = b.calculateInterest(20000);

        System.out.println("Interest for 10000: " + interest1);
        System.out.println("Interest for 20000: " + interest2);
    }
}