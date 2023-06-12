package com.example.practica.service;

import java.util.List;



import com.example.practica.entity.Persona;

public interface PersonaService {
	
	public Persona registrar(Persona persona);
	
	public Persona actualizar(Persona persona);
	
	public void eliminar(Persona persona);
	
	public List<Persona> ver();

}