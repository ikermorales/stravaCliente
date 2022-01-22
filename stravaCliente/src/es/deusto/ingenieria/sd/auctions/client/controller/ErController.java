package es.deusto.ingenieria.sd.auctions.client.controller;

import java.rmi.RemoteException; 
import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoAceptadoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

//This class implements Controller pattern.
public class ErController {

	//Reference to the Service Locator
	protected ServiceLocator serviceLocator;

	public ErController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator; 
	}

	public ArrayList<RetoDTO> getRetos(String deporte) {
		try {
			return this.serviceLocator.getService().getRetos(deporte);
		} catch (RemoteException e) {
			System.out.println("# Error getting retos: " + e);
			return null;
		}
	}

	public float calcularEstado(RetoAceptadoDTO reto, UserDTO user)throws RemoteException {
		return this.serviceLocator.getService().calcularEstado(reto, user);
	}
	
	public List<EntrenamientoDTO> crearEntrenamiento(UserDTO usuarioDTO, String deporte, String titulo, String fechaIni, int distancia, String horaIni, int duracion) throws RemoteException {
		return this.serviceLocator.getService().crearEntrenamiento(usuarioDTO, deporte, titulo, fechaIni, distancia, horaIni, duracion);
	}
	
	public void crearReto(UserDTO user, String deporte, String titulo, String descripcion, String fechaIni, String fechaFin, int objetivo) throws RemoteException {
		this.serviceLocator.getService().crearReto(user, deporte, titulo, descripcion, fechaIni, fechaFin, objetivo);
	}



}