package com.example.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica.entity.Venta;
import com.example.practica.repository.VentaRepository;

@Service
public class VentasServiceImplements implements VentaService {
	
	@Autowired
	private VentaRepository ventaRepository;

	@Override
	public Venta registrar(Venta venta) {
		// TODO Auto-generated method stub
		return ventaRepository.save(venta);
	}

	@Override
	public Venta actualizar(Venta venta) {
		// TODO Auto-generated method stub
		return ventaRepository.save(venta);
	}

	@Override
	public void eliminar(Venta venta) {
		// TODO Auto-generated method stub
		ventaRepository.delete(venta);
	}

	@Override
	public List<Venta> ver() {
		// TODO Auto-generated method stub
		return ventaRepository.findAll();
	}
}