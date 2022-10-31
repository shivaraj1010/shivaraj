package com.libFirstApi.Lib.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity

@Table(name="users")		
public class User {
	@Id
	@GeneratedValue 
	private Long userId;
	
	private String username;
	
	private String email;
	
	private String password;

	@Enumerated(EnumType.ORDINAL)
 	private  Role role;
	
	@OneToOne(mappedBy = "user")
	private  BookRegister  bookRegister;
	
	 
	public User() {
		
	}
	
	

	public User(Long userId,  String username, String email,
			 String password, Role role, BookRegister  bookRegister) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
	this.bookRegister=bookRegister;
	}



	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

//	public BookHouse getBookHouse() {
//		return bookHouse;
//	}
//
//	public void setBookHouse(BookHouse bookHouse) {
//		this.bookHouse= bookHouse;
//	}
////	
//			
	public BookRegister getBookRegister() {
		return bookRegister;
	}

	public void setBookRegister(BookRegister bookRegister) {
		this.bookRegister = bookRegister;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", password=" + password + ", role="
				+ role + ",bookRegister="+ bookRegister+"]";
	}

	


	
}
