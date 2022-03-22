package com.cdns.banking.main.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.util.ContentCachingRequestWrapper;

import com.cdns.banking.main.filter.config.RequestLogUtil;

/**
 * MainServiceInterceptor
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
@Component
public class MainServiceInterceptor implements HandlerInterceptor {

	private final static Logger LOGGER = LoggerFactory.getLogger(MainServiceInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String postData;
		HttpServletRequest requestCacheWrapperObject = null;
		try {
			requestCacheWrapperObject = new ContentCachingRequestWrapper(request);
			requestCacheWrapperObject.getParameterMap();
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			postData = RequestLogUtil.readPayload(requestCacheWrapperObject);
			LOGGER.info("Request : " + postData);
		}
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception {
		LOGGER.info("Response : " + response.getStatus());
	}
}
