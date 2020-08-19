package com.example.demoSpringIntegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("RedisEventProcessingService")
public class RedisEventProcessingService implements EventProcessingService {

	@Autowired
    private JavaMailSender javaMailSender;
	
	@Override
	public void process(PostPublishedEvent event) {
		SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("aishwarya.bommisetty@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);

	}

}
