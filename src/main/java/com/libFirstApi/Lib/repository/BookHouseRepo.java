package com.libFirstApi.Lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libFirstApi.Lib.entity.BookHouse;
@Repository
public interface BookHouseRepo extends JpaRepository<BookHouse,Long> {

	

	//Optional<BookHouse> findAll(String bookName, String authorName);
	
}
