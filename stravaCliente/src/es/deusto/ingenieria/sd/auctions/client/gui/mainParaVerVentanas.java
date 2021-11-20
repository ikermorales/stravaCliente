package es.deusto.ingenieria.sd.auctions.client.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoAceptadoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class mainParaVerVentanas {
	
	public static void calcularEstados(String fechaIni, String fechaFin, int r, String iniEntren, int duracion ,float distancia) {
		float resultado = 0;		

			try {
				String retoIni = fechaIni;
				Date df = new SimpleDateFormat("dd/MM/yyyy").parse(retoIni);

				String retoFin = fechaFin;
				Date df1 = new SimpleDateFormat("dd/MM/yyyy").parse(retoFin);

				String entrenIni = iniEntren;
				Date df2 = new SimpleDateFormat("dd/MM/yyyy").parse(entrenIni);

				JOptionPane.showMessageDialog(null, df2.after(df));

				try {
					Date df3 = addHoursToJavaUtilDate(df2, duracion);
					

					if(df2.after(df) && df3.before(df1)) {


						float cuantoHaHecho = distancia;
						// r ---> 100
						// d ---> x
						resultado = ((cuantoHaHecho * 100) / r);			
					} else {
						resultado = (float) 0.0;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			} catch (ParseException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Hubo un probelma con las fechas.");
			}
			System.out.println( "resultado: " + resultado);

		}	



	public static Date addHoursToJavaUtilDate(Date date, int hours) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, hours);
		return calendar.getTime();
	}



	public static void main(String[] args) {
		
		//new VentanaIniciarSesion();
		//new VentanaPrincipal();
		//new VentanaPerfil();
		//new VentanaCrearReto();
		//new VentanaCrearEntrenamiento();
		//new VentanaCrearUsuarioEmail();
		//new VentanaCrearUsuarioConGoogle();
		//new VentanaCrearUsuarioMetodo();
		
		calcularEstados("22/10/2021", "22/12/2021", 300, "19/12/2021", 48, 100);
		

	}

}
