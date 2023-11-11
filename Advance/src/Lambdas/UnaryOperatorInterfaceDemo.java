package Lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = a -> a * a;
        UnaryOperator<Integer> increment = a -> a + 1;

        Integer result = increment.andThen(square).apply(1);
        System.out.println(result);
    }
}
