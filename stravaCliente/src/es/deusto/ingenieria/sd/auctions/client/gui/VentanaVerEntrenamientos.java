package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;

import es.deusto.ingenieria.sd.auctions.client.controller.ErController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.UserDTO;

public class VentanaVerEntrenamientos extends JFrame {
	
	private DefaultTableModel dtm;
	
	JTable table_1;

	public VentanaVerEntrenamientos(UserDTO user, ErController erController) {
				
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 454, 369);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrenamientos");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 422, 41);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 100, 422, 185);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		table_1 = new JTable();
		table_1.setBackground(Color.WHITE);
		panel.add(table_1);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaPrincipal(user, erController);
				dispose();
			}
		});
		btnNewButton.setBounds(173, 300, 89, 23);
		getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"bici", "correr"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(289, 63, 143, 22);
		getContentPane().add(comboBox);

		dtm = new DefaultTableModel();
		dtm.addColumn("Titulo");
		dtm.addColumn("Duracion");
		dtm.addColumn("Distancia");
		dtm.addColumn("F.I");
		dtm.addColumn("F.F");
		dtm.setNumRows(user.getEntrenamientos().size());

		String[] arrayTitulos = new String[5];
		arrayTitulos[0] = "Titulo";
		arrayTitulos[1] = "Distancia";
		arrayTitulos[2] = "Duracion";
		arrayTitulos[3] = "F.I";
		arrayTitulos[4] = "F.F";
		dtm.addRow(arrayTitulos);					
		
		for (EntrenamientoDTO entrenamiento : user.getEntrenamientos()) {
			String[] arrayInfo = new String[5];
			arrayInfo[0] = entrenamiento.getTitulo();
			arrayInfo[1] = entrenamiento.getDistancia()+"";
			arrayInfo[2] = entrenamiento.getDuracion()+"";
			arrayInfo[3] = entrenamiento.getFechaIni()+"";
			arrayInfo[4] = entrenamiento.getHoraIni()+"";
			
			dtm.addRow(arrayInfo);					
		}
		
		dtm.removeRow(0);
	

		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				table_1.setModel(new DefaultTableModel());
				dtm = new DefaultTableModel();
				dtm.addColumn("Titulo");
				dtm.addColumn("Duracion");
				dtm.addColumn("Distancia");
				dtm.addColumn("F.I");
				dtm.addColumn("F.F");
				table_1.setModel(dtm);
				dtm.setNumRows(user.getEntrenamientosD("bici").size());
				String[] arrayTitulos = new String[5];
				arrayTitulos[0] = "Titulo";
				arrayTitulos[1] = "Distancia";
				arrayTitulos[2] = "Duracion";
				arrayTitulos[3] = "F.I";
				arrayTitulos[4] = "F.F";
				dtm.addRow(arrayTitulos);	
				dtm.removeRow(0);
				
				if(((String) comboBox.getSelectedItem()).matches("bici")) {
					
					for (EntrenamientoDTO entrenamiento : user.getEntrenamientosD("bici")) {
						String[] arrayInfo = new String[5];
						arrayInfo[0] = entrenamiento.getTitulo();
						arrayInfo[1] = entrenamiento.getDistancia()+"";
						arrayInfo[2] = entrenamiento.getDuracion()+"";
						arrayInfo[3] = entrenamiento.getFechaIni()+"";
						arrayInfo[4] = entrenamiento.getHoraIni()+"";
						
						dtm.addRow(arrayInfo);					
					}
				} else if(((String) comboBox.getSelectedItem()).matches("correr")) {
	
					for (EntrenamientoDTO entrenamiento : user.getEntrenamientosD("correr")) {
						String[] arrayInfo = new String[5];
						arrayInfo[0] = entrenamiento.getTitulo();
						arrayInfo[1] = entrenamiento.getDistancia()+"";
						arrayInfo[2] = entrenamiento.getDuracion()+"";
						arrayInfo[3] = entrenamiento.getFechaIni()+"";
						arrayInfo[4] = entrenamiento.getHoraIni()+"";
						dtm.addRow(arrayInfo);					
					}
				}
				
				repaint();
				validate();
				
			}
		});
		
		comboBox.setSelectedIndex(0);
		
		
		setVisible(true);
	}
}
