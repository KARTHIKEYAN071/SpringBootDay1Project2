package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
private String Student="KARTHIKEYAN R";
@GetMapping("/")
public String getName() {
	return " Welcome " + Student+"!";
}

}
