public class U3_Program9_StudentToString {

    int id;
    String name;

    // Constructor
    U3_Program9_StudentToString(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString()
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {

        U3_Program9_StudentToString s1 =
                new U3_Program9_StudentToString(101, "Parvani");

        // Display using toString()
        System.out.println(s1);
    }
}