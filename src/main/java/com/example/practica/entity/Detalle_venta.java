package com.example.practica.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Detalle_venta")
@Entity(name="detalle_venta")

public class Detalle_venta {
	@Id
	String detalle_venta;
	int venta;
	String articulo;
	int cantidad;
	int precio_venta;
	double descuento;
	public Detalle_venta() {
		super();
	}
	public Detalle_venta(String detalle_venta, int venta, String articulo, int cantidad, int precio_venta,
			double descuento) {
		super();
		this.detalle_venta = detalle_venta;
		this.venta = venta;
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.precio_venta = precio_venta;
		this.descuento = descuento;
	}
	public String getDetalle_venta() {
		return detalle_venta;
	}
	public void setDetalle_venta(String detalle_venta) {
		this.detalle_venta = detalle_venta;
	}
	public int getVenta() {
		return venta;
	}
	public void setVenta(int venta) {
		this.venta = venta;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	

}
