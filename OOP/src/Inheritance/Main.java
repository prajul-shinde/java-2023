package Inheritance;

public class Main {
    public static void main(String[] args) {
        TextBox textBox = new TextBox();
        textBox.setText("Hello");
        System.out.println(textBox.toString());

        UIControl control = new UIControl(true);
        TextBox textBox2 = new TextBox();
        show(control);
        show(textBox2);
    }

    private static void show(UIControl control) {
        if(control instanceof TextBox){
            var textBox = (TextBox) control;
            textBox.setText("Hello");
        }
        System.out.println(control);
    }
    
}
