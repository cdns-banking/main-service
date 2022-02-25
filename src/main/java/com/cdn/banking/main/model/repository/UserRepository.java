package com.cdn.banking.main.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.cdn.banking.main.model.UserEntity;

/**
 * UserRepository
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
public interface UserRepository extends CrudRepository<UserEntity, String>
{
	/**
	 * findByUserName
	 * 
	 * @param userName {@link String}
	 * @return {@link UserEntity}
	 */
	UserEntity findByUserName(String userName);

	/**
	 * findByPhoneNumber
	 * 
	 * @param phoneNumber {@link String}
	 * @return {@link UserEntity}
	 */
	UserEntity findByPhoneNumber(String phoneNumber);
}
