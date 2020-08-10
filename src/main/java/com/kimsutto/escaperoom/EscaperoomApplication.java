package com.kimsutto.escaperoom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class EscaperoomApplication {

  public static void main(String[] args) {
    SpringApplication.run(EscaperoomApplication.class, args);
  }

}
