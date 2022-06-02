package com.shruti.project.enitites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
//import javax.persistence.Transient;

import org.springframework.lang.NonNull;

@Entity
public class SignInfo {

	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@NonNull
	private String firstName;

	private String lastName;

	@NonNull
	private String userName;

	@NonNull
	private String emailId;

	@NonNull
	private String password;

	@NonNull
	private String role;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "AddToCart", joinColumns = {
			@JoinColumn(name = "userId", referencedColumnName = "userId", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id", referencedColumnName = "id", nullable = false, updatable = false) })
	private Set<BookStore> books = new HashSet<>();

//	@Transient
//	private String token;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public SignInfo() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "SignInfo [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", emailId=" + emailId + ", password=" + password + ", role=" + role + "]";
	}

}
