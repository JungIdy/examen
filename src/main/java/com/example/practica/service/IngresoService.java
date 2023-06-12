package com.example.practica.service;

import java.util.List;



import com.example.practica.entity.Ingreso;

public interface IngresoService {
	
	public Ingreso registrar(Ingreso ingreso);
	
	public Ingreso actualizar(Ingreso ingreso);
	
	public void eliminar(Ingreso ingreso);
	
	public List<Ingreso> ver();

}