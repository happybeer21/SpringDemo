package ru.ostanin.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music electronicMusic;
    private Music classicalMusic;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("electronic") Music music,
                       @Qualifier("rockMusic") Music tempMusic) {
        this.electronicMusic = music;
        this.classicalMusic = tempMusic;
    }

    public MusicPlayer() {
    }

    public String playFavoriteMusic() {
        if(classicalMusic == null) return electronicMusic.getSong();
        return electronicMusic.getSong() + " and " + classicalMusic.getSong();
    }

    public String playFavoriteMusic(MusicGenre genre) {
        String song = null;
        switch (genre) {
            case ROCK:
                song = classicalMusic.getSong();
                break;
            case CLASSICAL:
                song = electronicMusic.getSong();
                break;
            case EDM:
                break;
            default:
                System.out.println("Not match any music");
        }

        return song;
    }
}
