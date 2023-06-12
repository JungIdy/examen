package com.example.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.practica.entity.Persona;
import com.example.practica.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@PostMapping
	public Persona registrarPersona(@RequestBody Persona persona) {
		return personaService.registrar(persona);
	}
	
	@PutMapping
	public Persona actualizarPersona(@RequestBody Persona persona) {
		return personaService.actualizar(persona);
	}
	
	@DeleteMapping
	public void eliminarPersona(@RequestBody Persona persona) {
		personaService.eliminar(persona);
	}
	
	@GetMapping
	public List<Persona> verPersonas() {
		return personaService.ver();
	}
}