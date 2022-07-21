package com.longa.edu.pratica7.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	Long id;
	
	@Email
	String email;

	String senha;
}
