package com.cdns.banking.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdns.banking.main.model.UserRequest;
import com.cdns.banking.main.model.UserResponse;
import com.cdns.banking.main.service.MainService;

/**
 * MainServiceController
 * 
 * @version 1.0
 */
@RestController
@RequestMapping("/main")
public class MainServiceController {

	/**
	 * userService
	 */
	@Autowired
	private MainService userService;

	/**
	 * register
	 * 
	 * @param user UserRequest
	 * @return ResponseEntity<UserResponse>
	 */
	@PostMapping("/register")
	public ResponseEntity<UserResponse> register(@Valid @RequestBody UserRequest user) {
		UserRequest returnVal = userService.register(user);

		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new UserResponse().setUserName(returnVal.getUserName()).setUserID(returnVal.getUserID()));
	}
}
