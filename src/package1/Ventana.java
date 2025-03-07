package package1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setTitle("Inicio de sesion");
		this.setVisible(true);
		this.setSize(700,800);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//"false" bloquea el tamaño de la ventana
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(400,400));
		
//		this.add(this.login());
		this.repaint();
	}
	
	public JPanel login() {
		
		JPanel ventanaPanel = new JPanel();
		
		//------------------- COLOR DE FONDO ------------------------------------------
		
		ventanaPanel.setBackground(Color.decode("#feefda"));
		ventanaPanel.setOpaque(true);
		ventanaPanel.setSize(500,500);
		ventanaPanel.setLocation(0,0);
		ventanaPanel.setLayout(null);
		
		//------------------- ENCABEZADO DEL PANEL ----------------------------------
		
		JLabel etiqueta1 = new JLabel("Registro de usuario");
		etiqueta1.setSize(200,60);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.RED);
		etiqueta1.setLocation(250, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Corbel", Font.BOLD, 24));	
		ventanaPanel.add(etiqueta1);
		
		
		//------------------- OPCIONES LADO IZQUIERDO DEL PANEL -------------------
		JLabel etiqueta2 = new JLabel("Nombre de usuario:");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 100);
		etiqueta2.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta2);
		
		JTextField usuario = new JTextField();
		usuario.setSize(290, 30);
		usuario.setLocation(40, 130);
		usuario.setFont(new Font("Corbel", Font.BOLD, 18));
		ventanaPanel.add(usuario);
		
		JLabel etiqueta3 = new JLabel("Correo electronico:");
		etiqueta3.setSize(200, 30);
		etiqueta3.setLocation(40, 170);
		etiqueta3.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta3);
		
		JTextField email = new JTextField();
		email.setSize(290, 30);
		email.setLocation(40, 200);
		email.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(email);
		
		JLabel etiqueta4 = new JLabel("Contraseña:");
		etiqueta4.setSize(200, 30);
		etiqueta4.setLocation(40, 260);
		etiqueta4.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta4);
		
		JPasswordField password = new JPasswordField();
		password.setSize(290, 30);
		password.setLocation(40, 290);
		password.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(password);
		
		JLabel sexo = new JLabel("Sexo:");
		sexo.setSize(200, 30);
		sexo.setLocation(40, 350);
		sexo.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(sexo);
		
		String[] opcionesSexo = {"Masculino", "Femenimo", "Otro..."};
		JComboBox<String> sexos = new JComboBox<String>(opcionesSexo);
		sexos.setSize(100,30);
		sexos.setLocation(100,350);
		ventanaPanel.add(sexos);
		
		//-------------------- OPCIONES LADO DERECHO ----------------------------
		JLabel etiqueta5 = new JLabel("Preferencias de contenido:");
		etiqueta5.setSize(220, 30);
		etiqueta5.setLocation(380, 100);
		etiqueta5.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta5);
		
		JCheckBox preferencia1 = new JCheckBox("Deportes");
		preferencia1.setSize(108, 30);
		preferencia1.setOpaque(false);
		preferencia1.setLocation(380, 140);
		preferencia1.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia1);
		
		JCheckBox preferencia2 = new JCheckBox("Peliculas");
		preferencia2.setSize(108, 30);
		preferencia2.setOpaque(false);
		preferencia2.setLocation(500, 140);
		preferencia2.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia2);
		
		JCheckBox preferencia3 = new JCheckBox("Literatura");
		preferencia3.setSize(108, 30);
		preferencia3.setOpaque(false);
		preferencia3.setLocation(380, 180);
		preferencia3.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia3);
		
		JCheckBox preferencia4 = new JCheckBox("Videojuegos");
		preferencia4.setSize(130, 30);
		preferencia4.setOpaque(false);
		preferencia4.setLocation(500, 180);
		preferencia4.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia4);
		
		JCheckBox preferencia5 = new JCheckBox("Noticias");
		preferencia5.setSize(130, 30);
		preferencia5.setOpaque(false);
		preferencia5.setLocation(500, 220);
		preferencia5.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia5);
		
		JCheckBox preferencia6 = new JCheckBox("Ciencia");
		preferencia6.setSize(108, 30);
		preferencia6.setOpaque(false);
		preferencia6.setLocation(380, 220);
		preferencia6.setFont(new Font("Corbel", Font.BOLD, 16));	
		ventanaPanel.add(preferencia6);
		
		//------------------ BIOGRAFIA -------------------------------------------
		JLabel bio = new JLabel("Biografia:");
		bio.setSize(200, 30);
		bio.setLocation(40, 410);
		bio.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(bio);
		
		JTextArea biografia = new JTextArea(5,10);
		biografia.setSize(440, 100);
		biografia.setLocation(40, 440);
		biografia.setFont(new Font("Corbel", Font.BOLD, 15));
		biografia.setLineWrap(true);
		biografia.setWrapStyleWord(true);
		ventanaPanel.add(biografia);
		
		//------------------ TERMINOS Y CONDICIONES  ------------------------------------
		
		JButton terminos = new JButton("Terminos y condiciones");
		terminos.setSize(200, 30);
		terminos.setLocation(250, 570);
		terminos.setFont(new Font("Corbel", Font.BOLD, 13));	
		ventanaPanel.add(terminos);
		
		JRadioButton opcion1 = new JRadioButton("Aceptar");
		opcion1.setSize(70,20);
		opcion1.setLocation(230, 610);
		opcion1.setOpaque(false);
		ventanaPanel.add(opcion1);
		
		JRadioButton opcion2 = new JRadioButton("Rechazar");
		opcion2.setSize(80,20);
		opcion2.setLocation(390, 610);
		opcion2.setOpaque(false);
		ventanaPanel.add(opcion2);
				
		ButtonGroup grupo1 = new ButtonGroup();	
		grupo1.add(opcion1);
		grupo1.add(opcion2);
		
		//--------------------- OPCIONES INFERIORES DEL PANEL -----------------------------------
		JCheckBox casilla = new JCheckBox("Mantener sesion iniciada");
		casilla.setSize(200, 30);
		casilla.setOpaque(false);
		casilla.setLocation(130, 660);
		casilla.setFont(new Font("Corbel", Font.BOLD, 12));	
		ventanaPanel.add(casilla);
		
		JLabel olvidada = new JLabel("<html><u>¿Has olvidado la contraseña?</u></html>");//subraya texto
		olvidada.setForeground(Color.BLUE);//color para simular un hipervinculo
		olvidada.setCursor(new Cursor(Cursor.HAND_CURSOR));//aqui se cambia la forma del cursor al tocar el texto
		olvidada.setSize(200, 30);
		olvidada.setLocation(370, 660);
		olvidada.setFont(new Font("Corbel", Font.BOLD, 12));	
		ventanaPanel.add(olvidada);
		
		JButton inicioSesion = new JButton("CREAR CUENTA");
		inicioSesion.setSize(200, 30);
		inicioSesion.setLocation(250, 700);
		inicioSesion.setFont(new Font("Corbel", Font.BOLD, 19));	
		ventanaPanel.add(inicioSesion);
		
		return ventanaPanel;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setStroke(new BasicStroke(5));
		
		g2d.drawRect(100, 100, 80, 80);
		
		g2d.setColor(Color.ORANGE);
		
		g2d.fillRect(120, 120, 80, 80);
		
		g2d.setColor(Color.GREEN);
		
		g2d.setFont(new Font("American Tyoewriter", Font.BOLD,28));
		
		g2d.drawString("Eso tilin", 150, 200);
		
		g2d.setColor(Color.GREEN);
		
		g2d.drawLine(30, 30, 500, 500);
		
		
		
	}
}
