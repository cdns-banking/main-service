package com.cdn.banking.main.model.request;

/**
 * LoginRequest
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
public class LoginRequest
{
	/**
	 * userName
	 */
	private String userName;

	/**
	 * password
	 */
	private String password;

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
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	/**
	 * getPassword
	 * 
	 * @return password {@link String}
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * setPassword
	 * 
	 * @param password {@link String}
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
}
