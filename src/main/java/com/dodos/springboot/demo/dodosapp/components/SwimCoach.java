package com.dodos.springboot.demo.dodosapp.components;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
