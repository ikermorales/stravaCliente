package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaCrearReto extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public VentanaCrearReto() {
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 270, 339);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 217, 40);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(26, 268, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal();
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnAnyadir = new JButton("A\u00F1adir");
		btnAnyadir.setBounds(138, 268, 89, 23);
		getContentPane().add(btnAnyadir);
		btnAnyadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Titulo: ");
		lblNewLabel_1.setBounds(10, 69, 48, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descripcion: ");
		lblNewLabel_1_1.setBounds(10, 99, 80, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Deporte:");
		lblNewLabel_2.setBounds(10, 130, 57, 14);
		getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"correr", "bici"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(100, 127, 148, 20);
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(100, 66, 148, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 96, 148, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 158, 148, 20);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha inicio: ");
		lblNewLabel_1_1_1.setBounds(10, 161, 80, 14);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fecha fin: ");
		lblNewLabel_1_1_1_1.setBounds(10, 189, 80, 14);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 186, 148, 20);
		getContentPane().add(textField_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(100, 218, 58, 20);
		getContentPane().add(spinner);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Objetivo: ");
		lblNewLabel_1_1_1_1_1.setBounds(10, 221, 74, 14);
		getContentPane().add(lblNewLabel_1_1_1_1_1);

		setVisible(true);

	}



}
