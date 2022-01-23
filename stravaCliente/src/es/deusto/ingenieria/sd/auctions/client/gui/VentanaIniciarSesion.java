package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoAceptadoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.TipoUsuarioDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class VentanaIniciarSesion extends JFrame {

	private JTextField emailtxt;
	private JPasswordField contrasenyatxt;


	public VentanaIniciarSesion(LoginController loginController, ErController erController) {
				
		getContentPane().setBackground(Color.BLACK);
		setBounds(100, 100, 300, 323);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setBounds(10, 175, 69, 14);
		getContentPane().add(lblEmail);
		
		emailtxt = new JTextField();
		emailtxt.setBackground(Color.WHITE);
		emailtxt.setBounds(81, 172, 197, 20);
		getContentPane().add(emailtxt);
		emailtxt.setColumns(10);
		
		JLabel lblContrasenya = new JLabel("Password:");
		lblContrasenya.setForeground(Color.WHITE);
		lblContrasenya.setBackground(Color.WHITE);
		lblContrasenya.setBounds(10, 207, 69, 14);
		getContentPane().add(lblContrasenya);
		
		contrasenyatxt = new JPasswordField();
		contrasenyatxt.setBackground(Color.WHITE);
		contrasenyatxt.setColumns(10);
		contrasenyatxt.setBounds(81, 204, 197, 20);
		getContentPane().add(contrasenyatxt);
		
		JButton btnVolver = new JButton("Iniciar sesion");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String contra = String.valueOf(contrasenyatxt.getPassword());
				try {
					if(loginController.getCheckedUsuario(emailtxt.getText(), contra).getNickname() != null) {
						new VentanaPrincipal(loginController.getCheckedUsuario(emailtxt.getText(), contra), erController, loginController);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Creendenciales incorrectas");
					}
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnVolver.setBackground(Color.WHITE);
		btnVolver.setBounds(10, 245, 132, 32);
		getContentPane().add(btnVolver);
		
		JButton btnCrearUsuario = new JButton("Crear usuario");
		btnCrearUsuario.setBackground(Color.WHITE);
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new VentanaCrearUsuarioMetodo(loginController, erController);
				dispose();
				
			}
		});
		btnCrearUsuario.setBounds(151, 245, 127, 32);
		getContentPane().add(btnCrearUsuario);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 288, 132);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setBounds(10, 0, 268, 64);
		panel.add(lblIcono);
		lblIcono.setForeground(Color.WHITE);
		lblIcono.setIcon(new ImageIcon("iconos/login.png"));
		lblIcono.setVerticalAlignment(SwingConstants.BOTTOM);
		lblIcono.setBackground(Color.WHITE);
		lblIcono.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcono.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("iconos/GOOGLE.png"));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(162, 72, 53, 49);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearUsuarioConGoogle(loginController, erController);
				dispose();
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("iconos/FACEBOOK.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearUsuarioFacebook(loginController, erController);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(225, 72, 53, 49);
		panel.add(btnNewButton_1);
		
		
		setVisible(true);		
	}


}
