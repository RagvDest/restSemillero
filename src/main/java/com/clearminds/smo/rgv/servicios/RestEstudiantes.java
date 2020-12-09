package com.clearminds.smo.rgv.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clearminds.rgv.dtos.Estudiante;
import com.clearminds.rgv.excepciones.BDDException;
import com.clearminds.rgv.servicios.ServicioEstudiante;

@Path("/estudiantes")
public class RestEstudiantes {
	
	@Path("/insertar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public void insertar(Estudiante est){
		ServicioEstudiante srvEst = new ServicioEstudiante();
		try {
			srvEst.insertarEstudiante(est);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
	
	@Path("/actualizar")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public void actualizar(Estudiante est){
		ServicioEstudiante srvEst = new ServicioEstudiante();
		try {
			srvEst.actualizarEstudiante(est);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
	
}
