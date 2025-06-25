package 과정3.biodome7;

public class ManagerSong extends Song{
    String genre;
    public ManagerSong(String title, int duration, String artist, String genre) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.genre = genre;
    }
}
