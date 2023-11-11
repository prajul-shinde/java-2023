package Lambdas;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        intList.forEach(System.out::println);

        // chaining consumer
        List<String> list = List.of("a", "b", "c");

        Consumer<String> print = System.out::println;
        Consumer<String> printUppercase = item -> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUppercase));
    }

}
