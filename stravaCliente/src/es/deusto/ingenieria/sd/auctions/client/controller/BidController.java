package es.deusto.ingenieria.sd.auctions.client.controller;

import java.rmi.RemoteException; 
import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

//This class implements Controller pattern.
public class BidController {

	//Reference to the Service Locator
	protected ServiceLocator serviceLocator;

	public BidController(ServiceLocator serviceLocator) {
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

	public void anyadirRetoARetos(RetoDTO reto, UserDTO user) throws RemoteException {	
		this.serviceLocator.getService().anyadirRetoARetos(reto, user);
	}

	public void quitarRetoARetos(String tituloReto) throws RemoteException {
		this.serviceLocator.getService().quitarRetoARetos(tituloReto);		
	}

	public float calcularEstado(RetoDTO reto, UserDTO user)throws RemoteException {

		return this.serviceLocator.getService().calcularEstado(reto, user);

	}


}