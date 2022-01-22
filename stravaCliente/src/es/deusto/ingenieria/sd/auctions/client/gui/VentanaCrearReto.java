package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.*;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class VentanaCrearReto extends JFrame {
	
	private JTextField titulotxt;
	private JTextField descripciontxt;
	private JTextField fechainiciotxt;
	private JTextField fechafintxt;

	public VentanaCrearReto(UserDTO user, ErController erController, LoginController loginController) {
	
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 300, 361);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblCrearReto = new JLabel("Crear Reto");
		lblCrearReto.setBackground(Color.WHITE);
		lblCrearReto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearReto.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblCrearReto.setBounds(10, 11, 268, 56);
		getContentPane().add(lblCrearReto);
		
		JLabel lblTitulo = new JLabel("Titulo: ");
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setBounds(10, 90, 69, 14);
		getContentPane().add(lblTitulo);
		
		titulotxt = new JTextField();
		titulotxt.setBounds(81, 87, 197, 20);
		getContentPane().add(titulotxt);
		titulotxt.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBackground(Color.WHITE);
		lblDescripcion.setBounds(10, 118, 69, 14);
		getContentPane().add(lblDescripcion);
		
		descripciontxt = new JTextField();
		descripciontxt.setColumns(10);
		descripciontxt.setBounds(81, 115, 197, 20);
		getContentPane().add(descripciontxt);
		
		JComboBox comboBoxDeporte = new JComboBox();
		comboBoxDeporte.setModel(new DefaultComboBoxModel(new String[] {"bici", "correr"}));
		comboBoxDeporte.setBounds(81, 146, 197, 22);
		getContentPane().add(comboBoxDeporte);
		
		JLabel lblDeporte = new JLabel("Deporte: ");
		lblDeporte.setBackground(Color.WHITE);
		lblDeporte.setBounds(10, 150, 69, 14);
		getContentPane().add(lblDeporte);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio:");
		lblFechaInicio.setBackground(Color.WHITE);
		lblFechaInicio.setBounds(10, 181, 69, 14);
		getContentPane().add(lblFechaInicio);
		
		fechainiciotxt = new JTextField();
		fechainiciotxt.setToolTipText("dd/MM/yyyy");
		fechainiciotxt.setColumns(10);
		fechainiciotxt.setBounds(81, 178, 197, 20);
		getContentPane().add(fechainiciotxt);
		
		JLabel lblFechaFin = new JLabel("Fecha Fin:");
		lblFechaFin.setBackground(Color.WHITE);
		lblFechaFin.setBounds(10, 209, 69, 14);
		getContentPane().add(lblFechaFin);
		
		fechafintxt = new JTextField();
		fechafintxt.setToolTipText("dd/MM/yyyy");
		fechafintxt.setColumns(10);
		fechafintxt.setBounds(81, 206, 197, 20);
		getContentPane().add(fechafintxt);
		
		JSpinner spinnerObjetivo = new JSpinner();
		spinnerObjetivo.setBounds(81, 237, 69, 20);
		getContentPane().add(spinnerObjetivo);
		
		JLabel lblObjetivo = new JLabel("Objetivo:");
		lblObjetivo.setBackground(Color.WHITE);
		lblObjetivo.setBounds(10, 240, 69, 14);
		getContentPane().add(lblObjetivo);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal(user, erController, loginController);
			}
		});
		btnVolver.setBounds(29, 284, 105, 32);
		getContentPane().add(btnVolver);
		
		JButton btnAnyadir = new JButton("A\u00F1adir");
		btnAnyadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new VentanaPrincipal(user, erController, loginController);	
				try {
					int a = (int) spinnerObjetivo.getValue();
					erController.crearReto(user, (String) comboBoxDeporte.getSelectedItem(), titulotxt.getText(), descripciontxt.getText(), fechainiciotxt.getText(), fechafintxt.getText(), a);
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAnyadir.setBounds(155, 284, 105, 32);
		getContentPane().add(btnAnyadir);
		
		
		setLocationRelativeTo(null);

		setVisible(true);
		
		
		setVisible(true);

	}



}
