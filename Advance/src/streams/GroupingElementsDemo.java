package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingElementsDemo {
    public static void main(String[] args) {
        var movies = List.of(
                new Movies("a", 10, Genre.ACTION),
                new Movies("b", 20, Genre.COMEDY),
                new Movies("c", 30, Genre.ACTION));

        Map<Genre, String> moviesByGenre = movies.stream().collect(Collectors.groupingBy(
                Movies::getGenre, Collectors.mapping(Movies::getName, Collectors.joining(","))));

        moviesByGenre.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
