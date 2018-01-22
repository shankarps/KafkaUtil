package com.shankar.kafka;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shankar.kafka.sender.MessageSender;

@SpringBootApplication
public class KafkaUtilitiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				 SpringApplication.run(KafkaUtilitiesApplication.class, args);
		
		MessageSender sender = (MessageSender) context.getBean(MessageSender.class); 
		try {
			sender.sendMessage("test", "test "+LocalDate.now());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
