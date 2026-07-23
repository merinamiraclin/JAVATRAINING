import java.util.HashMap;
import java.util.Map;

public class MapBasics {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Map size: " + map.size());
        System.out.println("Contains Apple: " + map.containsKey("Apple"));
        System.out.println("Value for Banana: " + map.get("Banana"));

        map.remove("Cherry");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
