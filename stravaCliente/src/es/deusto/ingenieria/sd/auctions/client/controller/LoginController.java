package es.deusto.ingenieria.sd.auctions.client.controller;

import java.rmi.RemoteException;  

import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.TipoUsuarioDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;


public class LoginController {	

	private ServiceLocator serviceLocator;
	private long token = -1; //-1 = login has not been done or fails



	public LoginController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}

	public boolean login(String email, String password, String nickName, TipoUsuarioDTO tipoUsuario) {
		try {
			this.token = this.serviceLocator.getService().login(email, password, nickName, tipoUsuario);			
			return true;
		} catch (RemoteException e) {
			System.out.println("# Error during login: " + e);
			this.token = -1;
			return false;
		}
	}

	public void logout() {
		try {
			this.serviceLocator.getService().logout(this.token);
			this.token = -1;
		} catch (RemoteException e) {
			System.out.println("# Error during logout: " + e);
		}
	}


	public long getToken() {
		return token;
	}
	
	public UserDTO getCheckedUsuario(String email, String password) throws RemoteException {
		return this.serviceLocator.getService().getCheckedUsuario(email, password);

	}





}