package com.libFirstApi.Lib.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity

public class BookRegister {

	@Id
	@SequenceGenerator(name="bookRegister_sequence",sequenceName = "bookRegister_sequence",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator = "bookRegister_sequence")
	private Long bookRegisterId;
	
	private String departmentName;

	private Date lastdatetoreturn;
	
	private Boolean status;
	

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_user_id")
	private User user;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_bookHouse_id")
	private BookHouse bookHouse;

	public BookRegister() {
		
	}

	

	public BookRegister(Long bookRegisterId, String departmentName, Date lastdatetoreturn, Boolean status, User user,
			BookHouse bookHouse) {
		super();
		this.bookRegisterId = bookRegisterId;
		this.departmentName = departmentName;
		this.lastdatetoreturn = lastdatetoreturn;
		this.status = status;
		this.user = user;
		this.bookHouse = bookHouse;
	}



	public Long getBookRegisterId() {
		return bookRegisterId;
	}

	public void setBookRegisterId(Long bookRegisterId) {
		this.bookRegisterId = bookRegisterId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Date getLastdatetoreturn() {
		return lastdatetoreturn;
	}

	public void setLastdatetoreturn(Date lastdatetoreturn) {
		this.lastdatetoreturn = lastdatetoreturn;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public BookHouse getBookHouse() {
		return bookHouse;
	}



	public void setBookHouse(BookHouse bookHouse) {
		this.bookHouse = bookHouse;
	}



	@Override
	public String toString() {
		return "BookRegister [bookRegisterId=" + bookRegisterId + ", departmentName=" + departmentName + ", lastdatetoreturn="
				+ lastdatetoreturn + ", status=" + status + ", user=" + user + ", bookHouse=" + bookHouse + "]";
	}

	

	
	

	
}