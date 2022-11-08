package com.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.spring.web")
public class SpringWebApplication 
{
	
//	@Autowired
//	private LoginRepository loginrepo;
//	
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(SpringWebApplication.class);
//    }

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner initDB() 
//	{
//		return (args) -> {
//			loginrepo.save(new Login("Prasanth", "prasanth15"));
//			loginrepo.save(new Login("Sriram", "sriram15"));
//			loginrepo.save(new Login("Ram", "Ram15"));
//		};
//	}
	 
}
