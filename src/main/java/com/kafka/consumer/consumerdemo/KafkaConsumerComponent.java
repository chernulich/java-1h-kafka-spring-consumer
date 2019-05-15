package com.kafka.consumer.consumerdemo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerComponent {

    @KafkaListener(topics = "test")
    public void listen(String message) {
        //ObjectMapper
        //deserialize
        System.out.println(message);
        //save to database
    }

    //controller
    //search from database
}
