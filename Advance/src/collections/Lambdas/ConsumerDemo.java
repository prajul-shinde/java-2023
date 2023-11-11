package collections.Lambdas;

import java.util.List;

public class ConsumerDemo {
    public static void main(String[] args) {
         List<Integer> intList = List.of(1,2,3);
        intList.forEach(System.out::println);
    }
    
}
