package com.sample.exceptionhandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class ExceptionhandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionhandlerApplication.class, args);
	}


	final List<String> lists = Arrays.asList("test1","test2");
	@GetMapping(value = "test")
	public String test(){
		return lists.get(2).toUpperCase();
	}
}
