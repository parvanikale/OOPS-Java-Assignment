public class U4_Program17_DownloadManager implements Runnable {

    String file;

    U4_Program17_DownloadManager(String f) {
        file = f;
    }

    public void run() {
        System.out.println("Downloading " + file);
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new U4_Program17_DownloadManager("File1"));
        Thread t2 = new Thread(new U4_Program17_DownloadManager("File2"));

        t1.start();
        t2.start();
    }
}