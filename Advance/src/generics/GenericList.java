package generics;

public class GenericList<T> {

    private T[] items = (T[]) new Object[10];

    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

}

class Test {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(1);
        // list.add(new User()); provided compile time type safety cannot add user here

        var item = list.get(0); // no casting required which was needed with Object[] solution
        System.out.println(item);
    }
}