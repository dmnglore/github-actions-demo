package com.gitubactions.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to github Actions";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

//git init
//git status

//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/dmnglore/github-actions-demo.git
//git add
// git push -u origin maingit init

