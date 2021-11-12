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

public class VentanaCrearConEmail {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

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
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 293, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\iker4\\git\\stravaCliente\\stravaCliente\\iconos\\perfil.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 27));
		lblNewLabel.setBounds(10, 11, 261, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 108, 65, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email: ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 133, 65, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1_1_1.setBounds(10, 158, 89, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 130, 238));
		panel.setBorder(new LineBorder(new Color(238, 130, 238), 1, true));
		panel.setBounds(10, 183, 261, 178);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setEnabled(false);
		spinner.setBounds(177, 20, 50, 20);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setEnabled(false);
		spinner_1.setBounds(177, 51, 50, 20);
		panel.add(spinner_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setEnabled(false);
		spinner_1_1.setBounds(177, 82, 50, 20);
		panel.add(spinner_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Frecuencia cardiaca reposo:  ");
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
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Frecuencia cardiaca maxima: ");
		lblNewLabel_2_1_1.setBounds(14, 85, 157, 14);
		panel.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("RPM:  ");
		lblNewLabel_2_1_1_1_1.setBounds(14, 147, 157, 14);
		panel.add(lblNewLabel_2_1_1_1_1);
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setEnabled(false);
		spinner_1_1_1.setBounds(177, 113, 50, 20);
		panel.add(spinner_1_1_1);
		
		JSpinner spinner_1_1_1_1 = new JSpinner();
		spinner_1_1_1_1.setEnabled(false);
		spinner_1_1_1_1.setBounds(177, 144, 50, 20);
		panel.add(spinner_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(85, 130, 186, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(85, 105, 186, 20);
		frame.getContentPane().add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setEnabled(false);
		passwordField.setBounds(85, 155, 186, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(35, 372, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setBounds(159, 372, 89, 23);
		frame.getContentPane().add(btnEditar);
	}
}
