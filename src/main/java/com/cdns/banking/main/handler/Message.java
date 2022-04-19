package com.cdns.banking.main.handler;

/**
 * Message
 * 
 * @version 1.0
 */
public class Message extends Object {

	/**
	 * mWhat
	 */
	int mWhat;

	/**
	 * mObj
	 */
	Object mObj;

	/**
	 * mTarget
	 */
	Handler mTarget;

	/**
	 * public constructor
	 * 
	 * @param what int
	 * @param obj  Object
	 */
	public Message(int what, Object obj) {
		mWhat = what;
		mObj = obj;
	}

	/**
	 * public constructor
	 * 
	 * @param what   int
	 * @param obj    Object
	 * @param target Handler
	 */
	public Message(int what, Object obj, Handler target) {
		mWhat = what;
		mObj = obj;
		mTarget = target;
	}

	/**
	 * public constructor
	 * 
	 * @param what   int
	 * @param target Handler
	 */
	public Message(int what, Handler target) {
		mWhat = what;
		mTarget = target;
	}

	/**
	 * public constructor
	 * 
	 * @param what int
	 */
	public Message(int what) {
		mWhat = what;
	}

	/**
	 * sendToTarget
	 */
	public void sendToTarget() {
		mTarget.handleMessage(this);
	}
}
