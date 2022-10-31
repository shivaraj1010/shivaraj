package com.libFirstApi.Lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libFirstApi.Lib.entity.BookRegister;


	@Repository
	public interface BookRegisterRepo extends JpaRepository<BookRegister,Long> {


		//BookRegister save(BookRegister bookRegister);


		

		//Optional<BookHouse> findAll(String bookName, String authorName);
		
	}


