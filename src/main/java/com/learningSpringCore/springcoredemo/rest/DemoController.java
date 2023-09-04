package com.learningSpringCore.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningSpringCore.springcoredemo.common.Coach;

@RestController
public class DemoController {
  // define a private field for the dependencies
  private Coach myCoach;
  // private Coach anotherCoach;

  // behind the scenes
  // Coach theCoach = new CricketCoach();
  // DemoController demoController = new DemoController(myCoach);

  // define a constructor for dependency injection
  // autowired annotation is used to tell Spring to inject the dependency
  @Autowired // scan dependencies for a component that implements Coach interface
  // injection point
  public DemoController(
      @Qualifier("swimCoach") Coach theCoach
  // ,@Qualifier("cricketCoach") Coach theanotherCoach
  ) {

    System.out.println("In constructor: " + getClass().getSimpleName());

    myCoach = theCoach;
    // anotherCoach = theanotherCoach;
  }

  // // behind the scenes
  // // Coach theCoach = new CricketCoach();
  // // DemoController demoController = new DemoController()
  // // demoController.setCoach(theCoach);

  // @Autowired
  // public void setCoach(Coach theCoach) {
  // myCoach = theCoach;
  // }

  // @GetMapping("/check")
  // public String getCheck() {
  // return "Comparing beans: myCoach == anothercoach, " + (myCoach ==
  // anotherCoach);
  // }

  @GetMapping("/getDailyWorkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }
}
