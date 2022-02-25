package com.cdn.banking.main.model.response;

/**
 * LoginResponse
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
public class LoginResponse
{
	/**
	 * jwtToken
	 */
	private final String jwtToken;

	/**
	 * LoginResponse constructor
	 * 
	 * @param jwtToken {@link String}
	 */
	public LoginResponse(String jwtToken)
	{
		this.jwtToken = jwtToken;
	}

	/**
	 * 
	 * getJwtToken
	 * 
	 * @return jwtToken {@link String}
	 */
	public String getJwtToken()
	{
		return jwtToken;
	}
}
