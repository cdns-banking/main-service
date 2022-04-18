package com.cdns.banking.main.service;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cdns.banking.main.model.UserData;
import com.cdns.banking.main.model.UserRequest;
import com.cdns.banking.main.repository.MainRepository;

/**
 * MainService
 * 
 * @author Deepu Prasad mathew 21017956
 * @version 1.0
 */
public class MainService {

	/**
	 * userRepository
	 */
	@Autowired
	MainRepository repository;

	/**
	 * bCryptPasswordEncoder
	 */
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	/**
	 * register
	 * 
	 * @param request UserRequest
	 * @return UserRequest
	 */
	public UserRequest register(@Valid UserRequest request) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		UserData userData = modelMapper.map(request, UserData.class);
		userData.setEncryptedPassword(bCryptPasswordEncoder.encode(request.getPassword()));

		return modelMapper.map(repository.save(userData), UserRequest.class);
	}

}
