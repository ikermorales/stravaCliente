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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

import javax.swing.JTextField;

public class VentanaVerRetos extends JFrame {

	private JTextField textTitulo;
	private JTextField textDeporte;
	private JTextField textDescripcion;
	private JTextField textFechas;
	private JTextField textObjetivo;
	private ArrayList<RetoDTO> retosActuales;
	private RetoDTO retoAAnyadir;


	public VentanaVerRetos(UserDTO user, ErController erController, LoginController loginController, List<RetoDTO> retos, List<RetoDTO> retos2) {
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 300, 424);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Retos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 26));
		lblNewLabel.setBounds(10, 11, 268, 55);
		getContentPane().add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 95, 268, 35);
		getContentPane().add(comboBox);

		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 343, 124, 35);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new VentanaPrincipal(user, erController, loginController);
				dispose();

			}
		});

		JButton btnAceptarReto = new JButton("Aceptar Reto");
		btnAceptarReto.setBackground(Color.BLACK);
		btnAceptarReto.setForeground(Color.WHITE);
		btnAceptarReto.setBounds(154, 343, 124, 35);
		getContentPane().add(btnAceptarReto);
		btnAceptarReto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					UserDTO userNuevo;
					userNuevo = erController.aceptarReto(user, retoAAnyadir);
					new VentanaPrincipal(userNuevo, erController, loginController);
					dispose();
					for (RetoDTO retoDTO : userNuevo.getRetosAceptados()) {
						System.out.println("RETO --->" + retoDTO);
					}
					System.out.println("Termine");
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}

			}
		});

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 157, 268, 163);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Titulo: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 11, 73, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Deporte: ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 36, 73, 14);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Descripcion:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(10, 61, 73, 14);
		panel.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fechas: ");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setBounds(10, 111, 73, 14);
		panel.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Objetivo:");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 136, 73, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);

		textTitulo = new JTextField();
		textTitulo.setEnabled(false);
		textTitulo.setEditable(false);
		textTitulo.setBounds(100, 8, 158, 20);
		panel.add(textTitulo);
		textTitulo.setColumns(10);

		textDeporte = new JTextField();
		textDeporte.setEnabled(false);
		textDeporte.setEditable(false);
		textDeporte.setColumns(10);
		textDeporte.setBounds(100, 33, 158, 20);
		panel.add(textDeporte);

		textDescripcion = new JTextField();
		textDescripcion.setEnabled(false);
		textDescripcion.setEditable(false);
		textDescripcion.setColumns(10);
		textDescripcion.setBounds(100, 58, 158, 42);
		panel.add(textDescripcion);

		textFechas = new JTextField();
		textFechas.setEnabled(false);
		textFechas.setEditable(false);
		textFechas.setColumns(10);
		textFechas.setBounds(100, 108, 158, 20);
		panel.add(textFechas);

		textObjetivo = new JTextField();
		textObjetivo.setEnabled(false);
		textObjetivo.setEditable(false);
		textObjetivo.setColumns(10);
		textObjetivo.setBounds(100, 133, 158, 20);
		panel.add(textObjetivo);

		retosActuales = new ArrayList<>();

		for (RetoDTO reto : retos) {
			retosActuales.add(reto);		
		}
		for (RetoDTO reto : retos2) {
			retosActuales.add(reto);		
		}

		for (RetoDTO retoDTO : retosActuales) {
			comboBox.addItem(retoDTO.getTitulo() + " - " + retoDTO.getDeporte());
		}
		

		comboBox.setSelectedIndex(-1);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				RetoDTO reto = retosActuales.get(index);

				textDeporte.setText(reto.getDeporte());
				textDescripcion.setText(reto.getDescripcion());
				textFechas.setText(reto.getFechaInicio() + " - " + reto.getFechaFin());
				textObjetivo.setText(reto.getObjetivo()+"");
				textTitulo.setText(reto.getTitulo());

				retoAAnyadir = new RetoDTO();
				retoAAnyadir = reto;
				comboBox.setSelectedIndex(-1);
			}
		});

		setVisible(true);
	}
}

