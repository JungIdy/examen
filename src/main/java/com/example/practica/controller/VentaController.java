package com.example.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.practica.entity.Venta;
import com.example.practica.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {
	
	@Autowired
	private VentaService ventaService;
	
	@PostMapping
	public Venta registrarVenta(@RequestBody Venta venta) {
		return ventaService.registrar(venta);
	}
	
	@PutMapping
	public Venta actualizarVenta(@RequestBody Venta venta) {
		return ventaService.actualizar(venta);
	}
	
	@DeleteMapping
	public void eliminarVenta(@RequestBody Venta venta) {
		ventaService.eliminar(venta);
	}
	
	@GetMapping
	public List<Venta> verVentas() {
		return ventaService.ver();
	}
}