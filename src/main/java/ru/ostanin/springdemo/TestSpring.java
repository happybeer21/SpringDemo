package ru.ostanin.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ostanin.springdemo.config.SpringConfig;
import ru.ostanin.springdemo.genres.ClassicMusic;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playFavoriteMusic());

        context.close();
    }
}
