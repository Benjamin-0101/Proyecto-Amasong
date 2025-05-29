package com.Amasong.Microservicio_APi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicioAPiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAPiApplication.class, args);
	}

}
