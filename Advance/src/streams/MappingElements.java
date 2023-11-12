package streams;

import java.util.List;
import java.util.stream.Stream;

public class MappingElements {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("a", 30));

             movies.stream().map(Movie::getLikes).forEach(System.out::println);

        Stream<List<Integer>> listOfStreams = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));

        listOfStreams.flatMap(list -> list.stream()).forEach(System.out::println);
    }
}

class Movie {
    private String title;
    private int likes;

    public String getTitleOfMovie() {
        return title;
    }

    public Movie(String name, int likes) {
        this.title = name;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }
}