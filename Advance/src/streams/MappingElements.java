package streams;

import java.util.List;
import java.util.stream.Stream;

public class MappingElements {
    public static void main(String[] args) {
        var movies = List.of(
                new Movies("a", 10),
                new Movies("b", 20),
                new Movies("a", 30));

             movies.stream().map(Movies::getName).forEach(System.out::println);

        Stream<List<Integer>> listOfStreams = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));

        listOfStreams.flatMap(list -> list.stream()).forEach(System.out::println);
    }
}