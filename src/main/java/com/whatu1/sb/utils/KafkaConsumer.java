package com.whatu1.sb.utils;

import java.util.Optional;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(groupId = "demo-group", topics = { "demo-topic" })
	public void listen(ConsumerRecord<?, ?> record) {

		Optional<?> kafkaMessage = Optional.ofNullable(record.value());

		if (kafkaMessage.isPresent()) {
			Object message = kafkaMessage.get();
			System.out.println("從 demo組 接收到的消息為: " + message);
		}

	}
}
