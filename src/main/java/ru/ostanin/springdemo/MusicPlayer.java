package ru.ostanin.springdemo;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {}

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playFavoriteMusic() {
        return musicList.get(new Random().nextInt(musicList.size())).getSong();
    }
}
