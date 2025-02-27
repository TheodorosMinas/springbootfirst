package com.dodos.springboot.demo.dodosapp.config;

import com.dodos.springboot.demo.dodosapp.components.Coach;
import com.dodos.springboot.demo.dodosapp.components.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
