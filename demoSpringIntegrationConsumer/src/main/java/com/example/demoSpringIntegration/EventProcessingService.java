package com.example.demoSpringIntegration;

public interface EventProcessingService {
	   void process(PostPublishedEvent event);
}
