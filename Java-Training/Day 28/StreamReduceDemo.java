import java.util.ArrayList;
import java.util.List;

public class StreamReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum = numbers.stream()
            .reduce(0, (ans, i) -> ans + i);

        System.out.println("Sum of numbers: " + sum);
    }
}
