package com.example.demoSpringIntegration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//wiring this configuration into our application
@ImportResource("classpath:WEB-INF/queue-config.xml")
@AutoConfigureAfter(RedisConfig.class)
@Configuration
public class SpringIntegrationConfig {
}

