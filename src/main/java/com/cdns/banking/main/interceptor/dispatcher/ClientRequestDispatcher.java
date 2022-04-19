package com.cdns.banking.main.interceptor.dispatcher;

import java.io.IOException;
import java.util.ArrayList;

import com.cdns.banking.main.handler.Handler;
import com.cdns.banking.main.interceptor.ClientRequestInterceptor;
import com.cdns.banking.main.interceptor.context.IContextObject;

/**
 * ClientRequestDispatcher
 * 
 * @version 1.0
 */
public class ClientRequestDispatcher {

	/**
	 * dispatcherList
	 */
	public ArrayList<ClientRequestInterceptor> dispatcherList = new ArrayList<ClientRequestInterceptor>();

	/**
	 * dispatcher
	 */
	static ClientRequestDispatcher dispatcher = null;

	/**
	 * private constructor
	 */
	private ClientRequestDispatcher() {

	}

	/**
	 * getInstance
	 * 
	 * @return ClientRequestDispatcher
	 */
	public static ClientRequestDispatcher getInstance() {
		if (dispatcher == null) {
			dispatcher = new ClientRequestDispatcher();
		}

		return dispatcher;
	}

	/**
	 * register
	 * 
	 * @param interceptor ClientRequestInterceptor
	 */
	public void register(ClientRequestInterceptor interceptor) {
		dispatcherList.add(interceptor);
	}

	/**
	 * remove
	 * 
	 * @param interceptor ClientRequestInterceptor
	 */
	public void remove(ClientRequestInterceptor interceptor) {
		if (dispatcherList.contains(interceptor)) {
			dispatcherList.remove(interceptor);
		}
	}

	/**
	 * iterate_list
	 * 
	 * @param contextObject IContextObject
	 * @throws IOException
	 */
	public void iterate_list(final IContextObject contextObject) throws IOException {
		for (final ClientRequestInterceptor interceptor : dispatcherList) {
			interceptor.onPreMarshalRequest(contextObject);
			Handler handler = new Handler();
			handler.postDelayed(new Runnable() {
				@Override
				public void run() {
					interceptor.onPostMarshalRequest(contextObject);
				}
			}, 3000);

		}
	}
}
