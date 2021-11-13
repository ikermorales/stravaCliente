package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;

public class VentanaCrearUsuarioConGoogle extends JFrame {

	private JTextField textNickName;
	private JTextField textEmail;
	
	public VentanaCrearUsuarioConGoogle(LoginController loginController) {
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 290, 279);
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
				new VentanaCrearUsuarioMetodo(loginController);
				dispose();
			}
		});
		btnNewButton.setBounds(32, 213, 106, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		lblNewLabel_2.setIcon(new ImageIcon("iconos/google.png"));
		lblNewLabel_2.setBounds(110, 11, 65, 62);
		getContentPane().add(lblNewLabel_2);
		
		setVisible(true);
	}
}

