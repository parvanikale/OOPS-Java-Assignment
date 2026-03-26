public class U4_Program16_MusicPlayer extends Thread {

    public void run() {
        System.out.println("Playing song...");
        try {
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000);
                System.out.println("Progress " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        U4_Program16_MusicPlayer t = new U4_Program16_MusicPlayer();
        t.start();
    }
}