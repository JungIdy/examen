package com.example.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.practica.entity.Articulo;
import com.example.practica.service.ArticuloService;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {

    @Autowired
     ArticuloService articuloService;

    @PostMapping
    public Articulo registrar(@RequestBody Articulo articulo) {
        return articuloService.registrar(articulo);
    }

    @PutMapping
    public Articulo actualizar( @RequestBody Articulo articulo) {
        return articuloService.actualizar(articulo);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Articulo articulo) { 
        articuloService.eliminar(articulo);
    }

    @GetMapping
    public List<Articulo> ver() {
        return articuloService.ver();
    }
}




