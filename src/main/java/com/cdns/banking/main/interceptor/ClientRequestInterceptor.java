package com.cdns.banking.main.interceptor;

import java.io.IOException;

import com.cdns.banking.main.interceptor.context.IContextObject;

/**
 * ClientRequestInterceptor
 * 
 * @version 1.0
 */
public interface ClientRequestInterceptor {

	/**
	 * onPreMarshalRequest
	 * 
	 * @param context IContextObject
	 * @throws IOException
	 */
	public void onPreMarshalRequest(IContextObject context) throws IOException;

	/**
	 * onPostMarshalRequest
	 * 
	 * @param context IContextObject
	 */
	public void onPostMarshalRequest(IContextObject context);
}
