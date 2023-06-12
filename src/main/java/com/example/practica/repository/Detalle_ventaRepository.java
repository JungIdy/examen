package com.example.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practica.entity.Detalle_venta;

@Repository
public interface Detalle_ventaRepository extends JpaRepository<Detalle_venta, String>{
	
}
