import java.util.*;

class Playlist {
    String playlistName;
    Set<String> songs = new LinkedHashSet<>();

    Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    void addSong(String song) {
        if (songs.add(song)) {
            System.out.println(song + " added to " + playlistName + " playlist.");
        } else {
            System.out.println(song + " is already in the playlist!");
        }
    }

    void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println(song + " removed from " + playlistName + " playlist.");
        }
    }

    void displayPlaylist() {
        System.out.println("Playlist: " + playlistName);
        for (String song : songs) {
            System.out.println(" - " + song);
        }
    }
}

public class Solution3 {
    public static void main(String[] args) {

        Playlist playlist = new Playlist("My Favorites");

        playlist.addSong("Shape of You");
        playlist.addSong("Blinding Lights");
        playlist.addSong("Shape of You");

        playlist.displayPlaylist();

        playlist.removeSong("Blinding Lights");

        playlist.displayPlaylist();
    }
}
