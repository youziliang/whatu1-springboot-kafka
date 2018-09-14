package com.whatu1.sb.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

@Component
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void send() {
		ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("demo-topic", "THIS IS A KAFKA TEST MESSAGE!");
		future.addCallback(o -> System.out.println("send-消息已发送（异步处理）"), throwable -> System.out.println("消息发送失败"));
	}
}
