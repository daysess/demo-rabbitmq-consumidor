package br.com.demo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class DemoRabbitmqConsumidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRabbitmqConsumidorApplication.class, args);
	}

}
