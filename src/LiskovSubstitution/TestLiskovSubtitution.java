package LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class TestLiskovSubtitution {
    public static void main(String[] args) {
        List <Media> media = new ArrayList<Media>();
        media.add(new TrailerPlayer());
        media.add(new FilmPlayer());
        playAll(media);
}
    public static void playAll(List<Media> players) {
        for (Media media: players) {
            media.watchFilm();
            media.playTrailer();
        }
    }
}


