package ru.ostanin.springdemo.genres;

import ru.ostanin.springdemo.Music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JazzMusic implements Music {
    private List<String> musics = new ArrayList<>();

    public JazzMusic() {
        Collections.addAll(musics, "Jazz1", "Jazz2", "Jazz3");
    }

    @Override
    public String getSong() {
        return musics.get(new Random().nextInt(musics.size()));
    }
}
