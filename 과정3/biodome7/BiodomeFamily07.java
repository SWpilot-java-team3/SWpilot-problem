package 과정3.biodome7;

public class BiodomeFamily07{
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        Song song1 = new AnimalSong("초원을 그리며", 2, "레이나", "사슴");
        Song song2 = new AnimalSong("영웅 호테",1,"돈키","당나귀");
        Song song3 = new AnimalSong("과자를 줄게",3,"제롬","코끼리");
        Song song4 = new ManagerSong("화양연하",2,"장양림","재즈");
        Song song5 = new ManagerSong("시간의 수평선",4,"하윤","팝");

        musicLibrary.addSong(song1);
        musicLibrary.addSong(song2);
        musicLibrary.addSong(song3);
        musicLibrary.addSong(song4);
        musicLibrary.addSong(song5);

        musicLibrary.printManagerSongList();

        Player player = new Player();
        player.play(song4);
        player.setVolume(50);

        Song song = musicLibrary.searchMusic("당나귀");
        if(song!=null){
            player.play(song);
        }

    }
}
