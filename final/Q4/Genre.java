import java.util.List;

public class Genre {
    List<Movie> movieList;

    public Genre(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getGenres() {
        return movieList;
    }
}