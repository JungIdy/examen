package com.example.practica.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practica.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, String>{
	
}

