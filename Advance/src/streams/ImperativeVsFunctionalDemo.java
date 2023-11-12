package streams;

import java.util.List;

public class ImperativeVsFunctionalDemo {
    public static void main(String[] args) {
        List<Movies> movies = List.of(
                new Movies("a", 10),
                new Movies("b", 15),
                new Movies("c", 20));

        // imperative way to get count to movies having more than 10 likes

        int count = 0;
        for (var movie : movies)
            if (movie.getLikes() > 10)
                count++;

        System.out.println("count imperative way: " + count);

        // declarative way : focus on what not how
        long count2 = movies.stream().filter(movie -> movie.getLikes() > 10).count();
        System.out.println("count with declarative way: " + count2);

    }
}
