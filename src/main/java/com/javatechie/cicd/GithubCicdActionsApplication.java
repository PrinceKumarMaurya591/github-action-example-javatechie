package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to prince maurya !";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);



		    MultithreadingMyThread thread1 = new MultithreadingMyThread();
			MultithreadingMyThread thread2 = new MultithreadingMyThread();
	
			thread1.start(); // Starts the thread
			thread2.start();


			Thread thread1r = new Thread(new MyRunnable());
			Thread thread2r = new Thread(new MyRunnable());
	
			thread1r.start(); // Starts the thread
			thread2r.start();

	}

	
		
			
		

}
