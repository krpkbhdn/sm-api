package edu.nubip.sm.processing.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "sm-dictionary")
    public void processDictionaryMessages(String message) {
        log.info(message);
    }

}
