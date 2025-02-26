package com.dodos.springboot.demo.dodosapp.rest;


import com.dodos.springboot.demo.dodosapp.components.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControler {

    private Coach coach;

    @Autowired
    public FunRestControler(Coach coach) {
        System.out.println("In constructor "+getClass().getSimpleName() );
        this.coach = coach;
    }
//    @Autowired
//    public void setCoach(Coach coach) {
//        this.coach = coach;
//    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
