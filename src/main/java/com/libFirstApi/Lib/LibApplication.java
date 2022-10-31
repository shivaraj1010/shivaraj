package com.libFirstApi.Lib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.libFirstApi.Lib","com.libFirstApi.Lib.controller"})
@EntityScan("com.libFirstApi.Lib.entity")
public class LibApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibApplication.class, args);
	}

}
