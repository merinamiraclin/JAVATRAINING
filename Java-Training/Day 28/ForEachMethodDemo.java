import java.util.ArrayList;
import java.util.List;

public class ForEachMethodDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("JavaScript");

        list.forEach(System.out::println);
    }
}
