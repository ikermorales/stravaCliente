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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class VentanaCreador {

	private JFrame frame;
	private JTextField emailtxt;
	private JTextField Contrasenyatxt;

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
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 300, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setBounds(10, 175, 69, 14);
		frame.getContentPane().add(lblEmail);
		
		emailtxt = new JTextField();
		emailtxt.setBackground(Color.WHITE);
		emailtxt.setBounds(81, 172, 197, 20);
		frame.getContentPane().add(emailtxt);
		emailtxt.setColumns(10);
		
		JLabel lblContrasenya = new JLabel("Contrase\u00F1a:");
		lblContrasenya.setForeground(Color.WHITE);
		lblContrasenya.setBackground(Color.WHITE);
		lblContrasenya.setBounds(10, 207, 69, 14);
		frame.getContentPane().add(lblContrasenya);
		
		Contrasenyatxt = new JTextField();
		Contrasenyatxt.setBackground(Color.WHITE);
		Contrasenyatxt.setColumns(10);
		Contrasenyatxt.setBounds(81, 204, 197, 20);
		frame.getContentPane().add(Contrasenyatxt);
		
		JButton btnVolver = new JButton("Iniciar sesion");
		btnVolver.setBackground(Color.WHITE);
		btnVolver.setBounds(37, 245, 105, 32);
		frame.getContentPane().add(btnVolver);
		
		JButton btnCrearUsuario = new JButton("Crear usuario");
		btnCrearUsuario.setBackground(Color.WHITE);
		btnCrearUsuario.setHorizontalAlignment(SwingConstants.LEADING);
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearUsuario.setBounds(157, 245, 105, 32);
		frame.getContentPane().add(btnCrearUsuario);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 288, 132);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setBounds(10, 11, 268, 64);
		panel.add(lblIcono);
		lblIcono.setForeground(Color.WHITE);
		lblIcono.setIcon(new ImageIcon("C:\\Users\\iker4\\git\\stravaCliente\\stravaCliente\\iconos\\login.png"));
		lblIcono.setVerticalAlignment(SwingConstants.BOTTOM);
		lblIcono.setBackground(Color.WHITE);
		lblIcono.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcono.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\iker4\\git\\stravaCliente\\stravaCliente\\iconos\\googleBW.png"));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(178, 80, 45, 41);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\iker4\\git\\stravaCliente\\stravaCliente\\iconos\\facebookBW.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(233, 80, 45, 41);
		panel.add(btnNewButton_1);
	}
}
