package com.datos.sistemaInformacion;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.logica.sistemaInformción.Producto;



public class MySql{
	
	private String driver = "com.mysql.jdbc.Driver";
	private String usuario = "root" ;
	private String contrasena = "";
	private String servidor = "jdbc:mysql://localhost:3306/sistema?characterEncoding=utf-8";
	private Connection conexion; 

    
    private void abrirConexionBD(){

    	try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(servidor , usuario, contrasena);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
        
    }
    
    public int insertarProducto(Producto nvoProducto){
    	
    	try {
    		abrirConexionBD();
    		String query = "{CALL sistema.insertarProducto(?,?,?,?,?,?,?)}";
			CallableStatement stmt = (CallableStatement) conexion.prepareCall(query);
			stmt.setString(1, nvoProducto.getNombre());
			stmt.setString(2, nvoProducto.getCategoria());
			stmt.setString(3, nvoProducto.getUnidadMedida());
			stmt.setDouble(4, nvoProducto.getValorMedida());
			stmt.setDouble(5, nvoProducto.getPrecio());
			stmt.setDouble(6, nvoProducto.getCosto());
			stmt.setDouble(7, nvoProducto.getImpuesto());
			stmt.executeQuery();
			
    	} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
    	return 1;
    }
    
 
    
}