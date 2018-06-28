package com.api.sistemaInformacion;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/servicioRest")
public class Servicio {
	
	@POST
	@Path("/validarUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Usuario validarUsuario(Usuario usuario){
		if(usuario.getUsuario().equals("Java") && usuario.getContrasena().equals("1234")){
			usuario.setUsuarioValido(true);
		}
		else
			usuario.setUsuarioValido(false);
		return usuario;
		
	}
}
