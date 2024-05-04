import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Song class to represent song metadata
class Song {
    private Integer songID;
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Song(Integer songID, String title, String artist, String album, int duration) {
        this.songID = songID;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public Integer getSongID() {
        return songID;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }
}
