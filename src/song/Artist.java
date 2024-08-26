package song;

import java.io.Serializable;
import java.util.Set;

public class Artist implements Serializable {

    private String artistName;
    private Set<String> songList;

//    public Artist(String artistName) {
//        this.artistName = artistName;
//        this.songList = new HashSet<>();
//    }

    public Artist(String artistName, Set<String> songList) {
        this.artistName = artistName;
        this.songList = songList;
    }

    public boolean addSong(String songName) {
//        songName.equalsIgnoreCase(); // 대소문자 구분없이 문자 스펠링이 동일한지 체크하는 메서드
        // set의 add는 객체 추가 성공 여부를 리턴
        return this.getSongList().add(songName);
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }
}
