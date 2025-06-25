package 과정3.biodome7;

public class Player {
    Song song;
    int volume;
    boolean isPlaying;

    public Player(Song song) {
        this.song = song;
        this.volume = 1;
        this.isPlaying = false;
    }

    public void play() {
        if(isPlaying) {
            stop();
        }

        if(song instanceof AnimalSong&&volume>5){
            setVolume(5);
        }

        System.out.printf("%s, %d분, %s, \n", song.title, song.duration, song.artist);
        if(song instanceof AnimalSong){
            System.out.println(((AnimalSong)song).animal);
        }else if(song instanceof ManagerSong) {
            System.out.println(((ManagerSong) song).genre);
        }

        isPlaying = true;
    }
    public void stop(){
        System.out.println("현재 재생중인 곡이 일시 정지 됩니다.");
        isPlaying = false;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
