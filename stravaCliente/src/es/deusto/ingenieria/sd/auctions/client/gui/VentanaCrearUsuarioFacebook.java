package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.TipoUsuarioDTO;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class VentanaCrearUsuarioFacebook extends JFrame {

	private JTextField textNickname;
	private JTextField textEmail;
	private JPasswordField passwordField;

	public VentanaCrearUsuarioFacebook(LoginController loginController, ErController erController) {

		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("iconos/FACEBOOKMAX.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 26));
		lblNewLabel.setBounds(10, 11, 268, 81);
		getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearUsuarioMetodo(loginController, erController);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 219, 124, 35);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaCrearUsuarioMetodo(loginController, erController);
			}
		});

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBackground(Color.BLACK);
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setBounds(154, 219, 124, 35);
		getContentPane().add(btnRegistrarse);
		btnRegistrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					loginController.crearUsuario(TipoUsuarioDTO.FACEBOOK, textEmail.getText(), textNickname.getText(), passwordField.getText(), 0, 0, 0, 0, 0);
					dispose();
					new VentanaIniciarSesion(loginController, erController);
				} catch (RemoteException e1) {

					e1.printStackTrace();
				}
				
			}
		});

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 103, 268, 86);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Nickname:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 11, 73, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 36, 73, 14);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Password:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(10, 61, 73, 14);
		panel.add(lblNewLabel_1_1_1);

		textNickname = new JTextField();
		textNickname.setBounds(100, 8, 158, 20);
		panel.add(textNickname);
		textNickname.setColumns(10);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(100, 33, 158, 20);
		panel.add(textEmail);

		passwordField = new JPasswordField();
		passwordField.setBounds(100, 58, 158, 20);
		panel.add(passwordField);
		
		setVisible(true);
	}
}

