package com.cdns.banking.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * UserData
 * 
 * @version 1.0
 */
@Entity
@Table(name = "t_userdata")
public class UserData {

	/**
	 * userID
	 */
	@Id
	@GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "userid", columnDefinition = "uniqueidentifier")
	private String userID;

	/**
	 * userName
	 */
	@Column(name = "username", nullable = false, length = 32, unique = true)
	private String userName;

	/**
	 * encryptedPassword
	 */
	@Column(name = "user_password", nullable = false, length = 32)
	private String password;

	/**
	 * firstName
	 */
	@Column(name = "firstname", nullable = false, length = 64)
	private String firstName;

	/**
	 * lastName
	 */
	@Column(name = "lastname", nullable = false, length = 64)
	private String lastName;

	/**
	 * address
	 */
	@Column(name = "user_address", nullable = false, length = 2000)
	private String address;

	/**
	 * phoneNumber
	 */
	@Column(name = "phone_number", nullable = false, length = 20, unique = true)
	private String phoneNumber;

	/**
	 * emailID
	 */
	@Column(name = "email_id", nullable = false, length = 256, unique = true)
	private String emailID;

	/**
	 * universityName
	 */
	@Column(name = "university_name", nullable = true, length = 128)
	private String universityName;

	/**
	 * userType
	 */
	@Column(name = "user_type", nullable = false, length = 10, columnDefinition = "varchar(10) default 1")
	private String userType;

	/**
	 * isEnabled
	 */
	@Column(name = "is_enabled", nullable = false, columnDefinition = "bit default 1")
	private int isEnabled;

	/**
	 * getUserID
	 * 
	 * @return userID Integer
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * setUserID
	 * 
	 * @param userID Integer
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * getUserName
	 * 
	 * @return userName String
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * setUserName
	 * 
	 * @param userName String
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * getPassword
	 * 
	 * @return password String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * setPassword
	 * 
	 * @param password String
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * getFirstName
	 * 
	 * @return firstName String
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * setFirstName
	 * 
	 * @param firstName String
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * getLastName
	 * 
	 * @return lastName String
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * setLastName
	 * 
	 * @param lastName String
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * getAddress
	 * 
	 * @return address String
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * setAddress
	 * 
	 * @param address String
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * getPhoneNumber
	 * 
	 * @return phoneNumber String
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * setPhoneNumber
	 * 
	 * @param phoneNumber String
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * getEmailID
	 * 
	 * @return emailID String
	 */
	public String getEmailID() {
		return emailID;
	}

	/**
	 * setEmailID
	 * 
	 * @param emailID String
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	/**
	 * getUniversityName
	 * 
	 * @return universityName String
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * setUniversityName
	 * 
	 * @param universityName String
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/**
	 * getUserType
	 * 
	 * @return userType String
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * setUserType
	 * 
	 * @param userType String
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * getIsEnabled
	 * 
	 * @return isEnabled int
	 */
	public int getIsEnabled() {
		return isEnabled;
	}

	/**
	 * setIsEnabled
	 * 
	 * @param isEnabled int
	 */
	public void setIsEnabled(int isEnabled) {
		this.isEnabled = isEnabled;
	}
}
