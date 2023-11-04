package generics;

public class User implements Comparable<User> {

    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // if this < other => -1
        // greater than then 1
        //if equal then 0
        return this.points - other.points;
    }
    
}
