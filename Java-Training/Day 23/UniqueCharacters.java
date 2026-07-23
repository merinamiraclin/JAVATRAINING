import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
    public static boolean hasAllUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "abcdefg";
        System.out.println("Has unique: " + hasAllUnique(test));
    }
}
