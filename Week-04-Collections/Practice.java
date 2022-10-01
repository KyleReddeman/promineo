import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Set<StringBuilder> set = new HashSet<>();
        set.add(new StringBuilder("hello"));
        set.add(new StringBuilder("world"));

        System.out.println(set.toString());
    }
}