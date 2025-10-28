package com.UserManagementSystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.UserManagementSystem")
@PropertySource("classpath:META-INF/persistence.properties")
public class AppConfig {
    // Main application configuration
}