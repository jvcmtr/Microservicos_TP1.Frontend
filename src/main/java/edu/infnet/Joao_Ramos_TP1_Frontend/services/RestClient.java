package edu.infnet.Joao_Ramos_TP1_Frontend.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClient {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}