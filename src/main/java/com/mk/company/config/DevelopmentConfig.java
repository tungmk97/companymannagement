package com.mk.company.config;

import com.mk.company.backend.service.EmailService;
import com.mk.company.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * create by TungNguyen on May, 2019
 */

@Configuration
@Profile("dev")
@PropertySource("classpath:mail.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService(){
        return new MockEmailService();
    }
}
