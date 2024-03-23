package com.symbiosis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.symbiosis","com.dau","com.model","com.controller","com.service"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dau")
public class ProjectplayermanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectplayermanagementApplication.class, args);
	}

}
