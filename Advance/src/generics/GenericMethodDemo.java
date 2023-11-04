package generics;

public class GenericMethodDemo {

    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    // mutltiple type parameters
    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }

    public static void main(String[] args) {
        var max = GenericMethodDemo.max(1, 2);
        System.out.println(max);

        var max2 = GenericMethodDemo.max(new User(20), new User(15));
        System.out.println("max user " + max2);

        print(1, "Age");

    }

}
