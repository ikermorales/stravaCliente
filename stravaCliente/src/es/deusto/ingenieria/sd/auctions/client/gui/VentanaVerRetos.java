package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import es.deusto.ingenieria.sd.auctions.client.controller.BidController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.RetoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class VentanaVerRetos extends JFrame {

	private ArrayList<RetoDTO> listaActual = new ArrayList<>();
	private JComboBox comboBox;

	public VentanaVerRetos(UserDTO user, BidController erController, List<RetoDTO> retos, List<RetoDTO> retos2) {

		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 266, 399);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaPrincipal(user, erController);
				dispose();
			}
		});
		btnNewButton.setBounds(20, 330, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Retos");
		lblNewLabel.setBounds(0, 0, 254, 89);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Informacion: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 180, 234, 139);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(5, 1));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("bici");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(10, 85, 99, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("correr");
		chckbxNewCheckBox_1.setSelected(true);
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(10, 112, 99, 23);
		getContentPane().add(chckbxNewCheckBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 142, 234, 32);
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JComboBox comboBox = new JComboBox();
		panel_1.add(comboBox);
		comboBox.setBackground(Color.WHITE);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnAadir.setBounds(140, 330, 89, 23);
		getContentPane().add(btnAadir);


		for (RetoDTO retoDTO : retos) {
			listaActual.add(retoDTO);
			comboBox.addItem(retoDTO.getTitulo() + " - " + retoDTO.getDeporte());
		}
		for (RetoDTO retoDTO : retos2) {
			listaActual.add(retoDTO);
			comboBox.addItem(retoDTO.getTitulo() + " - " + retoDTO.getDeporte());
			repaint();
			validate();
			revalidate();
		}
				
		comboBox.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				RetoDTO reto = listaActual.get(index);

				panel.removeAll();
				panel.revalidate();
				repaint();
				validate();
				revalidate();

				panel.add(new JLabel("Descripcion: " + reto.getDescripcion()));
				panel.add(new JLabel("Fecha inicio: " + reto.getFechaInicio()));
				panel.add(new JLabel("Fecha fin: " + reto.getFechaFin()));
				panel.add(new JLabel("Objetivo: " + reto.getObjetivo()));
				panel.add(new JLabel("Creador: " + reto.getCreador().getNickname()));

				repaint();
				validate();
			}
		});



		chckbxNewCheckBox.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				listaActual = new ArrayList<>();
				JComboBox combo = new JComboBox<String>();
				panel_1.removeAll();
				repaint();
				validate();
				revalidate();

				if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected()) {
					for (RetoDTO retoDTO : retos) {
						listaActual.add(retoDTO);
						combo.addItem(retoDTO.getTitulo() + " - " + retoDTO.getDeporte());
					}	
					for (RetoDTO retoDTO : retos2) {
						listaActual.add(retoDTO);
						combo.addItem(retoDTO.getTitulo() + " - " + retoDTO.getDeporte());
					}

				} else if(chckbxNewCheckBox.isSelected() == false && chckbxNewCheckBox_1.isSelected()) {
					for (RetoDTO retoDTO : retos2) {
						listaActual.add(retoDTO);
						combo.addItem(retoDTO.getTitulo());
					}

				} else if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected() == false) {
					for (RetoDTO retoDTO : retos) {
						listaActual.add(retoDTO);
						combo.addItem(retoDTO.getTitulo());
					}
				}
				
				panel_1.add(combo);
				combo.setSelectedIndex(-1);

				combo.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						int index = combo.getSelectedIndex();
						RetoDTO reto = listaActual.get(index);

						panel.removeAll();
						panel.revalidate();
						repaint();
						validate();
						revalidate();

						panel.add(new JLabel("Descripcion: " + reto.getDescripcion()));
						panel.add(new JLabel("Fecha inicio: " + reto.getFechaInicio()));
						panel.add(new JLabel("Fecha fin: " + reto.getFechaFin()));
						panel.add(new JLabel("Objetivo: " + reto.getObjetivo()));
						panel.add(new JLabel("Creador: " + reto.getCreador().getNickname()));

						
						

						repaint();
						validate();
					}
				});

				repaint();
				validate();
				revalidate();

			}
		});

		chckbxNewCheckBox_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				listaActual = new ArrayList<>();
				JComboBox combo = new JComboBox<String>();
				panel_1.removeAll();
				repaint();
				validate();
				revalidate();

				if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected()) {
					for (RetoDTO retoDTO : retos) {
						listaActual.add(retoDTO);
						combo.addItem(retoDTO.getTitulo() + " - " + retoDTO.getDeporte());
					}	
					for (RetoDTO retoDTO : retos2) {
						listaActual.add(retoDTO);
						combo.addItem(retoDTO.getTitulo() + " - " + retoDTO.getDeporte());
					}

				} else if(chckbxNewCheckBox.isSelected() == false && chckbxNewCheckBox_1.isSelected()) {
					for (RetoDTO retoDTO : retos2) {
						listaActual.add(retoDTO);
						combo.addItem(retoDTO.getTitulo());
					}

				} else if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected() == false) {
					for (RetoDTO retoDTO : retos) {
						listaActual.add(retoDTO);
						combo.addItem(retoDTO.getTitulo());
					}
				}
				
				panel_1.add(combo);
				combo.setSelectedIndex(-1);

				combo.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						int index = combo.getSelectedIndex();
						RetoDTO reto = listaActual.get(index);

						panel.removeAll();
						panel.revalidate();
						repaint();
						validate();
						revalidate();

						panel.add(new JLabel("Descripcion: " + reto.getDescripcion()));
						panel.add(new JLabel("Fecha inicio: " + reto.getFechaInicio()));
						panel.add(new JLabel("Fecha fin: " + reto.getFechaFin()));
						panel.add(new JLabel("Objetivo: " + reto.getObjetivo()));
						panel.add(new JLabel("Creador: " + reto.getCreador().getNickname()));

						repaint();
						validate();
					}
				});

				repaint();
				validate();
				revalidate();

			}
		});
		

		setVisible(true);
	}
}
