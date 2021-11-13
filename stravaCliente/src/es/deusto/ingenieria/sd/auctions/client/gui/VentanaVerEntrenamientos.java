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

import es.deusto.ingenieria.sd.auctions.server.data.dto.EntrenamientoDTO;

public class VentanaVerEntrenamientos extends JFrame {
	
	private DefaultTableModel dtm;

	public VentanaVerEntrenamientos(List<EntrenamientoDTO> entrenamientos, List<EntrenamientoDTO> entrenamientos2) {
				
		new JFrame();
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 318, 408);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(105, 339, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Entrenamientos");
		lblNewLabel.setBounds(0, 0, 306, 89);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		JTable table1 = new JTable();
		table1.setBackground(new Color(255, 255, 255));
		table1.setBorder(new CompoundBorder());
		table1.setBounds(10, 125, 286, 203);
		getContentPane().add(table1);

	
		dtm = new DefaultTableModel();
		dtm.addColumn("Titulo");
		dtm.addColumn("Duracion");
		dtm.addColumn("Distancia");
		table1.setModel(dtm);
		dtm.setNumRows(entrenamientos.size());

		String[] arrayTitulos = new String[3];
		arrayTitulos[0] = "Titulo";
		arrayTitulos[1] = "Distancia";
		arrayTitulos[2] = "Duracion";
		dtm.addRow(arrayTitulos);					
		
		for (EntrenamientoDTO entrenamiento : entrenamientos) {
			String[] arrayInfo = new String[3];
			arrayInfo[0] = entrenamiento.getTitulo();
			arrayInfo[1] = entrenamiento.getDistancia()+"";
			arrayInfo[2] = entrenamiento.getDuracion()+"";
			dtm.addRow(arrayInfo);					
		}
		
		dtm.removeRow(0);
	
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"bici", "correr"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(188, 92, 108, 22);
		getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				table1.setModel(new DefaultTableModel());
				dtm = new DefaultTableModel();
				dtm.addColumn("Titulo");
				dtm.addColumn("Duracion");
				dtm.addColumn("Distancia");
				table1.setModel(dtm);
				dtm.setNumRows(entrenamientos.size());
				String[] arrayTitulos = new String[3];
				arrayTitulos[0] = "Titulo";
				arrayTitulos[1] = "Distancia";
				arrayTitulos[2] = "Duracion";
				dtm.addRow(arrayTitulos);	
				dtm.removeRow(0);
				
				if(((String) comboBox.getSelectedItem()).matches("bici")) {
					
					for (EntrenamientoDTO entrenamiento : entrenamientos) {
						String[] arrayInfo = new String[3];
						arrayInfo[0] = entrenamiento.getTitulo();
						arrayInfo[1] = entrenamiento.getDistancia()+"";
						arrayInfo[2] = entrenamiento.getDuracion()+"";
						dtm.addRow(arrayInfo);					
					}
				} else if(((String) comboBox.getSelectedItem()).matches("correr")) {
	
					for (EntrenamientoDTO entrenamiento : entrenamientos2) {
						String[] arrayInfo = new String[3];
						arrayInfo[0] = entrenamiento.getTitulo();
						arrayInfo[1] = entrenamiento.getDistancia()+"";
						arrayInfo[2] = entrenamiento.getDuracion()+"";
						dtm.addRow(arrayInfo);					
					}
				}
				
				repaint();
				validate();
				
			}
		});
		
		
		setVisible(true);
	}
}
