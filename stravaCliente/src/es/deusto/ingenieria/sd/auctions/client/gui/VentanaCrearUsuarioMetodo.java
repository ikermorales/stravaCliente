package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import es.deusto.ingenieria.sd.auctions.client.controller.BidController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;

public class VentanaCrearUsuarioMetodo extends JFrame {

	public VentanaCrearUsuarioMetodo(LoginController loginController, BidController erController){
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 316, 279);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setBounds(10, 214, 65, 14);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaIniciarSesion(loginController, erController);
				dispose();
			}
		});
		btnNewButton.setBounds(98, 205, 106, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Metodo de creacion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 11, 258, 44);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearUsuarioEmail(loginController, erController);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("iconos/email.png"));
		btnNewButton_1.setBounds(10, 78, 89, 89);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearUsuarioConGoogle(loginController, erController);
				dispose();
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("iconos/google.png"));
		btnNewButton_1_1.setBounds(109, 78, 89, 89);
		getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearUsuarioFacebook(loginController, erController);
				dispose();
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon("iconos/facebook.png"));
		btnNewButton_1_1_1.setBounds(208, 78, 89, 89);
		getContentPane().add(btnNewButton_1_1_1);
		setVisible(true);
	}
}
