package com.cdns.banking.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
	private String encryptedPassword;

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
}
