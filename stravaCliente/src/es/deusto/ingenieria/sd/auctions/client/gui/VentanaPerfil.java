package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;

import javax.swing.*;
import javax.swing.border.LineBorder;

import es.deusto.ingenieria.sd.auctions.client.controller.BidController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class VentanaPerfil extends JFrame{

	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private static int contador = 0;

	
	
	public VentanaPerfil(UserDTO user, BidController erController) {
		
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 293, 287);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("iconos/perfil.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 27));
		lblNewLabel.setBounds(10, 11, 261, 71);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 108, 65, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 133, 65, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(85, 130, 186, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(85, 105, 186, 20);
		getContentPane().add(textField_2);

		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(96, 218, 89, 23);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal(user, erController);			
			}
		});
		

		JButton btnVerRetos = new JButton("Ver Retos Aceptados");
		btnVerRetos.setForeground(Color.BLACK);
		btnVerRetos.setBackground(Color.WHITE);
		btnVerRetos.setBounds(10, 161, 261, 35);
		getContentPane().add(btnVerRetos);
		btnVerRetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaRetosAceptados(user, erController);			
			}
		});
		
		
		setVisible(true);
	}
}
