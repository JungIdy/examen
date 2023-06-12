package com.example.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica.entity.Persona;
import com.example.practica.repository.PersonaRepository;

@Service
public class PersonaServiceImplements implements PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Persona registrar(Persona persona) {
		// TODO Auto-generated method stub
		return personaRepository.save(persona);
	}

	@Override
	public Persona actualizar(Persona persona) {
		// TODO Auto-generated method stub
		return personaRepository.save(persona);
	}

	@Override
	public void eliminar(Persona persona) {
		// TODO Auto-generated method stub
		personaRepository.delete(persona);
	}

	@Override
	public List<Persona> ver() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}
}