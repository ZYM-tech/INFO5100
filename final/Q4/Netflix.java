import java.util.List;

public class Netflix {
    List<Genre> genreList;

    Netflix(List<Genre> genreList){
        this.genreList = genreList;
    }

    public List<Genre> getGenreList(){
        return genreList;
    }
}
