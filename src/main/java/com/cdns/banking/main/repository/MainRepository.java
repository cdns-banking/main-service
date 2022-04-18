package com.cdns.banking.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.cdns.banking.main.model.UserData;

/**
 * MainRepository
 * 
 * @author Deepu Prasad Mathew 21017956
 * @version 1.0
 */
public interface MainRepository extends CrudRepository<UserData, String> {
	/**
	 * findByUserName
	 * 
	 * @param userName String
	 * @return UserData
	 */
	UserData findByUserName(String userName);

	/**
	 * findByPhoneNumber
	 * 
	 * @param phoneNumber {@link String}
	 * @return {@link UserEntity}
	 */
	UserData findByPhoneNumber(String phoneNumber);
}
