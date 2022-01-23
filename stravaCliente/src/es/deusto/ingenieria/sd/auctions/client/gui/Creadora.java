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
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class Creadora {

	private JFrame frame;
	private JTextField textTitulo;
	private JTextField textDeporte;
	private JTextField textDescripcion;
	private JTextField textFechas;
	private JTextField textObjetivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creadora window = new Creadora();
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
	public Creadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 300, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Retos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 26));
		lblNewLabel.setBounds(10, 11, 268, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 95, 268, 35);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 343, 124, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAceptarReto = new JButton("Aceptar Reto");
		btnAceptarReto.setBackground(Color.BLACK);
		btnAceptarReto.setForeground(Color.WHITE);
		btnAceptarReto.setBounds(154, 343, 124, 35);
		frame.getContentPane().add(btnAceptarReto);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 157, 268, 163);
		frame.getContentPane().add(panel);
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
	}
}
