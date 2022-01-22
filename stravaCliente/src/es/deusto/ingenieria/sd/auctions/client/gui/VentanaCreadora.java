package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCreadora {

	private JFrame frame;
	private JTextField textField_email;
	private JTextField textField_user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCreadora window = new VentanaCreadora();
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
	public VentanaCreadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 300, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblicono = new JLabel("");
		lblicono.setIcon(new ImageIcon("C:\\Users\\iker4\\git\\stravaCliente\\stravaCliente\\iconos\\GOOGLEMAX.png"));
		lblicono.setHorizontalAlignment(SwingConstants.CENTER);
		lblicono.setBounds(10, 11, 268, 121);
		frame.getContentPane().add(lblicono);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 143, 268, 110);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_email = new JTextField();
		textField_email.setEditable(false);
		textField_email.setEnabled(false);
		textField_email.setBounds(59, 19, 199, 30);
		panel.add(textField_email);
		textField_email.setColumns(10);
		
		textField_user = new JTextField();
		textField_user.setEnabled(false);
		textField_user.setEditable(false);
		textField_user.setColumns(10);
		textField_user.setBounds(59, 60, 199, 30);
		panel.add(textField_user);
		
		JLabel lblNewLabel_email = new JLabel("Email: ");
		lblNewLabel_email.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_email.setBounds(10, 27, 48, 14);
		panel.add(lblNewLabel_email);
		
		JLabel lblNewLabel_user = new JLabel("User: ");
		lblNewLabel_user.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_user.setBounds(10, 68, 48, 14);
		panel.add(lblNewLabel_user);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(149, 264, 129, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(Color.WHITE);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolver.setBounds(10, 264, 129, 30);
		frame.getContentPane().add(btnVolver);
		
		JButton btnRetosAceptados = new JButton("Retos aceptados");
		btnRetosAceptados.setBackground(Color.BLACK);
		btnRetosAceptados.setForeground(Color.WHITE);
		btnRetosAceptados.setBounds(10, 305, 268, 44);
		frame.getContentPane().add(btnRetosAceptados);
	}
}
