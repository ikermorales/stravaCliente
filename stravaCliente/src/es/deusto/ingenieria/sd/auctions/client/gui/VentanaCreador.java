package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class VentanaCreador {

	private JFrame frame;
	private JTextField titulotxt;
	private JTextField descripciontxt;
	private JTextField fechainiciotxt;
	private JTextField fechafintxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCreador window = new VentanaCreador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaCreador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 300, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCrearReto = new JLabel("Crear Reto");
		lblCrearReto.setBackground(Color.WHITE);
		lblCrearReto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearReto.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblCrearReto.setBounds(10, 11, 268, 56);
		frame.getContentPane().add(lblCrearReto);
		
		JLabel lblTitulo = new JLabel("Titulo: ");
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setBounds(10, 90, 69, 14);
		frame.getContentPane().add(lblTitulo);
		
		titulotxt = new JTextField();
		titulotxt.setBounds(81, 87, 197, 20);
		frame.getContentPane().add(titulotxt);
		titulotxt.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBackground(Color.WHITE);
		lblDescripcion.setBounds(10, 118, 69, 14);
		frame.getContentPane().add(lblDescripcion);
		
		descripciontxt = new JTextField();
		descripciontxt.setColumns(10);
		descripciontxt.setBounds(81, 115, 197, 20);
		frame.getContentPane().add(descripciontxt);
		
		JComboBox comboBoxDeporte = new JComboBox();
		comboBoxDeporte.setModel(new DefaultComboBoxModel(new String[] {"bici", "correr"}));
		comboBoxDeporte.setBounds(81, 146, 197, 22);
		frame.getContentPane().add(comboBoxDeporte);
		
		JLabel lblDeporte = new JLabel("Deporte: ");
		lblDeporte.setBackground(Color.WHITE);
		lblDeporte.setBounds(10, 150, 69, 14);
		frame.getContentPane().add(lblDeporte);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio:");
		lblFechaInicio.setBackground(Color.WHITE);
		lblFechaInicio.setBounds(10, 181, 69, 14);
		frame.getContentPane().add(lblFechaInicio);
		
		fechainiciotxt = new JTextField();
		fechainiciotxt.setToolTipText("dd/MM/yyyy");
		fechainiciotxt.setColumns(10);
		fechainiciotxt.setBounds(81, 178, 197, 20);
		frame.getContentPane().add(fechainiciotxt);
		
		JLabel lblFechaFin = new JLabel("Fecha Fin:");
		lblFechaFin.setBackground(Color.WHITE);
		lblFechaFin.setBounds(10, 209, 69, 14);
		frame.getContentPane().add(lblFechaFin);
		
		fechafintxt = new JTextField();
		fechafintxt.setToolTipText("dd/MM/yyyy");
		fechafintxt.setColumns(10);
		fechafintxt.setBounds(81, 206, 197, 20);
		frame.getContentPane().add(fechafintxt);
		
		JSpinner spinnerObjetivo = new JSpinner();
		spinnerObjetivo.setBounds(81, 237, 69, 20);
		frame.getContentPane().add(spinnerObjetivo);
		
		JLabel lblObjetivo = new JLabel("Objetivo:");
		lblObjetivo.setBackground(Color.WHITE);
		lblObjetivo.setBounds(10, 240, 69, 14);
		frame.getContentPane().add(lblObjetivo);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(29, 284, 105, 32);
		frame.getContentPane().add(btnVolver);
		
		JButton btnAnyadir = new JButton("A\u00F1adir");
		btnAnyadir.setBounds(155, 284, 105, 32);
		frame.getContentPane().add(btnAnyadir);
	}
}
