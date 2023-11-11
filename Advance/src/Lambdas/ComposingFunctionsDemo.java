package Lambdas;

import java.util.function.Function;

public class ComposingFunctionsDemo {
    public static void main(String[] args) {
        Function<String ,String> replaceFunction = str -> str.replace(":", "=");
        Function<String, String> addBraces = str ->  "{" + str + "}";

        String result = replaceFunction.andThen(addBraces).apply("key:value");

        System.out.println(result);

        String resultUsingCompose = addBraces.compose(replaceFunction).apply("key:value");
        System.out.println(resultUsingCompose);
    }
}
