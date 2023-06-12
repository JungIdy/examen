package com.example.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practica.entity.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, String>{
	
}