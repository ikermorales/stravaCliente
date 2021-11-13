package es.deusto.ingenieria.sd.auctions.client;

import java.util.List;

import es.deusto.ingenieria.sd.auctions.client.controller.BidController;
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
		VentanaIniciarSesion ventanaIniciarSesion = new VentanaIniciarSesion(loginController);	
		BidController bidController = new BidController(serviceLocator);			
		
		//Login	
		

//		List<CategoryDTO> categories = bidWindow.getCategories();
//
//		List<ArticleDTO> articles = bidWindow.getArticles(categories.get(0).getName());
//
//		articles = bidWindow.getArticles(categories.get(0).getName());
		
//		loginController.logout();
	}
}