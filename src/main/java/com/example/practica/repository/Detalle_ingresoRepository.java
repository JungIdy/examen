package com.example.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practica.entity.Detalle_ingreso;

@Repository
public interface Detalle_ingresoRepository extends JpaRepository<Detalle_ingreso, String>{
	
}
