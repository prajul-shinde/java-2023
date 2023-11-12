package streams;

import java.util.List;

public class GettingUniqueElements {
    public static void main(String[] args) {
        List<Movies> movies = List.of(
                new Movies("a", 10),
                new Movies("a", 10),
                new Movies("b", 20),
                new Movies("c", 30));

        movies.stream()
                .map(Movies::getLikes)
                .distinct()
                .forEach(System.out::println);
    }
}
