package com.example.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica.entity.Categoria;
import com.example.practica.repository.CategoriaRepository;
@Service
 public class CategoriaServiceImplements implements CategoriaService{
@Autowired
CategoriaRepository categoriaRepository;
	@Override
	public Categoria registrar(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(categoria);
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(categoria);
	}

	@Override
	public void eliminar(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaRepository.delete(categoria);
	}

	@Override
	public List<Categoria> ver() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}
	 
 }

