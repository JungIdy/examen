package com.example.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.practica.entity.Ingreso;
import com.example.practica.service.IngresoService;

@RestController
@RequestMapping("/registro")
public class IngresoController {
	
	@Autowired
	private IngresoService ingresoService;
	
	@PostMapping
	public Ingreso registrarIngreso(@RequestBody Ingreso ingreso) {
		return ingresoService.registrar(ingreso);
	}
	
	@PutMapping
	public Ingreso actualizarIngreso(@RequestBody Ingreso ingreso) {
		return ingresoService.actualizar(ingreso);
	}
	
	@DeleteMapping
	public void eliminarIngreso(@RequestBody Ingreso ingreso) {
		ingresoService.eliminar(ingreso);
	}
	
	@GetMapping
	public List<Ingreso> verIngresos() {
		return ingresoService.ver();
	}
}
