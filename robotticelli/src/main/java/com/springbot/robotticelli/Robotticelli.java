package com.springbot.robotticelli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Robotticelli {

    public static void main(String[] args) {
      ConfigurableApplicationContext context = SpringApplication.run(Robotticelli.class, args);
      if (context != null) {
        System.out.println("Robotticelli is running...");
        System.out.println("Startup Date: " + context.getStartupDate());
        System.out.println("URL: http://localhost:" + context.getEnvironment().getProperty("server.port"));
      }
    }
}
