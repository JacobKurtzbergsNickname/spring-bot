package com.springbot.robotticelli.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fauna.client.Fauna;
import com.fauna.client.FaunaClient;
import com.fauna.client.FaunaConfig;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class FaunaSpringBotConfig {

  @Bean
  public FaunaClient faunaClient() {
    Dotenv dotenv = Dotenv.configure()
        .directory("C:\\Users\\korbi\\Coding\\Private\\Java\\spring-bot\\.env").load();
    String secret = dotenv.get("FAUNA_SECRET");
    System.out.println("Secret: " + secret);
    FaunaConfig faunaConfig = FaunaConfig.builder().secret(secret).build();

    return Fauna.client(faunaConfig);
  }
}
