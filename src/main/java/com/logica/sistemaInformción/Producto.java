package com.logica.sistemaInformción;

import java.io.File;

public class Producto {
	private String nombre;
	private String categoria;
	private String unidadMedida;
	private double valorMedida;
	private double precio;
	private double costo;
	private double impuesto;
	private File imagen;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public File getImagen() {
		return imagen;
	}
	public void setImagen(File imagen) {
		this.imagen = imagen;
	}
	public double getValorMedida() {
		return valorMedida;
	}
	public void setValorMedida(double valorMedida) {
		this.valorMedida = valorMedida;
	}
	
	

}
