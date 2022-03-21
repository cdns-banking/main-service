package com.cdns.banking.main.interceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cdns.banking.main.interceptor.MainServiceInterceptor;

/**
 * MainServiceInterceptorAppConfig
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
@Component
public class MainServiceInterceptorAppConfig implements WebMvcConfigurer {

	@Autowired
	MainServiceInterceptor mainServiceInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(mainServiceInterceptor);
	}
}