package ru.ostanin.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class ClassicMusic implements Music{

    private List<String> musics = new ArrayList<>();

    @Override
    public String getSong() {
        return musics.get(new Random().nextInt(3));
        //return "Für Elise";
    }

    public ClassicMusic() {
        Collections.addAll(musics, "Für Elise", "Seasons", "Anitra's dance");
    }

    public void doMyInit() {
        System.out.println("My init do");
    }


    @PreDestroy
    public void doMyDestroy() {
        System.out.println("My destroy do");
    }

    @PostConstruct
    private void privateInit() {
        System.out.println("private init");
    }
}
