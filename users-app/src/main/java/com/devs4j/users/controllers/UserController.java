package com.devs4j.users.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devs4j.users.models.User;
import com.devs4j.users.services.UserService;

@RestController
//Definicion de mi recurso
@RequestMapping("/users")
public class UserController {
	
	//Inyeccion de mi servicio UserService
	@Autowired
	private UserService userService;
	
	//Metodo Http + Recurso - Handler methods
	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<List<User>>(userService.getUsers(),HttpStatus.OK);
	}
}
