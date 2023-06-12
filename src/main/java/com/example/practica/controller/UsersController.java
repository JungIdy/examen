package com.example.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.practica.entity.Users;
import com.example.practica.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@PostMapping
	public Users registrarUsers(@RequestBody Users users) {
		return usersService.registrar(users);
	}
	
	@PutMapping
	public Users actualizarUsers(@RequestBody Users users) {
		return usersService.actualizar(users);
	}
	
	@DeleteMapping
	public void eliminarUsers(@RequestBody Users users) {
		usersService.eliminar(users);
	}
	
	@GetMapping
	public List<Users> verUsers() {
		return usersService.ver();
	}
}
