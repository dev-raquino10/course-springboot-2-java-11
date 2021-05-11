package com.raquino.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.raquino.course.entities.User;
import com.raquino.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	//resolve dependency and associating instance of UserRepository in TestCOnfig
	@Autowired
	//declaring UserRepository attribute 
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User(null, "Bruna Aquino", "brunaaquino@gmail.com", "11964568912", "123456");
		User u2 = new User(null, "Rafael Aquino", "rafaaquino@gmail.com", "11936515050", "654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
