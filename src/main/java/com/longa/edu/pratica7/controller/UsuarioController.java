package com.longa.edu.pratica7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class UsuarioController {

	@GetMapping
	public String getAuth() {
		return "Autorizado";
	}
}
