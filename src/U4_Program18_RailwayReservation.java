class RailwayReservation {
    int seats = 1;

    synchronized void book(String name) {
        if (seats > 0) {
            System.out.println(name + ": Ticket booked successfully");
            seats--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }
}

class MyThread extends Thread {
    RailwayReservation r;
    String name;

    MyThread(RailwayReservation r, String n) {
        this.r = r;
        name = n;
    }

    public void run() {
        r.book(name);
    }
}

public class U4_Program18_RailwayReservation {
    public static void main(String[] args) {

        RailwayReservation r = new RailwayReservation();

        MyThread t1 = new MyThread(r, "User1");
        MyThread t2 = new MyThread(r, "User2");

        t1.start();
        t2.start();
    }
}