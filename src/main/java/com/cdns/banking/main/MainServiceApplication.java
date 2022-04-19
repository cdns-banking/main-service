package com.cdns.banking.main;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * MainServiceApplication
 * 
 * @version 1.0
 */
@SpringBootApplication
@EnableSwagger2
public class MainServiceApplication {

	/**
	 * main
	 * 
	 * @param args String[]
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainServiceApplication.class, args);
	}

	/**
	 * bCryptPasswordEncoder
	 * 
	 * @return BCryptPasswordEncoder
	 */
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	 * swaggerConfiguration
	 * 
	 * @return Docket
	 */
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.cdns.banking.main")).build().apiInfo(getAPIInfo());
	}

	/**
	 * getAPIInfo
	 * 
	 * @return ApiInfo
	 */
	private ApiInfo getAPIInfo() {
		return new ApiInfo("CDNS Banking Main Service APIs",
				"Documentation of APIs provided by the microservice main-service", "1.0", "Free to use", null,
				"API License", null, Collections.emptyList());
	}

}
