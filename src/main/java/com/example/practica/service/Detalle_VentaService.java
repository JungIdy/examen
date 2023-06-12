package com.example.practica.service;

import java.util.List;



import com.example.practica.entity.Detalle_venta;

public interface Detalle_VentaService {
	
	public Detalle_venta registrar(Detalle_venta detalle_venta);
	
	public Detalle_venta actualizar(Detalle_venta detalle_venta);
	
	public void eliminar(Detalle_venta detalle_venta);
	
	public List<Detalle_venta> ver();

}