import java.util.List;

public class Main {
    public static void main(String[] args) {
        SongService realSongService = new RealSongService();
        SongService proxySongService = new ProxySongService(realSongService);
        Song song1 = proxySongService.searchById(1);
        List<Song> songsByTitle = proxySongService.searchByTitle("Song 1");
        List<Song> songsByAlbum = proxySongService.searchByAlbum("Album 1");

        // Results
        System.out.println("Song 1: " + song1.getTitle());
        System.out.println("Songs with title 'Song 1': ");
        for (Song song : songsByTitle) {
            System.out.println(song.getTitle());
        }
        System.out.println("Songs in album Album 1: ");
        for (Song song : songsByAlbum) {
            System.out.println(song.getTitle());
        }
    }
}