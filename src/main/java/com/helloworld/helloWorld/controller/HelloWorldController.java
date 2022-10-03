package com.helloworld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Helllo World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		
		return "Mentalidades: Resposabilidade Pessoal, Mentalidade de Crescimento, Orientação ao futuro, Persistencia "
				+ " Habilidades Comportamentais: Comunicação, Atenção aos Detalhes, Proatividade";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Aprender Spring Boot, Aprender Java, Aprender JPA";
	}
}
