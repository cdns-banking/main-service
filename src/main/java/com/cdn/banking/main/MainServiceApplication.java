package com.cdn.banking.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * MainServiceApplication
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainServiceApplication
{

	/**
	 * main
	 * 
	 * @param args String[]
	 */
	public static void main(String[] args)
	{
		SpringApplication.run(MainServiceApplication.class, args);
	}

	/**
	 * BCryptPasswordEncoder
	 * 
	 * @return {@link BCryptPasswordEncoder}
	 */
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}

}
