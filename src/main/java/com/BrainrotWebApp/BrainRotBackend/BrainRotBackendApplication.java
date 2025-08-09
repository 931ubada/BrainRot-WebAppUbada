package com.BrainrotWebApp.BrainRotBackend;

import com.BrainrotWebApp.BrainRotBackend.Entities.Users;
import com.BrainrotWebApp.BrainRotBackend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class BrainRotBackendApplication implements CommandLineRunner {

	public static void main(String[] args)
	{
		SpringApplication.run(BrainRotBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		Users users=new Users();
		users.setUser_id(1L);
		users.setUsername("Akash");
		users.setDate_of_Birth(LocalDate.of(1999, 5, 12));
		users.setEmail("Akash599@gmail.com");
		users.setIs_active(true);
		users.setCreated_at(LocalDateTime.of(2025,7,25,16,33));
		users.setPassword_hash("$2a$10$1qXz1v2M3uJh4Fh9oPj");
		users.setTimezone("Asia");
		users.setUpdated_at(LocalDateTime.of(2025,8,7,12,55));
		userRepository.save(users);
	}
}
