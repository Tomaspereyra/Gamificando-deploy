package com.unla.gamificandoalgoritmos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.unla.gamificandoalgoritmos.repository.IUserRepository;
import com.unla.gamificandoalgoritmos.websecurity.Usuario;

@SpringBootApplication
public class GamificandoalgoritmosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamificandoalgoritmosApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initData (IUserRepository userRepository) {
		return (args)->{
			System.out.println(userRepository.save(new Usuario("tomas.pereyra",new BCryptPasswordEncoder().encode("123"))));
			System.out.println(userRepository.findByEmail("tomas.pereyra"));
			};
	}


}
