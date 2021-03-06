package es.deusto.ingenieria.sd.auctions.client.gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.TipoUsuarioDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPerfil extends JFrame {

	
	private JTextField textField_email;
	private JTextField textField_user;

	public VentanaPerfil(UserDTO user, ErController erController, LoginController loginController) {
		
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 300, 390);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		
		JLabel lblicono = new JLabel("");
		String iconoPerfil = "iconos/" + user.getTipoUsuario() + "MAX.png";
		lblicono.setIcon(new ImageIcon(iconoPerfil));
		lblicono.setHorizontalAlignment(SwingConstants.CENTER);
		lblicono.setBounds(10, 11, 268, 121);
		getContentPane().add(lblicono);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 143, 268, 110);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_email = new JTextField();
		textField_email.setEditable(false);
		textField_email.setEnabled(false);
		textField_email.setBounds(59, 19, 199, 30);
		panel.add(textField_email);
		textField_email.setColumns(10);
		textField_email.setText(user.getEmail());
		
		textField_user = new JTextField();
		textField_user.setEnabled(false);
		textField_user.setEditable(false);
		textField_user.setColumns(10);
		textField_user.setBounds(59, 60, 199, 30);
		panel.add(textField_user);
		textField_user.setText(user.getNickname());
		
		JLabel lblNewLabel_email = new JLabel("Email: ");
		lblNewLabel_email.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_email.setBounds(10, 27, 48, 14);
		panel.add(lblNewLabel_email);
		
		JLabel lblNewLabel_user = new JLabel("User: ");
		lblNewLabel_user.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_user.setBounds(10, 68, 48, 14);
		panel.add(lblNewLabel_user);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(149, 264, 129, 30);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					loginController.logout();
				}catch (Exception e2) {
					// No pasa nada chill
				}
					
				dispose();
				new VentanaIniciarSesion(loginController, erController);
				
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(Color.WHITE);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal(user, erController, loginController);		
			}
		});
		btnVolver.setBounds(10, 264, 129, 30);
		getContentPane().add(btnVolver);
		
		JButton btnRetosAceptados = new JButton("Retos aceptados");
		btnRetosAceptados.setBounds(10, 305, 268, 44);
		btnRetosAceptados.setBackground(Color.BLACK);
		btnRetosAceptados.setForeground(Color.WHITE);
		getContentPane().add(btnRetosAceptados);
		btnRetosAceptados.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new VentanaRetosAceptados(user, erController, loginController);		
				dispose();
				
			}
		});
		
	}

}

