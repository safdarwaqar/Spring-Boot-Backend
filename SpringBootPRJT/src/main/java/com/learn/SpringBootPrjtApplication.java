package com.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.entity.Student;

import repo.StudentRepo;

@SpringBootApplication
public class SpringBootPrjtApplication {
	@Autowired
	StudentRepo stRep;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrjtApplication.class, args);
		System.out.println("Application Started..");
		
	}

}
