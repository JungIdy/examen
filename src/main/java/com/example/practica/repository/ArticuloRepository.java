package com.example.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practica.entity.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, String>{
	
}
