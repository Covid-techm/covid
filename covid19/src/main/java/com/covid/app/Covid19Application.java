package com.covid.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreRepositories;
import org.springframework.context.annotation.ComponentScan;

import com.covid.app.controller.ListQMsController;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.covid.app.controller.ListQMsController",
		"com.covid.app.controller.HealthStatusController",
		"com.covid.app.service.ListQMsService"})
@ComponentScan(basePackageClasses = ListQMsController.class )
@EntityScan(basePackages = "com.covid.app.model")
public class Covid19Application {

	public static void main(String[] args) {
		SpringApplication.run(Covid19Application.class, args);
	}

}
