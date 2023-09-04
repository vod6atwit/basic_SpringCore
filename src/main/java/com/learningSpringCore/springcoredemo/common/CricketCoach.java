package com.learningSpringCore.springcoredemo.common;

// import org.springframework.beans.factory.config.ConfigurableBeanFactory;
// import org.springframework.context.annotation.Scope;
// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Component annotation is used to tell Spring that this is a bean
// make available for dependency injection
@Component
// @Primary // use the primary annotation if you don't want to use the qualifier
// annotation
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

  public CricketCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  // define our init method
  @PostConstruct
  public void init() {
    System.out.println("In init method: " + getClass().getSimpleName());
  }

  // define our destroy method
  @PreDestroy
  public void destroy() {
    System.out.println("In destroy method: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes !!!";
  }

}
