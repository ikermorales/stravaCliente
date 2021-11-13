package es.deusto.ingenieria.sd.auctions.client.controller;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;

//This class implements Controller pattern.
public class BidController {
	
	//Reference to the Service Locator
	private ServiceLocator serviceLocator;
	
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

	public ArrayList<EntrenamientoDTO> getEntrenamientos(String deporte) {
		try {
			return this.serviceLocator.getService().getEntrenamientos(deporte);
		} catch (RemoteException e) {
			System.out.println("# Error getting articles of a category: " + e);
			return null;
		}
	}

}