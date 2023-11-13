package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
               var movies = List.of(
                new Movies("a", 10),
                new Movies("b", 20),
                new Movies("a", 30));

                Map<String, Integer> moviesMap = movies.stream().filter(m->m.getLikes() >10 ).collect(Collectors.toMap(Movies::getName, Movies::getLikes));
                moviesMap.forEach((k,v) -> System.out.println(k + v));

                String names = movies.stream().filter(m->m.getLikes()>10).map(Movies::getName).collect(Collectors.joining(","));
                System.out.println(names);
    }
}
