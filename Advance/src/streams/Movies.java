package streams;
public class Movies {
    private String name;
    private int likes;
    private Genre genre;
    

    public Movies(String name, int likes, Genre genre) {
        this.name = name;
        this.likes = likes;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

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