package es.deusto.ingenieria.sd.auctions.client;

import java.util.List;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.client.gui.VentanaIniciarSesion;
import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;

public class MainProgram {

	public static void main(String[] args) {	
		ServiceLocator serviceLocator = new ServiceLocator();
		
//		args[0] = "127.0.0.1"; // RMIRegistry IP
//		args[1] = "1099"; // RMIRegistry Port
//		args[2] = "strava"; // Service Name
		serviceLocator.setService(args[0], args[1], args[2]);
				
		LoginController loginController = new LoginController(serviceLocator);
		ErController bidController = new ErController(serviceLocator);			
		VentanaIniciarSesion ventanaIniciarSesion = new VentanaIniciarSesion(loginController, bidController);	
		
	}
}