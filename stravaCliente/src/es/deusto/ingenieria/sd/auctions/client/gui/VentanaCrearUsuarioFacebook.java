package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoAceptadoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.TipoUsuarioDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

import javax.swing.*;

public class VentanaCrearUsuarioFacebook extends JFrame{

	private JTextField textNickName;
	private JTextField textEmail;

	public VentanaCrearUsuarioFacebook(LoginController loginController, ErController erController) {
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 290, 279);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		textNickName = new JTextField();
		textNickName.setToolTipText("");
		textNickName.setBounds(82, 103, 170, 20);
		getContentPane().add(textNickName);
		textNickName.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("nickname:");
		lblNewLabel_1.setBounds(10, 106, 65, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("email:");
		lblNewLabel_1_1.setBounds(10, 137, 65, 14);
		getContentPane().add(lblNewLabel_1_1);

		textEmail = new JTextField();
		textEmail.setToolTipText("");
		textEmail.setColumns(10);
		textEmail.setBounds(82, 134, 170, 20);
		getContentPane().add(textEmail);

		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setBounds(10, 214, 65, 14);
		getContentPane().add(lblNewLabel_1_2_1);

		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearUsuarioMetodo(loginController, erController);
				dispose();
			}
		});
		btnNewButton.setBounds(32, 213, 106, 23);
		getContentPane().add(btnNewButton);

		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(loginController.login(textEmail.getText(), "", textNickName.getText(), TipoUsuarioDTO.FACEBOOK )) { 
					UserDTO u = new UserDTO();
					u.setEmail(textEmail.getText());
					u.setNickname(textNickName.getText());
					List<EntrenamientoDTO> edto = new ArrayList<>();
					u.setEntrenamientos(edto);
					List<RetoAceptadoDTO> rdto = new ArrayList<>();
					u.setRetosAceptados(rdto);
					dispose();
					new VentanaPrincipal(u, erController);
				}
			}
		});
		btnCrear.setBounds(146, 213, 106, 23);
		getContentPane().add(btnCrear);

		JButton btnNewButton_1 = new JButton("datos extra");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaDatosExtra();

			}
		});
		btnNewButton_1.setBounds(146, 165, 106, 23);
		getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("iconos/facebook.png"));
		lblNewLabel_2.setBounds(110, 11, 65, 62);
		getContentPane().add(lblNewLabel_2);

		setVisible(true);
	}
}


