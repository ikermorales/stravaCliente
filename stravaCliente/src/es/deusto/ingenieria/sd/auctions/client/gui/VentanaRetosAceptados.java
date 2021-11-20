package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoAceptadoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class VentanaRetosAceptados extends JFrame{
	
	public VentanaRetosAceptados(UserDTO user, ErController erController) {
		
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 281, 539);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Retos Aceptados");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 249, 49);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 71, 249, 384);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(user.getRetosAceptados().size(), 1, 0, 0));
		
		for (RetoAceptadoDTO reto : user.getRetosAceptados()) {
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(new GridLayout(7,1));
			panel_1.setBackground(Color.WHITE);
			panel_1.setBorder(new TitledBorder(null, reto.getTitulo() + ": ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.add(new JLabel("Descripcion: " + reto.getDescripcion()));
			panel_1.add(new JLabel("Deporte: " + reto.getDeporte()));
			panel_1.add(new JLabel("Objetivo: " + reto.getObjetivo()));
			panel_1.add(new JLabel("FechaInicio: " + reto.getFechaInicio()));
			panel_1.add(new JLabel("FechaFin: " + reto.getFechaFin()));
			panel_1.add(new JLabel("Creador: " + reto.getCreador().getNickname()));
			
			try {
				erController.calcularEstado(reto, user);
			} catch (RemoteException e1) {
				JOptionPane.showMessageDialog(null, "Hubo un problema con las fechas");
			}
			
			panel_1.add(new JLabel("Estado: " + reto.getPorcentajeCompletado()));
			
			
			panel.add(panel_1);
		}
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPerfil(user, erController);			
			}
		});
		btnNewButton.setBounds(89, 470, 89, 23);
		getContentPane().add(btnNewButton);
		setVisible(true);
	}


}
