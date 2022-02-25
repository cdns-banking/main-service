package com.cdn.banking.main.model.response;

/**
 * UserResponse
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
public class UserResponse
{
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
	 * @return userName {@link String}
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * setUserName
	 * 
	 * @param userName {@link String}
	 * @return {@link UserResponse}
	 */
	public UserResponse setUserName(String userName)
	{
		this.userName = userName;
		return this;
	}

	/**
	 * getUserID
	 * 
	 * @return userID {@link Integer}
	 */
	public String getUserID()
	{
		return userID;
	}

	/**
	 * setUserID
	 * 
	 * @param userID {@link Integer}
	 * @return {@link UserResponse}
	 */
	public UserResponse setUserID(String userID)
	{
		this.userID = userID;
		return this;
	}

}
