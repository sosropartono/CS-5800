import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProxySongService implements SongService {
private SongService realSongService;
private Map<Integer, Song> songCache;

public ProxySongService(SongService realSongService) {
        this.realSongService = realSongService;
        this.songCache = new HashMap<>();
        }

@Override
public Song searchById(Integer songID) {
        // Check if song metadata is cached
        if (songCache.containsKey(songID)) {
        return songCache.get(songID);
        }
        // Fetch song metadata from the server and cache it
        Song song = realSongService.searchById(songID);
        songCache.put(songID, song);
        return song;
        }

@Override
public List<Song> searchByTitle(String title) {
        // Delegate to the real service without caching
        return realSongService.searchByTitle(title);
        }

@Override
public List<Song> searchByAlbum(String album) {
        // Delegate to the real service without caching
        return realSongService.searchByAlbum(album);
        }
        }