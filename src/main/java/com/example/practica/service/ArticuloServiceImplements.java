package com.example.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica.entity.Articulo;
import com.example.practica.repository.ArticuloRepository;

@Service
public class ArticuloServiceImplements implements ArticuloService {

	@Autowired
	private ArticuloRepository articuloRepository;

	@Override
	public Articulo registrar(Articulo articulo) {
		// TODO Auto-generated method stub
		return articuloRepository.save(articulo);
	}

	@Override
	public Articulo actualizar(Articulo articulo) {
		// TODO Auto-generated method stub
		return articuloRepository.save(articulo);
	}

	@Override
	public void eliminar(Articulo articulo) {
		// TODO Auto-generated method stub
 articuloRepository.delete(articulo);
	}

	@Override
	public List<Articulo> ver() {
		// TODO Auto-generated method stub
		return articuloRepository.findAll();
	}

}