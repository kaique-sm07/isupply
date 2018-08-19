package com.hackaton.isuply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class iSupplyApplication {

	public static void main(String[] args) {
		SpringApplication.run(iSupplyApplication.class, args);
	}
}
