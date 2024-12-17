package com.example.demoIOC.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public NotificationService notificationService() {
        return new NotificationService();
    }
}
