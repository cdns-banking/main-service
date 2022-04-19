package com.cdns.banking.main.interceptor.application;

import com.cdns.banking.main.interceptor.ClientRequestInterceptor;
import com.cdns.banking.main.interceptor.dispatcher.ClientRequestDispatcher;

/**
 * MainRequestInterceptorApplication
 * 
 * @version 1.0
 */
public class MainRequestInterceptorApplication {

	/**
	 * registerInterceptor
	 * 
	 * @param interceptor ClientRequestInterceptor
	 */
	public void registerInterceptor(ClientRequestInterceptor interceptor) {
		ClientRequestDispatcher.getInstance().register(interceptor);
	}

}
