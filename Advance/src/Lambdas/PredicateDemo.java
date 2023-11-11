package Lambdas;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        boolean hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace).test("{prajul}");
        System.out.println(hasLeftAndRightBrace);
    }
}
