package com.example.disgenetplus.config;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.net.http.HttpClient;

@Configuration
public class DiseaseConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){

        return builder.build();
    }

}
