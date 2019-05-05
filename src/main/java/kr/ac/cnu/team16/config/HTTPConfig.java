package kr.ac.cnu.team16.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HTTPConfig {
    @Bean
    public RestTemplate creatRestTemplate(){
        return new RestTemplate();
    }
}
