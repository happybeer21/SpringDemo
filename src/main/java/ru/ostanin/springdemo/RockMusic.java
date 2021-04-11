package ru.ostanin.springdemo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private List<String> musics = new ArrayList<>();

    public RockMusic() {
        Collections.addAll(musics, "Wind cries Mary", "Matchbox Twenty", "Third Eye Blind");
    }

    @Override
    public String getSong() {
        return musics.get((int) (Math.random() * 3));
        //return "Wind cries Mary";
    }

    public void doMyInit() {
        System.out.println("My init do");
    }

    public void doMyDestroy() {
        System.out.println("My destroy do");
    }
}
