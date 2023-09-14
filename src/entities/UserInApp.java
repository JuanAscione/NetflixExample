package entities;

import java.awt.*;
import java.util.List;

public class UserInApp {    //when having multiple users within an account

    private Client clientOwner;
    private String name;
    private Image profileImage;

    private List<Movie> seenMovies;
    private List<Serie> seenSeries;
    private List<Episode> seenEpisodes;

    private List<Movie> LikedMovies;
    private List<Serie> LikedSeries;

    private List<Movie> recommendedMovies;
    private List<Serie> recommendedSeries;

}
