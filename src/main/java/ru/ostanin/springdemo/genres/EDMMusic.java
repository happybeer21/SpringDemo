package ru.ostanin.springdemo.genres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ostanin.springdemo.Music;

import java.util.*;

public class EDMMusic implements Music {
    private List<String> musics = new ArrayList<>();

    public EDMMusic() {
        Collections.addAll(musics, "Love in on Fire", "Deep than the Ocean", "Legion");
    }

    @Override
    public String getSong() {
        return musics.get(new Random().nextInt(musics.size()));
        //return "Love in on Fire";
    }

    public void doMyInit() {
        System.out.println("My init do");
    }

    public void doMyDestroy() {
        System.out.println("My destroy do");
    }
}
