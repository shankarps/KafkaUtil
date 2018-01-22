package com.shankar.kafka.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class MessageSender {
	
    public static Logger logger = LoggerFactory.getLogger(MessageSender.class);
    
    @Autowired
    private KafkaTemplate<String, String> template;

    public void sendMessage(String topic, String message) throws Exception {
        this.template.send(topic, message);
        logger.info("Message sent");
    }

}
