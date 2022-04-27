package com.cdns.banking.main.interceptor.framework;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cdns.banking.main.interceptor.MainServiceRequestInterceptor;
import com.cdns.banking.main.interceptor.application.MainRequestInterceptorApplication;
import com.cdns.banking.main.interceptor.context.IContextObject;
import com.cdns.banking.main.interceptor.context.RequestContextObject;
import com.cdns.banking.main.interceptor.dispatcher.ClientRequestDispatcher;

/**
 * InterceptorConcreteFramework
 * 
 * @version 1.0
 */
public class InterceptorInvoker {

	/**
	 * dispatcher
	 */
	public ClientRequestDispatcher dispatcher;

	/**
	 * contextObject
	 */
	public IContextObject contextObject;

	/**
	 * public constructor
	 */
	public InterceptorInvoker() {
		dispatcher = ClientRequestDispatcher.getInstance();
		this.contextObject = new RequestContextObject();

		final ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes();
		final HttpServletRequest request = attr.getRequest();

		this.contextObject.setRequest(request);

		final HttpServletResponse response = attr.getResponse();
		this.contextObject.setResponse(response);

		// Create Intercept application object
		MainRequestInterceptorApplication application = new MainRequestInterceptorApplication();
		application.registerInterceptor(new MainServiceRequestInterceptor());
	}

	/**
	 * invoke
	 * 
	 * @throws IOException
	 */
	public void invoke() throws IOException {

		// invoked when a request is called
		dispatcher.iterate_list(this.contextObject);
	}
}
