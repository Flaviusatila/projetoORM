package com.iftm.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}
}
