package com.cdns.banking.main.security.config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cdns.banking.main.model.UserData;

/**
 * UserConfig
 * 
 * @version 1.0
 */
public class UserConfig implements UserDetails {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * userData
	 */
	private UserData userData;

	/**
	 * 
	 * @param userData
	 */
	public UserConfig(UserData userData) {
		super();
		this.userData = userData;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getPassword() {
		return userData.getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getUsername() {
		return userData.getUserName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}
}
