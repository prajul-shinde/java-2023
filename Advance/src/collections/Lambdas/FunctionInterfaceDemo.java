package collections.Lambdas;

public class FunctionInterfaceDemo {
    public static void showUsingAnonymousInnerClass() {
        greet(new Printer() {

            @Override
            public void print(String message) {
                System.out.println(message);
            }

        });
    }

    public static void showUsingLambda() {
        greet(message -> System.out.println(message));
    }

    private static void greet(Printer printer) {
        printer.print("hello world");
    }

    public static void main(String[] args) {
        showUsingAnonymousInnerClass();
        showUsingLambda();
    }
}