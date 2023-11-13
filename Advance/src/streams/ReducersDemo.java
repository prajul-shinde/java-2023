package streams;

import java.util.List;
import java.util.Optional;

public class ReducersDemo {
    public static void main(String[] args) {
        List<Movies> movies = List.of(
            new Movies("a", 10),
            new Movies("b", 20),
            new Movies("c", 30)
        );
        
        boolean anyMatch = movies.stream().anyMatch(m -> m.getLikes() >20);
        Movies movies2 = movies.stream().findFirst().get();

        Integer reduce = movies.stream().map(Movies::getLikes).reduce(0,Integer::sum);

    }
}
