package com.cdn.banking.main.filter;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.cdn.banking.main.model.request.LoginRequest;
import com.cdn.banking.main.service.UserService;
import com.cdn.banking.main.util.JWTUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * AuthenticationFilter
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter
{
	/**
	 * userService
	 */
	private UserService userService;

	/**
	 * jwtUtil
	 */
	private JWTUtil jwtUtil;

	/**
	 * AuthenticationFilter constructor
	 * 
	 * @param userService {@link UserService}
	 * @param environment {@link Environment}
	 */
	public AuthenticationFilter(UserService userService, JWTUtil jwtUtil, AuthenticationManager authManager)
	{
		this.userService = userService;
		this.jwtUtil = jwtUtil;
		super.setAuthenticationManager(authManager);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException
	{
		try
		{
			LoginRequest req = new ObjectMapper().readValue(request.getInputStream(), LoginRequest.class);

			return getAuthenticationManager().authenticate(
					new UsernamePasswordAuthenticationToken(req.getUserName(), req.getPassword(), new ArrayList<>())
			);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void successfulAuthentication(
			HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult
	) throws IOException, ServletException
	{
		String userName = ((User) authResult.getPrincipal()).getUsername();
		UserDetails userDetails = userService.loadUserByUsername(userName);

		String token = jwtUtil.generateJwtToken(userDetails);
		response.setHeader("token", token);
		response.setHeader("userName", userName);
	}

}
