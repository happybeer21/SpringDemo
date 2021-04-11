package ru.ostanin.springdemo.genres;

import org.springframework.stereotype.Component;
import ru.ostanin.springdemo.Music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    private List<String> musics = new ArrayList<>();

    public RockMusic() {
        Collections.addAll(musics, "Wind cries Mary", "Matchbox Twenty", "Third Eye Blind");
    }

    @Override
    public String getSong() {
        return musics.get(new Random().nextInt(musics.size()));
        //return "Wind cries Mary";
    }

    //append commit

    public void doMyInit() {
        System.out.println("My init do");
    }

    public void doMyDestroy() {
        System.out.println("My destroy do");
    }
}
