package com.libFirstApi.Lib.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libFirstApi.Lib.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);
	Optional<User> findByEmailAndPassword(String email,String password);
//	Optional<User> findByPassword(String password);
//
//	Boolean existsByPassword(String password);
//    Boolean existsByEmail(String email);
}
