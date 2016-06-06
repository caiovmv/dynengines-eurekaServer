package br.com.sysk.dynengines.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DynenginesEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynenginesEurekaServerApplication.class, args);
	}
}
