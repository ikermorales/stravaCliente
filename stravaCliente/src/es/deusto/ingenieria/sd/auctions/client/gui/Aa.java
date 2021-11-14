package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class Aa {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aa window = new Aa();
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
	public Aa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 305, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear Entrenamiento");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 273, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(45, 303, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(157, 303, 89, 23);
		frame.getContentPane().add(btnCrear);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo:");
		lblNewLabel_1.setBounds(10, 79, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(68, 76, 215, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Deporte:");
		lblNewLabel_1_1.setBounds(10, 112, 61, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"bici", "correr"}));
		comboBox.setBounds(68, 108, 111, 22);
		frame.getContentPane().add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(68, 143, 111, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Duracion:");
		lblNewLabel_1_1_1.setBounds(10, 146, 61, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(68, 174, 111, 20);
		frame.getContentPane().add(spinner_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Distancia:");
		lblNewLabel_1_1_1_1.setBounds(10, 177, 61, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 207, 215, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("FechaIni");
		lblNewLabel_1_2.setBounds(10, 210, 48, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(68, 244, 215, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("HoraIni");
		lblNewLabel_1_2_1.setBounds(10, 247, 48, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1);
	}
}
