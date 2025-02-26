package com.dodos.springboot.demo.dodosapp.components;


import org.springframework.stereotype.Component;

@Component
public class TenniCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
