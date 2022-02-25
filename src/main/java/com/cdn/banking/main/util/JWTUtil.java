package com.cdn.banking.main.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * JWTUtil
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
@Service
public class JWTUtil
{

	/**
	 * environment
	 */
	@Autowired
	Environment environment;

	/**
	 * generateJwtToken
	 * 
	 * @param userDetails {@link UserDetails}
	 * @return {@link String}
	 */
	public String generateJwtToken(UserDetails userDetails)
	{
		return Jwts.builder().setSubject(userDetails.getUsername())
				.setExpiration(
						new Date(
								System.currentTimeMillis()
										+ Long.parseLong(environment.getProperty("token.expiration.time"))
						)
				).signWith(SignatureAlgorithm.HS512, environment.getProperty("token.secret")).compact();
	}

}
