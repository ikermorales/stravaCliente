package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class VentanaDatosExtra extends JFrame {

	public VentanaDatosExtra(){
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 254, 339);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos Extra");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 217, 71);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(25, 268, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnAnyadir = new JButton("A\u00F1adir");
		btnAnyadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnyadir.setBounds(124, 268, 89, 23);
		getContentPane().add(btnAnyadir);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(177, 96, 50, 20);
		getContentPane().add(spinner);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Altura (cm): ");
		lblNewLabel_2_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_2.setBounds(10, 99, 157, 14);
		getContentPane().add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Peso (kg): ");
		lblNewLabel_2_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_1_2.setBounds(10, 130, 157, 14);
		getContentPane().add(lblNewLabel_2_1_1_1_2);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(177, 127, 50, 20);
		getContentPane().add(spinner_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(177, 158, 50, 20);
		getContentPane().add(spinner_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Frecuencia cardiaca max: ");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1.setBounds(10, 161, 157, 14);
		getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Frecuencia en reposo:  ");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_1.setBounds(10, 192, 157, 14);
		getContentPane().add(lblNewLabel_2_1_1_1);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setBounds(177, 189, 50, 20);
		getContentPane().add(spinner_1_1_1);
		
		JSpinner spinner_1_1_1_1 = new JSpinner();
		spinner_1_1_1_1.setBounds(177, 220, 50, 20);
		getContentPane().add(spinner_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("RPM:  ");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_1_1.setBounds(10, 223, 157, 14);
		getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		setVisible(true);
	}
}
