package edu.nubip.sm.dictionary.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@Slf4j
public class WebConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        for (int i = 1; i < 5001; i++) {
            log.info("some message {}", i);
        }
        return new RestTemplate();
    }
}
