package streams;

import java.util.List;

public class ImperativeVsFunctionalDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20));

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

class Movie {
    private String name;
    private int likes;

    public Movie(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }
}
