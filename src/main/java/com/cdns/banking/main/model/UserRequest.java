package com.cdns.banking.main.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequest {

	/**
	 * userID
	 */
	private String userID;

	/**
	 * userName
	 */
	@Size(min = 8, max = 32, message = "Username should have minimum 8 characters and maximum 32 characters!")
	@NotNull(message = "Username cannot be empty!")
	private String userName;

	/**
	 * password
	 */
	@Size(min = 8, max = 32, message = "Password should have minimum 8 characters and maximum 32 characters!")
	@NotNull(message = "Password cannot be empty!")
	private String password;

	/**
	 * firstName
	 */
	@Size(max = 64, message = "First Name should not exceed the maximum of 64 characters!")
	@NotNull(message = "First Name cannot be empty!")
	private String firstName;

	/**
	 * lastName
	 */
	@Size(max = 64, message = "Last Name should not exceed the maximum of 64 characters!")
	@NotNull(message = "Last Name cannot be empty!")
	private String lastName;

	/**
	 * address
	 */
	@Size(max = 2000, message = "Address should not exceed the maximum of 2000 characters!")
	@NotNull(message = "Address cannot be empty!")
	private String address;

	/**
	 * phoneNumber
	 */
	@Size(min = 6, max = 20, message = "Phone Number should have minimum of 6 and maximum of 20 digits/characters!")
	@NotNull(message = "Phone Number cannot be empty!")
	private String phoneNumber;

	/**
	 * emailID
	 */
	@NotNull(message = "Email ID cannot be empty!")
	@Email(message = "Email is invalid!")
	private String emailID;

	/**
	 * universityName
	 */
	private String universityName;

	/**
	 * userType
	 */
	private String userType;

	/**
	 * isEnabled
	 */
	private int isEnabled;

	/**
	 * encryptedPassword
	 */
	private String encryptedPassword;

	/**
	 * getUserID
	 * 
	 * @return userID {@link Integer}
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * setUserID
	 * 
	 * @param userID {@link Integer}
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * getUserName
	 * 
	 * @return userName {@link String}
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * setUserName
	 * 
	 * @param userName {@link String}
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * getFirstName
	 * 
	 * @return firstName {@link String}
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * setFirstName
	 * 
	 * @param firstName {@link String}
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * getLastName
	 * 
	 * @return lastName {@link String}
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * setLastName
	 * 
	 * @param lastName {@link String}
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * getPassword
	 * 
	 * @return password {@link String}
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * setPassword
	 * 
	 * @param password {@link String}
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * getAddress
	 * 
	 * @return address {@link String}
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * setAddress
	 * 
	 * @param address {@link String}
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * getPhoneNumber
	 * 
	 * @return phoneNumber {@link String}
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * setPhoneNumber
	 * 
	 * @param phoneNumber {@link String}
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * getEmailID
	 * 
	 * @return emailID {@link String}
	 */
	public String getEmailID() {
		return emailID;
	}

	/**
	 * setEmailID
	 * 
	 * @param emailID {@link String}
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	/**
	 * getUniversityName
	 * 
	 * @return universityName {@link String}
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * setUniversityName
	 * 
	 * @param universityName {@link String}
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/**
	 * getUserType
	 * 
	 * @return userType {@link String}
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * setUserType
	 * 
	 * @param userType {@link String}
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * getIsEnabled
	 * 
	 * @return isEnabled {@link Integer}
	 */
	public int getIsEnabled() {
		return isEnabled;
	}

	/**
	 * setIsEnabled
	 * 
	 * @param isEnabled {@link Integer}
	 */
	public void setIsEnabled(int isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * getEncryptedPassword
	 * 
	 * @return encryptedPassword {@link String}
	 */
	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	/**
	 * setEncryptedPassword
	 * 
	 * @param encryptedPassword {@link String}
	 */
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

}
