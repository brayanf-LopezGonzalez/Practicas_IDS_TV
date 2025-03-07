package package1;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Ventana2 {

	private JFrame frame;
	private JTextField txtTilin;
	private JTextField txtInsano;
	private JTextField txtAsdgasfg;
	private JTextField textField_3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
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
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 990, 835);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 255, 128),15));
		panel.setBackground(new Color(128, 255, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de usuario");
		lblNewLabel.setBounds(15, 15, 946, 27);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 21));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 42, 946, 741);
		panel_1.setBorder(new LineBorder(new Color(128, 255, 128),20));;
		panel_1.setBackground(new Color(128, 255, 128));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 20, 464, 460);
		panel_2.setBorder(BorderFactory.createMatteBorder(0, 0, 40, 50, new Color(128, 255, 255)));
		panel_2.setBorder(new LineBorder(new Color(128, 255, 255),10));
		panel_2.setBackground(new Color(128, 255, 255));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Datos generales");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		panel_2.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(6, 2, 15, 15));
		panel_6.setOpaque(false);
		panel_6.setBorder(BorderFactory.createMatteBorder(0, 0, 30, 50, new Color(128, 255, 255)));
		
		JLabel lblNewLabel_3 = new JLabel("Nombre(s):");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBorder(BorderFactory.createMatteBorder(0, 80, 0, 0, new Color(128, 255, 255)));
		panel_6.add(lblNewLabel_3);
		
		txtTilin = new JTextField();
		txtTilin.setText("Tilin");
		panel_6.add(txtTilin);
		txtTilin.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido Paterno:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(128, 255, 255)));
		panel_6.add(lblNewLabel_2);
		
		txtInsano = new JTextField();
		txtInsano.setText("Insano");
		panel_6.add(txtInsano);
		txtInsano.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Materno:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(128, 255, 255)));
		panel_6.add(lblNewLabel_4);
		
		txtAsdgasfg = new JTextField();
		txtAsdgasfg.setText("asdgasfg");
		panel_6.add(txtAsdgasfg);
		txtAsdgasfg.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBorder(BorderFactory.createMatteBorder(0, 30, 0, 0, new Color(128, 255, 255)));
		panel_6.add(lblNewLabel_7);
		
		JPanel panel_7 = new JPanel();
		panel_6.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		textField_3 = new JTextField();
		textField_3.setText("12/07/89");
		panel_7.add(textField_3, BorderLayout.WEST);
		textField_3.setColumns(10);
		
		JButton calendario = new JButton();
		calendario.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 20, new Color(128, 255, 255)));
		//calendario.setOpaque(false);
		
		calendario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ImageIcon icono_1 = new ImageIcon("imagenes/calendario.png");
		
		Image imagenOriginal = icono_1.getImage();
		Image escalable_1 = imagenOriginal.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
		calendario.setIcon(new ImageIcon(escalable_1));
		panel_7.add(calendario);
		
		JLabel lblNewLabel_8 = new JLabel("Sexo:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBorder(BorderFactory.createMatteBorder(0, 120, 0, 0, new Color(128, 255, 255)));
		panel_6.add(lblNewLabel_8);
		
		JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_6.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JRadioButton boton1 = new JRadioButton("Masculino");
		boton1.setOpaque(false);
		panel_8.add(boton1, BorderLayout.NORTH);
		
		JRadioButton boton2 = new JRadioButton("Femenino");
		boton2.setOpaque(false);
		panel_8.add(boton2, BorderLayout.SOUTH);
		
		ButtonGroup grupo1 = new ButtonGroup();	
		grupo1.add(boton1);
		grupo1.add(boton2);
		
		JLabel lblNewLabel_9 = new JLabel("Nacionalidad:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setBorder(BorderFactory.createMatteBorder(0, 80, 0, 0, new Color(128, 255, 255)));
		panel_6.add(lblNewLabel_9);
		
		String[] nacionalidad = {"Mexico", "Peru", "EU"};
		JComboBox<String> nacionalidades = new JComboBox<String>(nacionalidad);
		nacionalidades.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 20, new Color(128, 255, 255)));
		panel_6.add(nacionalidades);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(510, 20, 416, 460);
		panel_4.setBackground(new Color(255, 128, 128));	
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		panel_4.setBorder(BorderFactory.createMatteBorder(0, 15, 15, 0, new Color(128, 255, 128)));
		panel_4.setBorder(new LineBorder(new Color(255, 128, 128),10));
		
		JLabel lblNewLabel_5 = new JLabel("Perfil de usuario");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 16));
		panel_4.add(lblNewLabel_5, BorderLayout.NORTH);
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9, BorderLayout.CENTER);
		panel_9.setOpaque(false);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton fotografia = new JButton();
		fotografia.setEnabled(false);
		fotografia.setBorder(BorderFactory.createMatteBorder(20, 130, 5, 130, new Color(255, 128, 128)));
		panel_9.add(fotografia, BorderLayout.NORTH);
		
		ImageIcon icono_2 = new ImageIcon("imagenes/perfil.png");
		Image imagenOriginal2 = icono_2.getImage();
		Image escalable_2 = imagenOriginal2.getScaledInstance(200, 220, Image.SCALE_SMOOTH);
		fotografia.setIcon(new ImageIcon(escalable_2));
		
		JPanel panel_10 = new JPanel();
		panel_9.add(panel_10, BorderLayout.CENTER);
		panel_10.setOpaque(false);
		panel_10.setLayout(new GridLayout(2, 1, 0, 0));
		
		JCheckBox mostrarFoto = new JCheckBox("Mostrar fotografia de perfil");
		mostrarFoto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		mostrarFoto.setBorder(BorderFactory.createMatteBorder(5, 120, 5, 120, new Color(255, 128, 128)));
		mostrarFoto.setOpaque(false);
		panel_10.add(mostrarFoto);
		
		JCheckBox mostrarFechaNacimiento = new JCheckBox("Mostrar fecha de nacimiento");
		mostrarFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		mostrarFechaNacimiento.setBorder(BorderFactory.createMatteBorder(5, 120, 20, 120, new Color(255, 128, 128)));
		mostrarFechaNacimiento.setOpaque(false);
		panel_10.add(mostrarFechaNacimiento);
		
		JPanel externo = new JPanel();
		externo.setBounds(20, 490, 480, 230);
		externo.setBackground(new Color(255, 0, 0));
		externo.setBorder(BorderFactory.createMatteBorder(15, 0, 0, 15, new Color(128, 255, 128)));
		externo.setLayout(new BorderLayout(0,0));
		panel_1.add(externo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 0, 0));
		//panel_3.setBorder(new LineBorder(new Color(255, 0, 0),10));
		externo.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("Datos adicionales");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 16));
		panel_3.add(lblNewLabel_6, BorderLayout.NORTH);
		
		JPanel panel_11 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(255, 0, 0),10));
		panel_3.add(panel_11, BorderLayout.CENTER);
		panel_11.setOpaque(false);
		panel_11.setLayout(new GridLayout(2, 2, 20, 20));
		
		JLabel descripcion = new JLabel("Descripcion");
		descripcion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		descripcion.setOpaque(false);
		panel_11.add(descripcion);
		
		JLabel preferencias = new JLabel("Preferencias");
		preferencias.setFont(new Font("Tahoma", Font.PLAIN, 13));
		preferencias.setOpaque(false);
		panel_11.add(preferencias);
		
//		JTextArea textArea_1 = new JTextArea();
//		textArea_1.setLineWrap(true);
//		textArea_1.setWrapStyleWord(true);
//		panel_11.add(textArea_1);
//		
//		JScrollPane scrollDerecha = new JScrollPane(textArea_1);
//		scrollDerecha.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//		scrollDerecha.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		JScrollPane scrollPane = new JScrollPane();
		panel_11.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea(10,30);
		scrollPane.setViewportView(textArea_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_11.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea(10,0);
		scrollPane_1.setViewportView(textArea);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(510, 504, 416, 216);
		panel_5.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		
		
		
		
		JButton nuevoDocs = new JButton("Nuevo");
		nuevoDocs.setForeground(new Color(255, 255, 255));
		nuevoDocs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nuevoDocs.setBackground(new Color(0, 0, 0));
		nuevoDocs.setBounds(164, 21, 148, 44);
		panel_5.add(nuevoDocs);
		
		ImageIcon icono_3 = new ImageIcon("imagenes/agregar.png");
		Image imagenOriginal3 = icono_3.getImage();
		Image escalable_3 = imagenOriginal3.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
		nuevoDocs.setIcon(new ImageIcon(escalable_3));
		
		JButton guardarDocs = new JButton("Guardar");
		guardarDocs.setForeground(new Color(255, 255, 255));
		guardarDocs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		guardarDocs.setBackground(new Color(0, 0, 0));
		guardarDocs.setBounds(164, 85, 148, 44);
		panel_5.add(guardarDocs);
		
		ImageIcon icono_4 = new ImageIcon("imagenes/guardar.png");
		Image imagenOriginal4 = icono_4.getImage();
		Image escalable_4 = imagenOriginal4.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
		guardarDocs.setIcon(new ImageIcon(escalable_4));
		
		JButton eliminarDocs = new JButton("Salir");
		eliminarDocs.setBackground(new Color(0, 0, 0));
		eliminarDocs.setForeground(new Color(255, 255, 255));
		eliminarDocs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		eliminarDocs.setBounds(164, 149, 148, 44);
		panel_5.add(eliminarDocs);
		
		ImageIcon icono_5 = new ImageIcon("imagenes/cancelar.png");
		Image imagenOriginal5 = icono_5.getImage();
		Image escalable_5 = imagenOriginal5.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
		eliminarDocs.setIcon(new ImageIcon(escalable_5));
	}
}
