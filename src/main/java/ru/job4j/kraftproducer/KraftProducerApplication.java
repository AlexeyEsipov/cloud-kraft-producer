package ru.job4j.kraftproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KraftProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KraftProducerApplication.class, args);
	}
}
