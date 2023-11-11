package Lambdas;

public class MethodReferenceDemo {
    
    public static void main(String[] args) {
        show();
    }

    public MethodReferenceDemo(String message){}

    private static void show() {
        greet(MethodReferenceDemo::print);
        greet(MethodReferenceDemo::new);
    }

    public static void print(String message){
        System.out.println("print method");
    }

    private static void greet(Printer printer) {
        System.out.println("greet method");
        printer.print("Hello World");
    }
}
