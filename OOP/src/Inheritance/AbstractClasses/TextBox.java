package Inheritance.AbstractClasses;

public class TextBox extends UIControl {

    private String text;

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    @Override
    public String toString() {
        return "TextBox [text: " + text + "]";
    }

    @Override
    public void render() {
        System.out.println("rendering textBox");
    }

}
