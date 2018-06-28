package com.datos.sistemaInformacion;

import com.logica.sistemaInformción.Producto;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		MySql n = new MySql();
		p.setNombre("Arroz tio pelon");
		p.setCategoria("Arroz");
		p.setUnidadMedida("Kg");
		p.setValorMedida(1.8);
		p.setPrecio(1200);
		p.setCosto(350);
		p.setImpuesto(0);
		
		n.insertarProducto(p);
	
		

	}

}
