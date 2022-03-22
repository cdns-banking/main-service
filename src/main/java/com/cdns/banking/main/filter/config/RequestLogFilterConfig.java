package com.cdns.banking.main.filter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

/**
 * RequestLogFilterConfig
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
@Configuration
public class RequestLogFilterConfig {

	@Bean
	public CommonsRequestLoggingFilter logFilter() {
		CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
		filter.setIncludePayload(true);
		filter.setAfterMessagePrefix("Request : ");
		filter.setIncludeQueryString(true);
		filter.setMaxPayloadLength(10000);
		filter.setIncludeHeaders(false);
		return filter;
	}
}