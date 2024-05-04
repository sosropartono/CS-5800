import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RealSongService implements SongService {
    private Map<Integer, Song> songMap;
    private int searchByIdCount;
    private int searchByTitleCount;

    public RealSongService() {
        // Initialize song data
        songMap = new HashMap<>();
        songMap.put(1, new Song(1, "Song 1", "Artist 1", "Album 1", 180));
        songMap.put(2, new Song(2, "Song 2", "Artist 2", "Album 2", 200));
        songMap.put(3, new Song(3, "Song 3", "Artist 3", "Album 1", 220));
        searchByIdCount = 0;
        searchByTitleCount = 0;
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchByIdCount++;
        return songMap.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        // Implementation omitted for brevity
        searchByTitleCount++;
        return null;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        // Implementation omitted for brevity
        return null;
    }

    // Method to retrieve the number of times searchById is called
    public int getSearchByIdCount() {
        return searchByIdCount;
    }

    // Method to retrieve the number of times searchByTitle is called
    public int getSearchByTitleCount() {
        return searchByTitleCount;
    }
}
