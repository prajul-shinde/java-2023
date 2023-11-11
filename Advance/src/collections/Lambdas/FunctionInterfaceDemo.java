package collections.Lambdas;

public class FunctionInterfaceDemo {
   public static void show(){
    greet (new Printer() {

        @Override
        public void print(String message) {
            System.out.println(message);
        }
        
    });
   }

    private static void greet(Printer printer) {
        printer.print("hello world");
    }

    public static void main(String[] args) {
        show();
    }
}