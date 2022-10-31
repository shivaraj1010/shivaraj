package com.libFirstApi.Lib.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

public class BookHouse {
	@Id
	@GeneratedValue
	private Long bookHouseId;
	
	private String bookName; 
	
	private String authorName;
	
	
		
	@OneToOne(mappedBy = "bookHouse")
	private  BookRegister bookRegister;


	public BookHouse() {
		
	}

	

	public BookHouse(Long bookHouseId, String bookName, String authorName, BookRegister bookRegister) {
		super();
		this.bookHouseId = bookHouseId;
		this.bookName = bookName;
		this.authorName = authorName;
	
		this.bookRegister = bookRegister;
	}



	public Long getBookHouseId() {
		return bookHouseId;
	}

	public void setBookHouseId(Long bookHouseId) {
		this.bookHouseId = bookHouseId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

	

	public BookRegister getBookRegister() {
		return bookRegister;
	}



	public void setBookRegister(BookRegister bookRegister) {
		this.bookRegister = bookRegister;
	}



	@Override
	public String toString() {
		return "BookHouse [bookHouseId=" + bookHouseId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ",  bookRegister="+ bookRegister+"]";
	}

	

	
}
