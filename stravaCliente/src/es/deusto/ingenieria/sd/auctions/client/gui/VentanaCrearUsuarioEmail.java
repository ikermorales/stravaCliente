package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;

public class VentanaCrearUsuarioEmail extends JFrame {

	private JTextField textNickName;
	private JTextField textEmail;
	private JTextField textContrasenya;
	
	public VentanaCrearUsuarioEmail(LoginController loginController) {
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 290, 302);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear Usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 258, 34);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		textNickName = new JTextField();
		textNickName.setToolTipText("");
		textNickName.setBounds(82, 84, 170, 20);
		getContentPane().add(textNickName);
		textNickName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("nickname:");
		lblNewLabel_1.setBounds(10, 87, 65, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("email:");
		lblNewLabel_1_1.setBounds(10, 118, 65, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		textEmail = new JTextField();
		textEmail.setToolTipText("");
		textEmail.setColumns(10);
		textEmail.setBounds(82, 115, 170, 20);
		getContentPane().add(textEmail);
		
		JLabel lblNewLabel_1_2 = new JLabel("contrase\u00F1a:");
		lblNewLabel_1_2.setBounds(10, 146, 65, 14);
		getContentPane().add(lblNewLabel_1_2);
		
		textContrasenya = new JTextField();
		textContrasenya.setToolTipText("");
		textContrasenya.setColumns(10);
		textContrasenya.setBounds(82, 143, 170, 20);
		getContentPane().add(textContrasenya);
		
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
		btnNewButton.setBounds(30, 214, 106, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrear.setBounds(146, 214, 106, 23);
		getContentPane().add(btnCrear);
		
		JButton btnNewButton_1 = new JButton("datos extra");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaDatosExtra();
			}
		});
		btnNewButton_1.setBounds(165, 169, 87, 23);
		getContentPane().add(btnNewButton_1);
		
		setVisible(true);
	}
}
