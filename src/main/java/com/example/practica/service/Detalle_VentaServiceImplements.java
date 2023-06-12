package com.example.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica.entity.Detalle_venta;
import com.example.practica.repository.Detalle_ventaRepository;

@Service
public class Detalle_VentaServiceImplements implements Detalle_VentaService {
	
	@Autowired
	private Detalle_ventaRepository detalle_ventaRepository;

	@Override
	public Detalle_venta registrar(Detalle_venta detalle_venta) {
		// TODO Auto-generated method stub
		return detalle_ventaRepository.save(detalle_venta);
	}

	@Override
	public Detalle_venta actualizar(Detalle_venta detalle_venta) {
		// TODO Auto-generated method stub
		return detalle_ventaRepository.save(detalle_venta);
	}

	@Override
	public void eliminar(Detalle_venta detalle_venta) {
		// TODO Auto-generated method stub
		detalle_ventaRepository.delete(detalle_venta);
	}

	@Override
	public List<Detalle_venta> ver() {
		// TODO Auto-generated method stub
		return detalle_ventaRepository.findAll() ;
	}
}