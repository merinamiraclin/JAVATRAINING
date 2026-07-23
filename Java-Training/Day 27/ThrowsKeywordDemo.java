import java.io.IOException;

public class ThrowsKeywordDemo {
    public static void method() throws IOException {
        throw new IOException("Device error");
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
