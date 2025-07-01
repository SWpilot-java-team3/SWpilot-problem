package 과정3.biodome7;

public class Player {
    Song song;
    int volume;
    boolean isPlaying;

    public Player() {
        this.volume = 1;
        this.isPlaying = false;
    }

    public void play(Song song) {
        this.song = song;

        if(isPlaying) {
            stop();
        }

        if(song instanceof AnimalSong&&volume>5){
            setVolume(5);
        }

        System.out.printf("%s, %d분, %s, ", song.title, song.duration, song.artist);
        if(song instanceof AnimalSong){
            System.out.println(((AnimalSong)song).animal + " 재생합니다.");
        }else if(song instanceof ManagerSong) {
            System.out.println(((ManagerSong) song).genre + " 재생합니다.");
        }

        isPlaying = true;
    }
    public void stop(){
        System.out.println("현재 재생중인 곡이 일시 정지 됩니다.");
        isPlaying = false;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨을 "+ volume + " 으로 설정합니다");
    }

}
