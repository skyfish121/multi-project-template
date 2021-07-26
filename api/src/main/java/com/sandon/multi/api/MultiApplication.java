package com.sandon.multi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sandon"})
public class MultiApplication {

  public static void main(String[] args) {
    SpringApplication.run(MultiApplication.class, args);
  }

}
