package streams;
public class Movies {
    private String name;
    private int likes;

    public Movies(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", likes=" + likes + "]";
    }

}