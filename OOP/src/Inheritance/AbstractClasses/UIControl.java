package Inheritance.AbstractClasses;

public abstract class UIControl {

    private boolean isEnabled = true;

    public UIControl() {
    }

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public abstract void render();

}
