package com.javainuse;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.javainuse", "com.temporary.test"})
@ComponentScan({"com.temporary.test", "com.javainuse"})
public class SpringBootDroolsHelloWorldApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDroolsHelloWorldApp.class, args);

	}
	
	// Move this to the Configuration class
	/*
	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}
	*/
	

}
