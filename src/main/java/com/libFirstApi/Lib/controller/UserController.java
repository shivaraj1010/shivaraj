package com.libFirstApi.Lib.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.libFirstApi.Lib.entity.BookHouse;
import com.libFirstApi.Lib.entity.BookRegister;
import com.libFirstApi.Lib.entity.Role;
import com.libFirstApi.Lib.entity.Token;
import com.libFirstApi.Lib.entity.User;
import com.libFirstApi.Lib.entity.response.Sucess;
import com.libFirstApi.Lib.repository.BookHouseRepo;
import com.libFirstApi.Lib.repository.BookRegisterRepo;
import com.libFirstApi.Lib.repository.TokenRepo;
import com.libFirstApi.Lib.repository.UserRepo;

@RestController

public class UserController {

	@Autowired
	UserRepo userRepo;
	@Autowired
	TokenRepo tokenRepo;
	@Autowired
	BookHouseRepo bookHouseRepo;
	@Autowired
	BookRegisterRepo bookRegisterRepohjbhjbhj;

	

	@PostMapping("/signup")
	public ResponseEntity<User> createUser(@RequestBody User user, @RequestParam(name = "token") String tokenNum) {
		System.out.println(tokenNum);
		if (tokenNum != null) {
			boolean isTokenAvailable = tokenRepo.existsBytokenNum(tokenNum);
			System.out.println(isTokenAvailable);
			if (isTokenAvailable == true) {
				
				return new ResponseEntity<User>(userRepo.save(user), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(null, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
			}

		} else {
			return new ResponseEntity<>(null, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);

		}

	}

	@PostMapping("/signin")
	public Sucess login(@RequestBody User user) {
		Optional<User> result = userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());
		Sucess sucessMessage = new Sucess();
		result.ifPresent(user1 -> {
			System.out.println("Use = " + user1.getRole());
			if (user1.getRole() == Role.Admin) {
				String Uname = user1.getUsername();
				String pass = user1.getPassword();
				String seed = (Uname + pass);
				Token token = new Token(user1.getUserId(),seed);
				tokenRepo.save(token);
				System.out.println(seed);
				sucessMessage.setData(seed);
				sucessMessage.setMessage("Sucessfully logged in as ADMIN");
				sucessMessage.setStatus(200l);
				
			} else {
				sucessMessage.setData("");
				sucessMessage.setMessage("Sucessfully logged in as a User");
				sucessMessage.setStatus(200l);
				
			}

		});
		return sucessMessage;

	}

	@PostMapping("/addbooks")
	public ResponseEntity<BookHouse> saveBooks(@RequestBody BookHouse bookHouse,
			@RequestParam(name = "token") String tokenNum) {

		if (tokenNum != null) {
			boolean isTokenAuthenticated = tokenRepo.existsBytokenNum(tokenNum);
			if (isTokenAuthenticated == true) {
				System.out.println("......////"+bookHouse.toString());
				return new ResponseEntity<BookHouse>(bookHouseRepo.save(bookHouse), HttpStatus.OK);

			} else {
				return new ResponseEntity<>(null, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);

			}
		} else
			return new ResponseEntity<>(null, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);

	}
	
	@PostMapping("/bookregister")
	public ResponseEntity<BookRegister> saveBookRegister(@RequestParam(name = "token") String tokenNum) {
		System.out.println("............"+bookRegisterRepo);
		
		System.out.println(">>>>>>"+bookHouseRepo);
		if (tokenNum != null) {
		 	boolean isTokenAuthenticated = tokenRepo.existsBytokenNum(tokenNum);
			if (isTokenAuthenticated == true) {
				User user=new User();
				user.setUsername(user1.getUsername());
				user=userRepo.save(user);
				System.out.println("/////......"+user);
				BookRegister booreg=new BookRegister();
				booreg.setUser(user1);
				booreg=bookRegisterRepo.save(booreg);
				

				return new ResponseEntity<BookRegister>(bookRegisterRepo.save(bookRegister),HttpStatus.OK);

			} else {
				return new ResponseEntity<>(null, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);

			}
		} else
			return new ResponseEntity<>(null, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);

	}
	
	
	
	
}
