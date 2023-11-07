package com.example.NOTEncrypt;

//import com.example.NOTEncrypt.entity.User;
//import com.example.NOTEncrypt.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class NotEncryptApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotEncryptApplication.class, args);
	}

}
