public class U3_Program8_TextProcessingBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" Java");

        System.out.println("Modified String: " + sb);
    }
}

/*
Difference between StringBuilder and StringBuffer:

1. StringBuffer is thread-safe (synchronized).
2. StringBuilder is not thread-safe.
3. StringBuilder is faster than StringBuffer.
4. Use StringBuffer in multi-threading, StringBuilder in single-threading.
*/