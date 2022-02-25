package com.cdn.banking.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdn.banking.main.model.UserEntity;
import com.cdn.banking.main.model.request.UserRequest;
import com.cdn.banking.main.model.response.UserResponse;
import com.cdn.banking.main.service.UserService;

/**
 * MainRESTController
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
@RestController
public class MainRESTController
{
	/**
	 * userService
	 */
	@Autowired
	private UserService userService;

	/**
	 * register
	 * 
	 * @param user {@link UserRequest}
	 * @return {@link ResponseEntity}
	 */
	@PostMapping("/register")
	public ResponseEntity<UserResponse> register(@Valid @RequestBody UserRequest user)
	{
		UserRequest returnVal = userService.register(user);

		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new UserResponse().setUserName(returnVal.getUserName()).setUserID(returnVal.getUserID()));
	}

	/**
	 * register
	 * 
	 * @param user {@link UserRequest}
	 * @return {@link ResponseEntity}
	 */
	@GetMapping("/user/{userName}")
	public String getUserIDByUserName(@PathVariable String userName)
	{
		UserEntity user = userService.getUserIDByUserName(userName);

		if (null != user)
		{
			return user.getUserID();
		}
		else
		{
			return "0";
		}
	}

	/**
	 * getUserIDByPhoneNumber
	 * 
	 * @param user {@link UserRequest}
	 * @return {@link ResponseEntity}
	 */
	@GetMapping("/phone/{phoneNumber}")
	public UserEntity getUserIDByPhoneNumber(@PathVariable String phoneNumber)
	{
		return userService.getUserByPhoneNumber(phoneNumber);
	}
}
