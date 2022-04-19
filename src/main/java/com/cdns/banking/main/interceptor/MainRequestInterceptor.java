package com.cdns.banking.main.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.util.ContentCachingRequestWrapper;

import com.cdns.banking.main.filter.config.RequestLogUtil;
import com.cdns.banking.main.interceptor.application.MainRequestInterceptorApplication;
import com.cdns.banking.main.interceptor.context.IContextObject;

/**
 * MainRequestInterceptor
 * 
 * @version 1.0
 */
public class MainRequestInterceptor implements ClientRequestInterceptor {
	/**
	 * Logger object
	 */
	private final static Logger LOGGER = LoggerFactory.getLogger(MainRequestInterceptorApplication.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onPreMarshalRequest(final IContextObject context) throws IOException {
		String postData;
		HttpServletRequest requestCacheWrapperObject = null;
		try {
			requestCacheWrapperObject = new ContentCachingRequestWrapper(context.getRequest());
			requestCacheWrapperObject.getParameterMap();
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			postData = RequestLogUtil.readPayload(requestCacheWrapperObject);
			LOGGER.info("Request : " + postData);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onPostMarshalRequest(final IContextObject context) {
		LOGGER.info("Response : " + context.getResponse().getStatus());
	}
}
