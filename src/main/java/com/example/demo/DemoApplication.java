package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Value("${spring.application.name:Hero}")
	private String name;

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		logger.info("calling root path");
		return "Hello World";
	}


	@RequestMapping(value = "/kiyan")
	public String helloKiyan() {
		logger.warn("calling kiyan path");
		return "Hello Kiyan";
	}

	@RequestMapping(value = "/name1")
	public String getName() {
		logger.error("calling error path");
		return "Hello " + name;
	}

}

