package org.niit.DemoMC;

import org.niit.DemoMC.service.MessegeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoMcApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoMcApplication.class, args);
		MessegeService messegeService = applicationContext.getBean("messegeService", MessegeService.class);
		System.out.println("" + messegeService.getMessage());
	}

}
