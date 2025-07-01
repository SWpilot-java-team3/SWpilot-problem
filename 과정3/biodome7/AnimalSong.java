package 과정3.biodome7;

public class AnimalSong extends Song{
    String animal;


    public AnimalSong(String title, int duration, String artist, String animal) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.animal = animal;
    }
}
