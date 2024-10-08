package oop.Ex.mediaEx;

import java.util.Arrays;

public class MediaPlayer {
    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
        // 주어진 media를 mediaList 배열에 추가
//        MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];

//        for (int i = 0; i < mediaList.length; i++) {
//            temp[i] = mediaList[i];
//        }

        // 더 간단한 코드
        // 첫번째 인자 -> 기준 배열
        // 두번째 인자 -> 몇번째까지??? 기본 길이보다 크게 하면 null로 길이가 채워짐.
        MediaPlayable[] temp = Arrays.copyOf(mediaList, mediaList.length + 1);

        temp[temp.length - 1] = media;
        this.mediaList = temp;
    }

    public void playAll() {
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable playablel : mediaList) {
            playablel.play();
        }
    }
}
