package entities;


import java.awt.*;
import java.util.List;

public class Episode {

    private long episodeId;
    private String name;
    private Season season;
    private int episodeNumber;
    private long length;
    private Category category;
    private List<Image> images;
    private Participant director;
    private List<Participant> actors;
    private int rating;

}
