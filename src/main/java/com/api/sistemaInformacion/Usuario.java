package com.api.sistemaInformacion;

public class Usuario {
	private String usuario;
	private String contrasena;
	private boolean usuarioValido;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public boolean getUsuarioValido() {
		return usuarioValido;
	}
	public void setUsuarioValido(boolean usuarioValido) {
		this.usuarioValido = usuarioValido;
	}
	
}
