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
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class Creadora {

	private JFrame frame;
	private JTextField textNickname;
	private JTextField textEmail;
	private JPasswordField passwordField;

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
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\iker4\\git\\stravaCliente\\stravaCliente\\iconos\\GOOGLEMAX.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 26));
		lblNewLabel.setBounds(10, 11, 268, 81);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 219, 124, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBackground(Color.BLACK);
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setBounds(154, 219, 124, 35);
		frame.getContentPane().add(btnRegistrarse);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 103, 268, 86);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nickname:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 11, 73, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 36, 73, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(10, 61, 73, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textNickname = new JTextField();
		textNickname.setBounds(100, 8, 158, 20);
		panel.add(textNickname);
		textNickname.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(100, 33, 158, 20);
		panel.add(textEmail);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 58, 158, 20);
		panel.add(passwordField);
	}
}
