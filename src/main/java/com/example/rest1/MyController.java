package com.example.rest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MyController {
	
	@GetMapping("/second")      //localhost:8080/my/second
	public String m4() {
		return " This is second Controller.....";
	}
	@GetMapping("/another")
	public String m5() {
		return " This is ANOTHER Controller.....";
	}
 
}
