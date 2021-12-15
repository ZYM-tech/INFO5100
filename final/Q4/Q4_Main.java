import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class Q4_Main {
    public static void main(String[] args)throws ParseException {
        //Q4.1 Add movies
        Date d1 = new GregorianCalendar(1998, Calendar.JANUARY, 1).getTime();
        Date d2 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date d3 = new GregorianCalendar(2021, Calendar.JANUARY, 1).getTime();
        Date d4 = new GregorianCalendar(1989, Calendar.JANUARY, 1).getTime();
        Date year2000 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date year1990 = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();

        List<String> actors1 = new ArrayList<>();
        actors1.add("Jack");
        actors1.add("Rose");
        actors1.add("Captain");

        List<String> actors2 = new ArrayList<>();
        actors1.add("John");
        actors1.add("Tom");
        actors1.add("Ahn");

        List<String> actors3 = new ArrayList<>();
        actors1.add("Lucy");
        actors1.add("Rose");
        actors1.add("Shangchi");

        List<String> actors4 = new ArrayList<>();
        actors1.add("Tom");
        actors1.add("Ming");
        actors1.add("Chris");

        Movie movie1 = new Movie("Titanic",d1, actors1,"ZYM");
        Movie movie2 = new Movie("Iron Man",d2, actors2,"YYY");
        Movie movie3 = new Movie("Shang-Chi",d3, actors3,"MMM");
        Movie movie4 = new Movie("Tom the Cat",d4, actors4,"KKK");

        List<Movie> genre_romance = new ArrayList<>();
        genre_romance.add(movie1);
        genre_romance.add(movie4);

        List<Movie> genre_scifi = new ArrayList<>();
        genre_romance.add(movie2);
        genre_romance.add(movie3);

        Genre romantic = new Genre(genre_romance);
        Genre scifi = new Genre(genre_scifi);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(romantic);
        genreList.add(scifi);
        Netflix netflix = new Netflix(genreList);

        //Q4.2 flatMap
        netflix.genreList.stream()
                .flatMap(genre -> genre.movieList.stream())
                .filter(movie -> movie.releaseDate.before(year2000))
                .forEach(movie -> movie.title = movie.getTitle() + "(Classic)");

        //Q4.3
        List<Movie> res = netflix.genreList.stream().flatMap(genre -> genre.movieList.stream()).sorted(new Comparator<Movie>(){
            @Override
            public int compare(Movie m1, Movie m2) {
                return m2.releaseDate.compareTo(m1.releaseDate);
            }
        }).limit(3).collect(Collectors.toList());

        //Q4.4
        List<Movie> allMovie = netflix.genreList.stream().flatMap(genre -> genre.movieList.stream()).collect(Collectors.toList());
        Predicate<Movie> before2000 = movie -> movie.releaseDate.before(year2000);
        Predicate<Movie> after1990 = movie -> movie.releaseDate.after(year1990);
        for (Movie movie: allMovie) {
            if(before2000.test(movie) && after1990.test(movie)){
                System.out.println(movie.title);
            }
        }

        //Q4.5
        for(Movie movie : allMovie) {
            SimpleDateFormat date = new SimpleDateFormat("yyyy");
            String yyyy = date.format(movie.releaseDate);
            movie.title = movie.title + yyyy;
        }

        //Q4.6
        Collections.sort(allMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.title.compareTo(m2.title);
            }
        });
    }
}
