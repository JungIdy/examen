package com.example.practica.service;
import java.util.List;



import com.example.practica.entity.Articulo;


public interface ArticuloService {
	
	public Articulo registrar(Articulo articulo);
	
	public Articulo actualizar(Articulo articulo);
	
	public void eliminar(Articulo articulo);
	
	public List<Articulo>ver();
	

}
