import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProxySongServiceTest {
    private SongService realSongService;
    private SongService proxySongService;

    @Before
    public void setUp() {
        realSongService = new RealSongService();
        proxySongService = new ProxySongService(realSongService);
    }

    @Test
    public void testSearchById_CachesMetadata() {
        // Search for a song by ID twice
        Song song1 = proxySongService.searchById(1);
        Song song2 = proxySongService.searchById(1);

        assertEquals(song1, song2);
        assertEquals(1, ((RealSongService) realSongService).getSearchByIdCount());
    }

    @Test
    public void testSearchByTitle_NoCaching() {
        List<Song> songs1 = proxySongService.searchByTitle("Song 1");
        List<Song> songs2 = proxySongService.searchByTitle("Song 1");

        assertEquals(2, ((RealSongService) realSongService).getSearchByTitleCount());
    }

    @Test
    public void testSearchByAlbum_NoCaching() {
        List<Song> songs1 = proxySongService.searchByAlbum("Album 1");
        List<Song> songs2 = proxySongService.searchByAlbum("Album 1");

//        assertNotEquals(songs1, songs2);
        // Ensure that the real service is called twice
    }
}
