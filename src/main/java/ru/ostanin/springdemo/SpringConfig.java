package ru.ostanin.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.ostanin.springdemo")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
