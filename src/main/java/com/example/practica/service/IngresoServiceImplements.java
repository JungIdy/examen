package com.example.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica.entity.Ingreso;
import com.example.practica.repository.IngresoRepository;

@Service
public class IngresoServiceImplements implements IngresoService {
	
	@Autowired
	private IngresoRepository ingresoRepository;

	@Override
	public Ingreso registrar(Ingreso ingreso) {
		// TODO Auto-generated method stub
		return ingresoRepository.save(ingreso);
	}

	@Override
	public Ingreso actualizar(Ingreso ingreso) {
		// TODO Auto-generated method stub
		return ingresoRepository.save(ingreso);
	}

	@Override
	public void eliminar(Ingreso ingreso) {
		// TODO Auto-generated method stub
		ingresoRepository.delete(ingreso);
	}

	@Override
	public List<Ingreso> ver() {
		// TODO Auto-generated method stub
		return ingresoRepository.findAll();
	}
}