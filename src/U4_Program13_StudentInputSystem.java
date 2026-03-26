import java.util.*;

class StudentInputSystem {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student age: ");
            int age = sc.nextInt();


            System.out.println("Student age is: " + age);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Invalid input");
        }
    }
}