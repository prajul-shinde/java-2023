package generics;

public class ComparableDemo {

    public static void main(String[] args) {
        User user1 = new User(10);
        User user2 = new User(10);
        if (user1.compareTo(user2) > 0)
            System.out.println("user1 greater than 2");
        else if (user1.compareTo(user2) < 0)
            System.out.println("user2 greater than user 1");
        else
            System.out.println("user 1 and user2 are equal");

    }
}
