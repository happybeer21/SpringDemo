package ru.ostanin.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.ostanin.springdemo.Computer;
import ru.ostanin.springdemo.Music;
import ru.ostanin.springdemo.MusicPlayer;
import ru.ostanin.springdemo.genres.ClassicMusic;
import ru.ostanin.springdemo.genres.EDMMusic;
import ru.ostanin.springdemo.genres.JazzMusic;
import ru.ostanin.springdemo.genres.RockMusic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic() {
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public EDMMusic edmMusic() {
        return new EDMMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    //бин - список со всеми песнями, разных жанров
    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicMusic(), rockMusic(), edmMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
