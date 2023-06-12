package com.example.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practica.entity.Ingreso;

@Repository
public interface IngresoRepository extends JpaRepository<Ingreso, String>{
	
}