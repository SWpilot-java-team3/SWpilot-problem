package 과정3.biodome7;
import java.util.*;


public class MusicLibrary {
    List<Song> songList;

    public MusicLibrary(){
        songList = new ArrayList<>();
    }


    public void addSong(Song song) {
        songList.add(song);
        if (song instanceof AnimalSong) {
            System.out.printf("새로운 노래 \"%s, %d분, %s, %s\" 추가되었습니다\n", song.title, song.duration, song.artist, ((AnimalSong) song).animal);
        } else if (song instanceof ManagerSong) {
            System.out.printf("새로운 노래 \"%s, %d분, %s, %s\" 추가되었습니다\n", song.title, song.duration, song.artist, ((ManagerSong) song).genre);
        }
    }

    public void removeSong(String title){
        for(Song song:songList){
            if(song.title.equals(title)){
                if(song instanceof AnimalSong){
                    System.out.printf("노래 \"%s, %d분, %s, %s\" 삭제되었습니다\n", song.title, song.duration, song.artist, ((AnimalSong) song).animal);
                    songList.remove(song);
                    break;
                }else if (song instanceof ManagerSong) {
                    System.out.printf("노래 \"%s, %d분, %s, %s\" 삭제되었습니다\n", song.title, song.duration, song.artist, ((ManagerSong) song).genre);
                    songList.remove(song);
                    break;
                }
            }
        }
    }

    public void printAnimalSongList(){
        System.out.println("동물을 위한 모든 음악 조회:");
        for(Song song:songList){
            if(song instanceof AnimalSong){
                System.out.printf("노래 \"%s, %d분, %s, %s\"\n", song.title, song.duration, song.artist, ((AnimalSong) song).animal);
            }
        }
        System.out.println("사람을 위한 모든 음악 조회:");
        for(Song song:songList){
            if(song instanceof ManagerSong){
                System.out.printf("노래 \"%s, %d분, %s, %s\"\n", song.title, song.duration, song.artist, ((ManagerSong) song).genre);
            }
        }
    }

    public void printManagerSongList() {
        System.out.println("사람을 위한 모든 음악 조회:");
        for (Song song : songList) {
            if (song instanceof ManagerSong) {
                System.out.printf("노래 \"%s, %d분, %s, %s\"\n", song.title, song.duration, song.artist, ((ManagerSong) song).genre);
            }
        }
    }


    public Song searchMusic(String line){

        for(Song song:songList){
            if(song.title.equals(line)){
                return song;
            }
        }

        for(Song song:songList){
            if(song instanceof AnimalSong && ((AnimalSong) song).animal.equals(line)){
                return song;
            }else if(song instanceof ManagerSong && ((ManagerSong) song).genre.equals(line)){
                return song;
            }
        }
        return null;
    }



}
