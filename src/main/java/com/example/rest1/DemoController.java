package com.example.rest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="Home page Controller")
@RestController
@RequestMapping("/api")
public class DemoController {
	@ApiOperation(value="gives the home page ")
	@GetMapping("/welcome")              // localhost:8080/api/welcome
	public String m1() {
		return " Welcome to swagger documentation";
	}
	@ApiOperation(value=" display user details  ")
	@GetMapping("/users")            //localhost:8080/api/users
	public String m2() {
		return " all user details ..... 1";
	}
	@ApiOperation(value=" updates user details  ")
	@GetMapping("/update")
	public String m3() {
		return " Updated list .. .......2";
	}

}