package ru.ostanin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicMusic classicMusic = context.getBean("classicMusic", ClassicMusic.class);
        ClassicMusic classicMusic1 = context.getBean("classicMusic", ClassicMusic.class);

        System.out.println(classicMusic == classicMusic1);
        /*Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/

        //Music myMusic = context.getBean("electronic", Music.class);
        //System.out.println(myMusic.getSong());

        //MusicPlayer myPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //myPlayer.playFavoriteMusic();

        /*MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstPlayer.playMusic();

        firstPlayer.setVolume(8);
        secondPlayer.setName("Temp player");

        System.out.println(firstPlayer.getName());
        System.out.println(firstPlayer.getVolume());

        System.out.println(secondPlayer.getName());
        System.out.println(secondPlayer.getVolume());*/

        context.close();
    }
}
