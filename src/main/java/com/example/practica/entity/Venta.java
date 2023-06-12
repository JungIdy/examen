package com.example.practica.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Venta")
@Entity(name="venta")

public class Venta {
	@Id
	
	String cliente;
	String usuario;
	int venta;
	String tipo_comprobante;
	String serie_comprobante;
	String fecha_hora;
	double impuesto;
	int total_venta;
	String estado;
	public Venta() {
		super();
	}
	public Venta(String cliente, String usuario, int venta, String tipo_comprobante, String serie_comprobante,
			String fecha_hora, double impuesto, int total_venta, String estado) {
		super();
		this.cliente = cliente;
		this.usuario = usuario;
		this.venta = venta;
		this.tipo_comprobante = tipo_comprobante;
		this.serie_comprobante = serie_comprobante;
		this.fecha_hora = fecha_hora;
		this.impuesto = impuesto;
		this.total_venta = total_venta;
		this.estado = estado;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getVenta() {
		return venta;
	}
	public void setVenta(int venta) {
		this.venta = venta;
	}
	public String getTipo_comprobante() {
		return tipo_comprobante;
	}
	public void setTipo_comprobante(String tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}
	public String getSerie_comprobante() {
		return serie_comprobante;
	}
	public void setSerie_comprobante(String serie_comprobante) {
		this.serie_comprobante = serie_comprobante;
	}
	public String getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public int getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(int total_venta) {
		this.total_venta = total_venta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
