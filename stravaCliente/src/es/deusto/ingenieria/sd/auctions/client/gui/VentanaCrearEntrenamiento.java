package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;

import es.deusto.ingenieria.sd.auctions.client.controller.BidController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class VentanaCrearEntrenamiento extends JFrame {
	
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JSpinner spinner;
	private JSpinner spinner_1;
	
	public VentanaCrearEntrenamiento(UserDTO user, BidController erEntrenamientos) {
		
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 305, 372);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear Entrenamiento");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 273, 41);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal(user, erEntrenamientos);			
			}
		});
		btnNewButton.setBounds(45, 303, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<EntrenamientoDTO> entrenosNuevos = new ArrayList<>();
				
				for (EntrenamientoDTO entrenamientoDTO : user.getEntrenamientos()) {
					entrenosNuevos.add(entrenamientoDTO);
				}
				
				EntrenamientoDTO dto = new EntrenamientoDTO();
				
				dto.setDeporte((String) comboBox.getSelectedItem());
				dto.setTitulo(textField.getText());
				dto.setFechaIni(textField_1.getText());
				
				try {
					int a = (int) spinner_1.getValue();
					float b = (float) a;
					dto.setDistancia(b);
					dto.setHoraIni(Long.parseLong(textField_2.getText()));
					int c = (int) spinner.getValue();
					long d = (long) c;
					dto.setDuracion(c);
				} catch (Exception e2) {
					
				}
				
				entrenosNuevos.add(dto);
				user.setEntrenamientos(entrenosNuevos);
				
				
				dispose();
				new VentanaPrincipal(user, erEntrenamientos);
				
			}
		});
		btnCrear.setBounds(157, 303, 89, 23);
		getContentPane().add(btnCrear);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo:");
		lblNewLabel_1.setBounds(10, 79, 48, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(68, 76, 215, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Deporte:");
		lblNewLabel_1_1.setBounds(10, 112, 61, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"bici", "correr"}));
		comboBox.setBounds(68, 108, 111, 22);
		getContentPane().add(comboBox);
		
		spinner = new JSpinner();
		spinner.setBounds(68, 143, 111, 20);
		getContentPane().add(spinner);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Duracion:");
		lblNewLabel_1_1_1.setBounds(10, 146, 61, 14);
		getContentPane().add(lblNewLabel_1_1_1);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(68, 174, 111, 20);
		getContentPane().add(spinner_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Distancia:");
		lblNewLabel_1_1_1_1.setBounds(10, 177, 61, 14);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 207, 215, 20);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("FechaIni");
		lblNewLabel_1_2.setBounds(10, 210, 48, 14);
		getContentPane().add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(68, 244, 215, 20);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("HoraIni");
		lblNewLabel_1_2_1.setBounds(10, 247, 48, 14);
		getContentPane().add(lblNewLabel_1_2_1);


		setVisible(true);

	}
}
