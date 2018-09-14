package com.whatu1.sb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatu1.sb.entity.Demo;
import com.whatu1.sb.service.DemoService;

@RestController
public class DemoController {
	
	private static final Logger log = LoggerFactory.getLogger(DemoController.class);

	@Autowired
	protected DemoService demoService;

	@GetMapping("/demo")
	public List<Demo> helloworld() {
		log.info("測試Controller");
		return demoService.getDemos();
	}
}
