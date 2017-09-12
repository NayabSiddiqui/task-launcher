package com.tolls.taskintake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tolls")
public class TaskIntakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskIntakeApplication.class, args);
	}
}
