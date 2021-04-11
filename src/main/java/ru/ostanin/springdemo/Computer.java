package ru.ostanin.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int compId = 1;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.compId = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer #" + compId + " / Playing: " + musicPlayer.playFavoriteMusic() + " / volume: " + musicPlayer.getVolume();
        //return "Computer " + compId + " " + musicPlayer.playFavoriteMusic(MusicGenre.CLASSICAL);
    }
}
