package com.cdns.banking.main.interceptor;

import java.io.IOException;

import com.cdns.banking.main.interceptor.context.IContextObject;

public interface ClientRequestInterceptor {
	public void onPreMarshalRequest(IContextObject context) throws IOException;

	public void onPostMarshalRequest(IContextObject context);
}
