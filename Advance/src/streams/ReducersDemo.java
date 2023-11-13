package streams;

import java.util.List;

public class ReducersDemo {
    public static void main(String[] args) {
        List<Movies> movies = List.of(
            new Movies("a", 10),
            new Movies("b", 20),
            new Movies("c", 30)
        );
        
        boolean anyMatch = movies.stream().anyMatch(m -> m.getLikes() >20);
        Movies movies2 = movies.stream().findFirst().get();
        
    }
}
