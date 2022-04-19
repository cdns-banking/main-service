package com.cdns.banking.main.interceptor.context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * IContextObject
 * 
 * @version 1.0
 */
public interface IContextObject {

	/**
	 * setRequest
	 * 
	 * @param request HttpServletRequest
	 */
	void setRequest(HttpServletRequest request);

	/**
	 * getRequest
	 * 
	 * @return HttpServletRequest
	 */
	HttpServletRequest getRequest();

	/**
	 * setResponse
	 * 
	 * @param response HttpServletResponse
	 */
	void setResponse(HttpServletResponse response);

	/**
	 * getResponse
	 * 
	 * @return HttpServletResponse
	 */
	HttpServletResponse getResponse();
}
