package com.geekstack.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

	@GetMapping("/hi")
	public String hi() {
		return "Hello from docker";
	}
}
