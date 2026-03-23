public class U3_Program7_TextEditorBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");

        // Insert text
        sb.insert(5, " Java");

        // Reverse string
        sb.reverse();

        System.out.println("Final String: " + sb);
    }
}