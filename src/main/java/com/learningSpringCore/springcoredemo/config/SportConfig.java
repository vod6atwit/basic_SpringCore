package com.learningSpringCore.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learningSpringCore.springcoredemo.common.Coach;
import com.learningSpringCore.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
  // bean name should be start lowercase and same as class name
  @Bean
  public Coach swimCoach() {
    return new SwimCoach();
  }

}
