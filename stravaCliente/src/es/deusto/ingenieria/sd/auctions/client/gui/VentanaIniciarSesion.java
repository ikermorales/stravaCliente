package es.deusto.ingenieria.sd.auctions.client.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class VentanaIniciarSesion extends JFrame {

	private JPanel panelUsuario;
	private JTextField usuario;
	private JLabel labelUsuario = new JLabel("        Usuario: ");

	private JPanel panelContrasenya;
	private JPasswordField contrasenya;
	private JLabel labelContrasenya = new JLabel("  Contraseña: ");

	private JButton aceptar;
	private JButton crearUsuario;
	private JPanel panelBotonera;

	private JPanel panelDatos;

	private JPanel panelDecorativo;
	private JLabel labelDecorativo;


	public VentanaIniciarSesion() {
		setTitle("Inicio");
		setSize(310,260);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		setResizable(false);
		setLocationRelativeTo(null);
		setBackground(Color.WHITE);


		panelDecorativo = new JPanel();
		panelDecorativo.setLayout(new GridLayout(1,1));
		panelDecorativo.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0)); //TOC
		labelDecorativo = new JLabel(new ImageIcon("iconos/login.png"));
		panelDecorativo.setBackground(Color.WHITE);
		panelDecorativo.add(labelDecorativo);
		add(panelDecorativo);


		panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(3,1));
		panelDatos.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelDatos.setSize(new Dimension(100,100));
		panelDatos.setBackground(new Color(0,0,0));
		panelDatos.setPreferredSize(new Dimension(280,100));
		add(panelDatos);

		panelUsuario = new JPanel();
		usuario = new JTextField();
		usuario.setPreferredSize(new Dimension(100,25));
		panelUsuario.add(labelUsuario);
		labelUsuario.setForeground(Color.WHITE);
		panelUsuario.add(usuario);
		panelUsuario.setBackground(new Color(0,0,0));
		panelDatos.add(panelUsuario);

		panelContrasenya = new JPanel();
		contrasenya = new JPasswordField();
		contrasenya.setPreferredSize(new Dimension(100,25));
		panelContrasenya.add(labelContrasenya);
		labelContrasenya.setForeground(Color.WHITE);
		panelContrasenya.add(contrasenya);
		panelContrasenya.setBackground(new Color(0,0,0));
		panelDatos.add(panelContrasenya);

		panelBotonera = new JPanel();
		aceptar = new JButton("Iniciar Sesión");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaPrincipal();
				dispose();
			}
		});
		crearUsuario = new JButton("Crear Nuevo Usuario");
		crearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearUsuarioMetodo();
				dispose();
			}
		});
		aceptar.setEnabled(false);
		crearUsuario.setEnabled(true);
		crearUsuario.setForeground(Color.BLACK);
		aceptar.setForeground(Color.BLACK);
		crearUsuario.setBackground(Color.WHITE);
		aceptar.setBackground(Color.WHITE);
		panelBotonera.add(aceptar);
		panelBotonera.add(crearUsuario);
		panelBotonera.setBackground(new Color(0,0,0));
		panelDatos.add(panelBotonera);
		
		usuario.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				changed();
			}
			public void removeUpdate(DocumentEvent e) {
				changed();
			}
			public void insertUpdate(DocumentEvent e) {
				changed();
			}
		});

		contrasenya.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				changed();
			}
			public void removeUpdate(DocumentEvent e) {
				changed();
			}
			public void insertUpdate(DocumentEvent e) {
				changed();
			}
		});		


		setVisible(true);		
	}


	public void changed() {
		if (contrasenya.getText().equals("") || contrasenya.getText().contains(" ") || usuario.getText().equals("") || usuario.getText().contains(" ")){
			aceptar.setEnabled(false);
		}
		else {
			aceptar.setEnabled(true);
		}
	}
		
		
	}
