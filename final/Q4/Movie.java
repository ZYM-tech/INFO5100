import java.util.Date;
import java.util.List;

public class Movie {
    String title;
    Date releaseDate;//yyyy
    List<String> actors;
    String director;

    Movie(String title, Date releaseDate, List<String> actors, String director){
        this.title = title;
        this.releaseDate = releaseDate;
        this.actors = actors;
        this.director = director;
    }

    public String getTitle(){
        return title;
    }
    public Date getReleaseDate(){
        return releaseDate;
    }
    public List<String> getActors(){
        return actors;
    }
    public String getDirector(){
        return director;
    }
}