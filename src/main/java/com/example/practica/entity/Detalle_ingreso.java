package com.example.practica.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Detalle_ingreso")
@Entity(name="detalle_ingreso")

public class Detalle_ingreso {
	 @Id
	String detalle_ingreso;
	String ingreso;
	String articulo;
	String cantidad;
	int precio_compra;
	int precio_venta;
	public Detalle_ingreso(String detalle_ingreso, String ingreso, String articulo, String cantidad, int precio_compra,
			int precio_venta) {
		super();
		this.detalle_ingreso = detalle_ingreso;
		this.ingreso = ingreso;
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}
	public String getDetalle_ingreso() {
		return detalle_ingreso;
	}
	public void setDetalle_ingreso(String detalle_ingreso) {
		this.detalle_ingreso = detalle_ingreso;
	}
	public String getIngreso() {
		return ingreso;
	}
	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(int precio_compra) {
		this.precio_compra = precio_compra;
	}
	public int getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}

}
