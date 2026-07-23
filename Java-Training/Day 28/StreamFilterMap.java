import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Charlie");

        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        for (String name : filteredNames) {
            System.out.println(name);
        }
    }
}
