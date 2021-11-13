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
		setBounds(100, 100, 293, 449);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 183, 261, 178);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextField spinner = new JTextField();
		spinner.setEnabled(false);
		spinner.setBounds(177, 20, 50, 20);
		panel.add(spinner);
		
		JTextField spinner_1 = new JTextField();
		spinner_1.setEnabled(false);
		spinner_1.setBounds(177, 51, 50, 20);
		panel.add(spinner_1);
		
		JTextField spinner_1_1 = new JTextField();
		spinner_1_1.setEnabled(false);
		spinner_1_1.setBounds(177, 82, 50, 20);
		panel.add(spinner_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Frecuencia en reposo:  ");
		lblNewLabel_2_1_1_1.setBounds(14, 116, 157, 14);
		panel.add(lblNewLabel_2_1_1_1);
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Peso (kg): ");
		lblNewLabel_2_1_1_1_2.setBounds(10, 54, 157, 14);
		panel.add(lblNewLabel_2_1_1_1_2);
		lblNewLabel_2_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1_1_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Altura (cm): ");
		lblNewLabel_2_1_1_2.setBounds(14, 23, 157, 14);
		panel.add(lblNewLabel_2_1_1_2);
		lblNewLabel_2_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Frecuencia cardiaca max: ");
		lblNewLabel_2_1_1.setBounds(14, 85, 157, 14);
		panel.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("RPM:  ");
		lblNewLabel_2_1_1_1_1.setBounds(14, 147, 157, 14);
		panel.add(lblNewLabel_2_1_1_1_1);
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		
		JTextField spinner_1_1_1 = new JTextField();
		spinner_1_1_1.setEnabled(false);
		spinner_1_1_1.setBounds(177, 113, 50, 20);
		panel.add(spinner_1_1_1);
		
		JTextField spinner_1_1_1_1 = new JTextField();
		spinner_1_1_1_1.setEnabled(false);
		spinner_1_1_1_1.setBounds(177, 144, 50, 20);
		panel.add(spinner_1_1_1_1);
		
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaPrincipal(user, erController);
				dispose();
			}
		});
		btnNewButton.setBounds(35, 372, 89, 23);
		getContentPane().add(btnNewButton);
		

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador = contador + 1;
				if(contador % 2 != 0) {
					textField_1.setEnabled(true);
					textField_2.setEnabled(true);
					spinner.setEnabled(true);
					spinner.setEnabled(true);
					spinner_1.setEnabled(true);
					spinner_1_1.setEnabled(true);
					spinner_1_1_1.setEnabled(true);
					spinner_1_1_1_1.setEnabled(true);
					btnEditar.setLabel("Guardar");
				} else {
					textField_1.setEnabled(false);
					textField_2.setEnabled(false);
					spinner.setEnabled(false);
					spinner.setEnabled(false);
					spinner_1.setEnabled(false);
					spinner_1_1.setEnabled(false);
					spinner_1_1_1.setEnabled(false);
					spinner_1_1_1_1.setEnabled(false);
					btnEditar.setLabel("Editar");
				}
				}
		});
		btnEditar.setBounds(159, 372, 89, 23);
		getContentPane().add(btnEditar);

		
		
		
		
		setVisible(true);
	}
}
