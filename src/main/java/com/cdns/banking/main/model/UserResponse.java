package com.cdns.banking.main.model;

/**
 * UserResponse
 * 
 * @version 1.0
 */
public class UserResponse {

	/**
	 * userName
	 */
	private String userName;

	/**
	 * userID
	 */
	private String userID;

	/**
	 * getUserName
	 * 
	 * @return userName String
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * setUserName
	 * 
	 * @param userName String
	 * @return UserResponse
	 */
	public UserResponse setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	/**
	 * getUserID
	 * 
	 * @return userID Integer
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * setUserID
	 * 
	 * @param userID Integer
	 * @return UserResponse
	 */
	public UserResponse setUserID(String userID) {
		this.userID = userID;
		return this;
	}

}
