package Inheritance.CompareObjects;

import Inheritance.TextBox;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(new TextBox()));

        // we overriden hashcode method so if x and y equals then same hashcode.
        System.out.println("hashcode " + point1.hashCode());
        System.out.println("hashcode " + point2.hashCode());
    }
}
