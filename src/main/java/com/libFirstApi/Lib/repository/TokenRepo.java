package com.libFirstApi.Lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libFirstApi.Lib.entity.Token;
@Repository
public interface TokenRepo extends JpaRepository<Token,Long> {

	//Optional<TokenRepo> findByTokenNumAnd(String tokenNum);
	 Boolean existsBytokenNum(String tokenNum);

	

}
