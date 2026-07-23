import java.util.HashSet;
import java.util.Set;

public class SetBasics {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Elephant");
        set.add("Dog");

        System.out.println("Set size: " + set.size());
        System.out.println("Contains Cat: " + set.contains("Cat"));

        set.remove("Elephant");

        for (String animal : set) {
            System.out.println(animal);
        }
    }
}
