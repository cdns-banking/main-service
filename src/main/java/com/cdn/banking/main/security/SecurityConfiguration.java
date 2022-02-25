package com.cdn.banking.main.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cdn.banking.main.filter.AuthenticationFilter;
import com.cdn.banking.main.service.UserService;
import com.cdn.banking.main.util.JWTUtil;

/**
 * SecurityConfiguration
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	/**
	 * userService
	 */
	@Autowired
	private UserService userService;

	/**
	 * environment
	 */
	@Autowired
	private Environment environment;

	/**
	 * bCryptPasswordEncoder
	 */
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	/**
	 * jwtUtil
	 */
	@Autowired
	private JWTUtil jwtUtil;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/**").hasIpAddress(environment.getProperty("gateway.ip")).and()
				.addFilter(getAuthenticationFilter());
		http.headers().frameOptions().disable();
	}

	/**
	 * getAuthenticationFilter
	 * 
	 * @return {@link AuthenticationFilter}
	 * @throws Exception
	 */
	private AuthenticationFilter getAuthenticationFilter() throws Exception
	{
		AuthenticationFilter authenticationFilter = new AuthenticationFilter(
				userService, jwtUtil, authenticationManager()
		);

		authenticationFilter.setFilterProcessesUrl(environment.getProperty("login.url.path"));
		return authenticationFilter;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder);
	}
}
