package com.cdns.banking.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cdns.banking.main.model.UserData;
import com.cdns.banking.main.repository.MainRepository;
import com.cdns.banking.main.security.config.UserConfig;

/**
 * MainUserDetailsService
 * 
 * @version 1.0
 */
@Service
public class MainUserDetailsService implements UserDetailsService {

	/**
	 * repository
	 */
	@Autowired
	private MainRepository repository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserData userData = repository.findByUserName(username);

		if (null == userData) {
			throw new UsernameNotFoundException("User Not Found with User Name: " + username);
		}

		return new UserConfig(userData);
	}

}
