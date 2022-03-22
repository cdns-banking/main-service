package com.cdns.banking.main.filter.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.cdns.banking.main.filter.CustomRequestLogFilter;

/**
 * CustomInitializer
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
public class CustomInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocation("com.cdns.banking.main.filter");
		container.addListener(new ContextLoaderListener(context));

		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");

		container.addFilter("customRequestLogFilter", CustomRequestLogFilter.class).addMappingForServletNames(null,
				false, "dispatcher");
	}
}