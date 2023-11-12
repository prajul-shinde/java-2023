package streams;

import java.util.List;

public class Peeking {
    public static void main(String[] args) {
        List<Movies> movies = List.of(
                new Movies("a", 10),
                new Movies("b", 20),
                new Movies("c", 30));

        movies.stream()
                .filter(m->m.getLikes()>10)
                .peek(m->System.out.println("filter "+ m.getName()))
                .map(Movies::getName)
                .peek(n->System.out.println("mapped "+n))
                .forEach(System.out::println);
    }
}
