package com.cdns.banking.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.cdns.banking.main.model.UserData;

/**
 * MainRepository
 * 
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
	 * @param phoneNumber String
	 * @return UserEntity
	 */
	UserData findByPhoneNumber(String phoneNumber);
}
