import java.util.Scanner;

public class U3_Program1_UsernameValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Clean input
        username = username.trim();
        username = username.toLowerCase();

        System.out.println("Cleaned Username: " + username);

        sc.close();
    }
}