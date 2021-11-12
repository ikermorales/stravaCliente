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
		frame.setBounds(100, 100, 254, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos Extra");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 217, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(25, 268, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAnyadir = new JButton("A\u00F1adir");
		btnAnyadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnyadir.setBounds(124, 268, 89, 23);
		frame.getContentPane().add(btnAnyadir);
		
		JSpinner spinner = new JSpinner();
		spinner.setEnabled(false);
		spinner.setBounds(177, 96, 50, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Altura (cm): ");
		lblNewLabel_2_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_2.setBounds(10, 99, 157, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Peso (kg): ");
		lblNewLabel_2_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_1_2.setBounds(10, 130, 157, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_2);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setEnabled(false);
		spinner_1.setBounds(177, 127, 50, 20);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setEnabled(false);
		spinner_1_1.setBounds(177, 158, 50, 20);
		frame.getContentPane().add(spinner_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Frecuencia cardiaca maxima: ");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1.setBounds(10, 161, 157, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Frecuencia cardiaca reposo:  ");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_1.setBounds(10, 192, 157, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setEnabled(false);
		spinner_1_1_1.setBounds(177, 189, 50, 20);
		frame.getContentPane().add(spinner_1_1_1);
		
		JSpinner spinner_1_1_1_1 = new JSpinner();
		spinner_1_1_1_1.setEnabled(false);
		spinner_1_1_1_1.setBounds(177, 220, 50, 20);
		frame.getContentPane().add(spinner_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("RPM:  ");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_1_1.setBounds(10, 223, 157, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);
	}
}
