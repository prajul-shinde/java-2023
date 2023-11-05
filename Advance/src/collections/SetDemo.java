package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);  // order is random, no duplicates
    }
}
