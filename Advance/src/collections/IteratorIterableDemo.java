package collections;

import java.util.Iterator;

public class IteratorIterableDemo<T> implements Iterable<T> {

    private T[] items = (T[]) new Object[10];
    private int count;

    private void add(T item) {
        items[count++] = item;
    }

    private T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {

        private GenericList<T> list;
        private int index;
        

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }

    }
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("hi");
        list.add("prajul");
        list.forEach(System.out::println);
    }
}
