package com.mk.company.config;

import com.mk.company.backend.service.EmailService;
import com.mk.company.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * create by TungNguyen on May, 2019
 */
@Configuration
@Profile("prod")
@PropertySource("classpath:mail.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }
}
