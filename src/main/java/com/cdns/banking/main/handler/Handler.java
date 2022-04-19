package com.cdns.banking.main.handler;

import java.util.ArrayList;

/**
 * Handler
 * 
 * @version 1.0
 */
public class Handler extends Object {

	/**
	 * messages
	 */
	ArrayList<Message> messages;

	/**
	 * public constructor
	 */
	public Handler() {
		messages = new ArrayList<>();
	}

	/**
	 * obtainMessage
	 * 
	 * @param what int
	 * @param obj  Object
	 * @return Message
	 */
	public final Message obtainMessage(int what, Object obj) {
		Message message = new Message(what, obj, this);
		messages.add(message);
		return message;
	}

	/**
	 * obtainMessage
	 * 
	 * @param what Message
	 * @return Message
	 */
	public final Message obtainMessage(int what) {
		Message message = new Message(what, this);
		messages.add(message);
		return message;
	}

	/**
	 * handleMessage
	 * 
	 * @param msg Message
	 */
	public void handleMessage(Message msg) {
		messages.remove(msg);
	}

	/**
	 * hasMessages
	 * 
	 * @return boolean
	 */
	public final boolean hasMessages() {
		return !messages.isEmpty();
	}

	/**
	 * postDelayed
	 * 
	 * @param runnable Runnable
	 * @param i        int
	 */
	public void postDelayed(Runnable runnable, int i) {

	}
}
