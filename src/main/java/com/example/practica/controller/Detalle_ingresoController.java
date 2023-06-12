package com.example.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.practica.entity.Detalle_ingreso;
import com.example.practica.service.Detalle_ingresoService;

@RestController
@RequestMapping("/ingreso")
public class Detalle_ingresoController {

    @Autowired
    private Detalle_ingresoService detalle_ingresoService;

    @PostMapping
    public Detalle_ingreso registrar(@RequestBody Detalle_ingreso detalle_ingreso) {
        return detalle_ingresoService.registrar(detalle_ingreso);
    }

    @PutMapping
    public Detalle_ingreso actualizar( @RequestBody Detalle_ingreso detalle_ingreso) {
        return detalle_ingresoService.actualizar(detalle_ingreso);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Detalle_ingreso detalle_ingreso) {
        detalle_ingresoService.eliminar(detalle_ingreso);
    }

    @GetMapping
    public List<Detalle_ingreso> ver() {
        return detalle_ingresoService.ver();
    }
}