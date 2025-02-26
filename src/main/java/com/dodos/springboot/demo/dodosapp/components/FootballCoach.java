package com.dodos.springboot.demo.dodosapp.components;


import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Play football for 1 hour";
    }
}
