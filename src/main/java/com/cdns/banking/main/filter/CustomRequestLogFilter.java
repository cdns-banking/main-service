package com.cdns.banking.main.filter;

import org.springframework.web.filter.CommonsRequestLoggingFilter;

/**
 * CustomRequestLogFilter
 * 
 * @author Deepu Prasad Mathew 210179567
 * @version 1.0
 */
public class CustomRequestLogFilter extends CommonsRequestLoggingFilter {

	public CustomRequestLogFilter() {

		super.setMaxPayloadLength(10000);
		super.setIncludePayload(true);
		super.setIncludeQueryString(true);

	}
}
