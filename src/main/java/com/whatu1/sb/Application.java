package com.whatu1.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.whatu1.sb.utils.KafkaProducer;

/**
 * 1、该注解指定项目为SpringBoot，由此类当作程序入口自动装配 web依赖的环境
 * 2、Application.java文件的包必须是项目下的父路径，其他类的包路径必须是其子路径
 **/
@SpringBootApplication
@EnableScheduling
public class Application {

	@Autowired
	private KafkaProducer kafkaProducer;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// 然后每隔1分钟执行一次
	@Scheduled(fixedRate = 1000 * 10)
	public void testKafka() throws Exception {
		kafkaProducer.send();
	}
}
