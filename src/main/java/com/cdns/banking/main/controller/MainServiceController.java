package com.cdns.banking.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cdns.banking.main.service.MainService;

/**
 * MainServiceController
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
@RestController
public class MainServiceController {

	/**
	 * mainService
	 */
	@Autowired
	private MainService mainService;

	/**
	 * getUserIDByPhoneNumber
	 * 
	 * @param phoneNumber {@link String}
	 * @return {@link String}
	 */
	@GetMapping("/phone/{phoneNumber}")
	public String getUserIDByPhoneNumber(@PathVariable String phoneNumber) {
		return "";
	}
}
