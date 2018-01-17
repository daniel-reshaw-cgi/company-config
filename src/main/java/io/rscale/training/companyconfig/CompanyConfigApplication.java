package io.rscale.training.companyconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CompanyConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyConfigApplication.class, args);
	}
}
