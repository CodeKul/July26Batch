package com.codekul.july26batch.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

    SimConfig() {
        System.out.println("In sim config");
    }

    @Bean
    public Vodafone getVodafone(){
        return new Vodafone();
    }

    @Bean
    public Jio getJio(){
        return new Jio();
    }

}
