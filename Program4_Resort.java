class Resort {

    int RNo;
    String Name;
    float Charges;
    int Days;

    void Getinfo(int r, String n, float c, int d) {
        RNo = r;
        Name = n;
        Charges = c;
        Days = d;
    }

    double Compute() {
        double amount = Days * Charges;

        if (amount > 11000) {
            amount = 1.02 * amount;
        }

        return amount;
    }

    void DispInfo() {
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per day: " + Charges);
        System.out.println("Days Stayed: " + Days);
        System.out.println("Total Amount: " + Compute());
    }
}

public class Program4_Resort {

    public static void main(String[] args) {

        Resort r = new Resort();

        r.Getinfo(101, "Rahul", 2000, 6);
        r.DispInfo();
    }
}