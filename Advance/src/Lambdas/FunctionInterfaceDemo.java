package Lambdas;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<String, Integer> map = str -> str.length();
        Integer length = map.apply("rohit_sharma");
        System.out.println(length);
    }
}
