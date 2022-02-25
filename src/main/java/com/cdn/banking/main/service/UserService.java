package com.cdn.banking.main.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cdn.banking.main.model.UserEntity;
import com.cdn.banking.main.model.request.UserRequest;

/**
 * UserService
 * 
 * @author Deepu Prasad Mathew
 * @version 1.0
 */
public interface UserService extends UserDetailsService
{
	/**
	 * register
	 * 
	 * @param userDto {@link UserRequest}
	 * @return {@link UserRequest}
	 */
	public UserRequest register(UserRequest userDto);

	/**
	 * getUserIDByUserName
	 * 
	 * @param userName {@link String}
	 * @return {@link UserRequest}
	 */
	public UserEntity getUserIDByUserName(String userName);
	
	/**
	 * getUserByPhoneNumber
	 * 
	 * @param phoneNumber {@link String}
	 * @return {@link UserRequest}
	 */
	public UserEntity getUserByPhoneNumber(String phoneNumber);
}
