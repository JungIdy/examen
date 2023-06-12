package com.example.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.practica.entity.Categoria;
import com.example.practica.service.CategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public Categoria registrar(@RequestBody Categoria categoria) {
        return categoriaService.registrar(categoria);
    }

    @PutMapping
    public Categoria actualizar(@RequestBody Categoria categoria) {
         return categoriaService.actualizar(categoria);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Categoria categoria ) {
       categoriaService.eliminar(categoria);
    }

    @GetMapping
    public List<Categoria> ver() {
        return categoriaService.ver();
    }
}