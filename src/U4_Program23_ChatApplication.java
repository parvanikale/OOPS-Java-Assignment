class Sender extends Thread {
    public void run() {
        System.out.println("Sending message...");
    }
}

class Receiver extends Thread {
    public void run() {
        System.out.println("Receiving message...");
    }
}

public class U4_Program23_ChatApplication {
    public static void main(String[] args) {

        Sender s = new Sender();
        Receiver r = new Receiver();

        System.out.println("Thread State before start: " + s.getState());

        s.start();
        r.start();

        System.out.println("Thread State after start: " + s.getState());
    }
}