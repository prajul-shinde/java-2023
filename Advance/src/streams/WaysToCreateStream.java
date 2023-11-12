package streams;

import java.util.stream.Stream;

public class WaysToCreateStream {

    
    public static void main(String[] args) {
        Stream.of(1,2,3).forEach(System.out::println);
        Stream.iterate(1, n -> n+1).limit(3).forEach(System.out::println);
        Stream.generate(()->Math.random()).limit(4).forEach(System.out::println);
    }
    
}
