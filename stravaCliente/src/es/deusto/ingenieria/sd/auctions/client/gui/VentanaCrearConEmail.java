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
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 316, 279);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setBounds(10, 214, 65, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(98, 205, 106, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Metodo de creacion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 11, 258, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\iker4\\git\\stravaCliente\\stravaCliente\\iconos\\email.png"));
		btnNewButton_1.setBounds(10, 78, 89, 89);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\iker4\\git\\stravaCliente\\stravaCliente\\iconos\\google.png"));
		btnNewButton_1_1.setBounds(109, 78, 89, 89);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\iker4\\git\\stravaCliente\\stravaCliente\\iconos\\facebook.png"));
		btnNewButton_1_1_1.setBounds(208, 78, 89, 89);
		frame.getContentPane().add(btnNewButton_1_1_1);
	}
}
