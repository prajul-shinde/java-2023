package streams;

import java.util.List;

public class ReducersDemo {
    public static void main(String[] args) {
        List.of(
            new Movies("a", 10),
            new Movies("b", 20),
            new Movies("c", 30)
        );
    }
}
