package br.com.trineo.hrtrabalho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrTrabalhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrTrabalhoApplication.class, args);
	}

}