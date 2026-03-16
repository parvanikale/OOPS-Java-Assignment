abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Credit Card.");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment of " + amount + " done using UPI.");
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Net Banking.");
    }
}

public class Program12_Payment {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        p1.pay(2000);
        p2.pay(1500);
        p3.pay(3000);
    }
}