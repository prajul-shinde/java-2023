package streams;

import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    
    public static void main(String[] args) {
        List<Movies> movies = List.of(
            new Movies("a", 10),
            new Movies("b", 10),
            new Movies("c", 10)
        );

        movies.stream().sorted(Comparator.comparing(Movies::getName).reversed()).forEach(System.out::println);
    }

}


