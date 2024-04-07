package com.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics=AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String Value ){
        System.out.println(Value);
    }
}
