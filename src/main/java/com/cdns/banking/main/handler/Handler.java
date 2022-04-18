package com.cdns.banking.main.handler;

import java.util.ArrayList;

/**
 * Handler
 * 
 * @author Deepu Prasad Mathew
 * @version 1.0
 */
public class Handler extends Object {

	ArrayList<Message> messages;

	public Handler() {
		messages = new ArrayList<>();
	}

	public final Message obtainMessage(int what, Object obj) {
		Message message = new Message(what, obj, this);
		messages.add(message);
		return message;
	}

	public final Message obtainMessage(int what) {
		Message message = new Message(what, this);
		messages.add(message);
		return message;
	}

	public void handleMessage(Message msg) {
		messages.remove(msg);
	}

	public final boolean hasMessages() {
		return !messages.isEmpty();
	}

	public void postDelayed(Runnable runnable, int i) {
		
	}
}
