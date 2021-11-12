package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;

public class VentanaCrearConEmail {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCrearConEmail window = new VentanaCrearConEmail();
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
	public VentanaCrearConEmail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 270, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrenamiento");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 238, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(26, 268, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAnyadir = new JButton("A\u00F1adir");
		btnAnyadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnyadir.setBounds(138, 268, 89, 23);
		frame.getContentPane().add(btnAnyadir);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo: ");
		lblNewLabel_1.setBounds(10, 69, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Deporte:");
		lblNewLabel_2.setBounds(10, 97, 57, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"correr", "bici"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(100, 94, 148, 20);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(100, 66, 148, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 150, 148, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha inicio: ");
		lblNewLabel_1_1_1.setBounds(10, 153, 80, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fecha fin: ");
		lblNewLabel_1_1_1_1.setBounds(10, 184, 80, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 181, 148, 20);
		frame.getContentPane().add(textField_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(100, 209, 58, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Duracion: ");
		lblNewLabel_1_1_1_1_1.setBounds(10, 212, 74, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Distancia: ");
		lblNewLabel_1_1_1_2.setBounds(10, 125, 80, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 122, 148, 20);
		frame.getContentPane().add(textField_1);
	}
}
