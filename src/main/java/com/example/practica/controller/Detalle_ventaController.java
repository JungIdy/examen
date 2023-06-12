package com.example.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.practica.entity.Detalle_venta;
import com.example.practica.service.Detalle_VentaService;

@RestController
@RequestMapping("/detalle")
public class Detalle_ventaController {
	
	@Autowired
	private Detalle_VentaService detalleVentaService;
	
	@PostMapping
	public Detalle_venta registrarDetalleVenta(@RequestBody Detalle_venta detalleVenta) {
		return detalleVentaService.registrar(detalleVenta);
	}
	
	@PutMapping
	public Detalle_venta actualizarDetalleVenta(@RequestBody Detalle_venta detalleVenta) {
		return detalleVentaService.actualizar(detalleVenta);
	}
	
	@DeleteMapping
	public void eliminarDetalleVenta(@RequestBody Detalle_venta detalleVenta) {
		detalleVentaService.eliminar(detalleVenta);
	}
	
	@GetMapping
	public List<Detalle_venta> verDetalleVentas() {
		return detalleVentaService.ver();
	}
}