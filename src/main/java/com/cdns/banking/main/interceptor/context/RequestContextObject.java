package com.cdns.banking.main.interceptor.context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * RequestContextObject
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
public class RequestContextObject implements IContextObject {

	/**
	 * request
	 */
	private HttpServletRequest request;

	/**
	 * response
	 */
	private HttpServletResponse response;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HttpServletRequest getRequest() {
		return request;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setResponse(HttpServletResponse response) {

		this.response = response;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HttpServletResponse getResponse() {
		return response;
	}

}
