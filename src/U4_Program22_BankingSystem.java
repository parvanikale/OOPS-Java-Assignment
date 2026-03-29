class BankAccount {
    int balance = 1000;

    void withdraw(String name, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(name + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance for " + name);
            }
        }
    }
}

public class U4_Program22_BankingSystem {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        Thread t1 = new Thread(() -> acc.withdraw("User1", 700));
        Thread t2 = new Thread(() -> acc.withdraw("User2", 500));

        t1.start();
        t2.start();
    }
}