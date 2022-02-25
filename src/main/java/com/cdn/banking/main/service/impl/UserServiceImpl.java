package com.cdn.banking.main.service.impl;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cdn.banking.main.model.request.UserRequest;
import com.cdn.banking.main.model.repository.UserRepository;
import com.cdn.banking.main.model.UserEntity;
import com.cdn.banking.main.service.UserService;

/**
 * UserServiceImpl
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService
{

	/**
	 * userRepository
	 */
	@Autowired
	UserRepository userRepository;

	/**
	 * bCryptPasswordEncoder
	 */
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRequest register(UserRequest userRequest)
	{
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		UserEntity userEntity = modelMapper.map(userRequest, UserEntity.class);
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(userRequest.getPassword()));

		return modelMapper.map(userRepository.save(userEntity), UserRequest.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		UserEntity user = userRepository.findByUserName(username);

		if (null == user)
		{
			throw new UsernameNotFoundException(username);
		}

		return new User(user.getUserName(), user.getEncryptedPassword(), true, true, true, true, new ArrayList<>());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserEntity getUserIDByUserName(String userName)
	{
		return userRepository.findByUserName(userName);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserEntity getUserByPhoneNumber(String phoneNumber)
	{
		return userRepository.findByPhoneNumber(phoneNumber);
	}
}
