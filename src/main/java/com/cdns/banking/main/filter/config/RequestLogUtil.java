package com.cdns.banking.main.filter.config;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.WebUtils;

public class RequestLogUtil {

	public static String readPayload(final HttpServletRequest request) throws IOException {
		String payloadData = null;
		ContentCachingRequestWrapper contentCachingRequestWrapper = WebUtils.getNativeRequest(request,
				ContentCachingRequestWrapper.class);
		if (null != contentCachingRequestWrapper) {
			byte[] buf = contentCachingRequestWrapper.getContentAsByteArray();
			if (buf.length > 0) {
				payloadData = new String(buf, 0, buf.length, contentCachingRequestWrapper.getCharacterEncoding());
			}
		}
		return payloadData;
	}
}
