package com.example.practica.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica.entity.Detalle_ingreso;
import com.example.practica.repository.Detalle_ingresoRepository;
@Service
public class Detalle_ingresoServiceImplements implements Detalle_ingresoService{
@Autowired
Detalle_ingresoRepository detalle_ingresoRepository;
	@Override
	public Detalle_ingreso registrar(Detalle_ingreso detalle_ingreso) {
		// TODO Auto-generated method stub
		return detalle_ingresoRepository.save(detalle_ingreso);
	}

	@Override
	public Detalle_ingreso actualizar(Detalle_ingreso detalle_ingreso) {
		// TODO Auto-generated method stub
		return detalle_ingresoRepository.save(detalle_ingreso);
	}

	@Override
	public void eliminar(Detalle_ingreso detalle_ingreso) {
		// TODO Auto-generated method stub
		detalle_ingresoRepository.delete(detalle_ingreso);
	}

	@Override
	public List<Detalle_ingreso> ver() {
		// TODO Auto-generated method stub
		return detalle_ingresoRepository.findAll() ;
	}
	
}
