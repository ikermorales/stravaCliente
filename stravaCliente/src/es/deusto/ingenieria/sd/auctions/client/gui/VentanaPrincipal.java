package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class VentanaPrincipal extends JFrame {	
	
	public VentanaPrincipal(UserDTO user, ErController erController, LoginController loginController) {
		
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 394, 231);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setBounds(10, 214, 65, 14);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JButton btnPerfil = new JButton("");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaPerfil(user, erController, loginController);
				dispose();
			}
		});
		btnPerfil.setBackground(new Color(255, 255, 255));
		String iconoPerfil = "iconos/" + user.getTipoUsuario()+ ".png";
		btnPerfil.setIcon(new ImageIcon(iconoPerfil));
		btnPerfil.setBounds(330, 11, 40, 39);
		getContentPane().add(btnPerfil);
		
		JLabel lblNewLabel = new JLabel("STRAVA - " + user.getNickname());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 27));
		lblNewLabel.setBounds(10, 11, 360, 37);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Crear entrenamiento");
		btnNewButton.setBounds(10, 97, 175, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearEntrenamiento(user, erController, loginController);
				dispose();
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnVerEntrenamiento = new JButton("Ver entrenamiento");
		btnVerEntrenamiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaVerEntrenamientos(user, erController, loginController);
				dispose();
			}
		});
		btnVerEntrenamiento.setBounds(10, 142, 175, 34);
		getContentPane().add(btnVerEntrenamiento);
		
		JButton btnCrearReto = new JButton("Crear reto");
		btnCrearReto.setBounds(195, 97, 175, 34);
		btnCrearReto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearReto(user, erController, loginController);
				dispose();
			}
		});
		getContentPane().add(btnCrearReto);
		
		JButton btnVerRetos = new JButton("Ver retos");
		btnVerRetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaVerRetos(user, erController, loginController, erController.getRetos("bici"), erController.getRetos("correr"));
				dispose();
			}
		});
		btnVerRetos.setBounds(195, 142, 175, 34);
		getContentPane().add(btnVerRetos);
		
		setVisible(true);
	}
	
	
}
