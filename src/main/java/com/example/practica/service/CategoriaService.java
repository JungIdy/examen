package com.example.practica.service;


import java.util.List;


import com.example.practica.entity.Categoria;


public interface CategoriaService {
	
	public Categoria registrar(Categoria categoria);
	
	public Categoria actualizar(Categoria categoria);
	
	public void eliminar(Categoria categoria);
	
	public List<Categoria>ver();
	
}