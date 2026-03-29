class Restaurant {
    boolean foodReady = false;

    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() {
        try {
            if (!foodReady) {
                wait();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Waiter served food");
    }
}

public class U4_Program21_Restaurant {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> r.prepareFood());
        Thread waiter = new Thread(() -> r.serveFood());

        waiter.start();
        chef.start();
    }
}