package package1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setTitle("Inicio de sesion");
		this.setVisible(true);
		this.setSize(800,800);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//"false" bloquea el tamaño de la ventana
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(400,400));
		
		this.add(this.login());
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
		etiqueta1.setLocation(225, 30);
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
		
		inicioSesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean frag1 = false, frag2 = false, frag3 = false, frag4 = false;
				
				if(usuario.getText().equals("")) {
					usuario.setBorder(BorderFactory.createLineBorder(Color.red,3));
				}else {
					usuario.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
					frag1 = true;
				}
				
				if(email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else {
					email.setBorder(BorderFactory.createLineBorder(Color.green,3));
					frag2 = true;
				}
				
				String myPassword = new String (password.getPassword());
				
				if(myPassword.equals("")) {
					password.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else {
					password.setBorder(BorderFactory.createLineBorder(Color.green,3));
					frag3 = true;
				}
				
				if(opcion2.isSelected()) {
					Object[] options = { "OK"};
					JOptionPane.showOptionDialog(null, "Debe aceptar los terminos y condiciones", "Warning",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
					
				}else if (opcion1.isSelected()){
					frag4 = true;
				}
				
				
				if(frag1 && frag2 && frag3 && frag4) {
					if(email.getText().equals("tilin@gmail.com")){
						if(myPassword.equals("12345")) {
							JOptionPane.showMessageDialog(null, "Sesion iniciada", "Login", JOptionPane.WARNING_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Login", JOptionPane.WARNING_MESSAGE);	
						}
					} else {
						JOptionPane.showMessageDialog(null, "Correo Electronico incorrecto", "Login", JOptionPane.WARNING_MESSAGE);
					}
				}
				
				
				
				
				
				
				
				
				
				
			}
		});
		
		return ventanaPanel;
	}

//	@Override
//	public void paint(Graphics g) {
//		super.paint(g);
//		
//		Graphics2D g2d = (Graphics2D) g.create();
//		g2d.setStroke(new BasicStroke(5));
//		
////		g2d.drawRect(100, 100, 80, 80);
////		g2d.setColor(Color.ORANGE);
////		g2d.fillRect(120, 120, 80, 80);		
////		g2d.setColor(Color.GREEN);
////		g2d.setFont(new Font("American Typewriter", Font.BOLD,28));
////		g2d.drawString("Eso tilin", 150, 200);
////		g2d.setColor(Color.GREEN);
////		g2d.drawLine(30, 30, 500, 500);
////		g2d.setColor(Color.BLACK);
////		g2d.fillArc(500, 100, 100, 100, 0, 180);
////		g2d.setColor(Color.GREEN);
////		g2d.drawArc(500, 100, 100, 100, 180, 180);
////		g2d.setColor(Color.ORANGE);
////		g2d.fillArc(505, 105, 90, 90, 0, 180);
////	
////		int[] xPoints1 = {550, 500, 600};
////      int[] yPoints1 = {250, 300, 300};
////		g2d.fillPolygon(xPoints1, yPoints1, 3);
////		
////		int[] xPoints2 = {520, 470, 570};
////      int[] yPoints2 = {220, 270, 270};
////      g2d.drawPolygon(xPoints2, yPoints2, 3);
////        
////      g2d.fillOval(100, 490, 200, 100);
////      g2d.drawOval(80, 550, 100, 200);
////      g2d.drawRoundRect(380, 500, 100, 100, 50, 50);
////      g2d.setColor(Color.BLACK);
////      g2d.fillRoundRect(420, 540, 100, 100, 50, 50);
////      try {
////      	BufferedImage imagen = ImageIO.read(new File("imagenes/si.png"));
////        	g2d.drawImage(imagen, 400, 650, 100,100,this);
////        	
////      } catch (IOException e) {
////      	e.printStackTrace();
////      }
//		
//		g2d.setColor(Color.decode("#5C94FC"));//fondo
//		g2d.fillRect(0, 0, 800, 800);
//		
//		g2d.setColor(Color.decode("#f6bb5b"));//tierra
//		g2d.fillRect(0, 600, 800, 200);
//		
//		g2d.setColor(Color.decode("#a5d5f5"));//montañas
//		g2d.fillArc(80, 350, 120, 100, 0, 180);
//		g2d.fillRect(80, 400, 120, 200);
//		
//		g2d.fillArc(330, 350, 120, 100, 0, 180);
//		g2d.fillRect(330, 400, 120, 200);
//		
//		g2d.fillArc(450, 250, 120, 100, 0, 180);
//		g2d.fillRect(450, 300, 120, 300);
//		
//		g2d.setColor(Color.decode("#4674df"));// montañas oscuras
//		g2d.fillArc(-20, 450, 150, 100, 0, 180);
//		g2d.fillRect(-20, 500, 150, 100);
//		
//		g2d.fillArc(330, 450, 150, 100, 0, 180);
//		g2d.fillRect(330, 500, 150, 100);
//		
//		g2d.setColor(Color.WHITE);//nubes
//		g2d.fillArc(450, 420, 40, 30, 90, 180);
//		g2d.fillRect(470, 420, 100, 30);
//		
//		g2d.setColor(Color.decode("#4674df"));
//		g2d.fillArc(480, 400, 150, 100, 0, 180);
//		g2d.fillRect(480, 450, 150, 150);
//		
//		g2d.setColor(Color.WHITE);//nubes
//		
//		g2d.fillArc(570, 335, 40, 30, 90, 180);
//		g2d.fillRect(590, 335, 80, 30);
//		g2d.fillArc(650, 335, 40, 30, 270, 180);
//		
//		g2d.fillRect(570, 365, 70, 30);
//		g2d.fillArc(620, 365, 40, 30, 270, 180);
//		
//		g2d.fillRect(0, 400, 100, 30);
//		g2d.fillArc(80, 400, 40, 30, 270, 180);
//		
//		g2d.fillArc(200, 435, 40, 30, 90, 180);
//		g2d.fillRect(220, 435, 100, 30);
//		g2d.fillArc(300, 435, 40, 30, 270, 180);
//		
//		g2d.fillRect(200, 510, 50, 30);
//		g2d.fillArc(230, 510, 40, 30, 270, 180);
//		
//		g2d.fillArc(260, 490, 40, 30, 90, 180);
//		g2d.fillRect(280, 490, 50, 30);
//		
//		g2d.fillArc(260, 540, 40, 30, 90, 180);
//		g2d.fillRect(280, 540, 50, 30);
//		
//		
//		g2d.setColor(Color.decode("#63d833"));//pasto
//		int superiorX = 25;
//		int izquierdaX = 0;
//		int derechaX = 50;
//		int incrementoX = 50;	
//		int totalTriangulos = 16;
//		
//		
//		
//		for(int i = 0; i <= totalTriangulos; i++) {
//		
//			int[] puntosX = {superiorX, izquierdaX, derechaX};
//			int[] puntosY = {620, 600, 600};
//			g2d.fillPolygon(puntosX, puntosY, 3);
//			
//			superiorX+=incrementoX;
//			izquierdaX+=incrementoX;
//			derechaX+=incrementoX;
//			
//		}
//		
//		//cuadros
//		int anchoCuadroNegro = 50;
//		int altoCuadroNegro = 50;
//		int borde = 5;
//		int inicioX = 650;
//		int inicioY = 550;
//		int totalCuadros = 6;
//		
//		for (int i = 0; i < totalCuadros; i++) {
//			
//			if(i < 3) {
//	            g2d.setColor(Color.BLACK);
//	            g2d.fillRect(inicioX, inicioY, anchoCuadroNegro, altoCuadroNegro);
//	            
//	            g2d.setColor(Color.GRAY);
//	            g2d.fillRect (inicioX+borde, inicioY + borde, anchoCuadroNegro - 2 * borde, altoCuadroNegro - 2 * borde);
//	            
//	            inicioY -= altoCuadroNegro;
//			} else {
//				g2d.setColor(Color.BLACK);
//	            g2d.fillRect(inicioX, inicioY, anchoCuadroNegro, altoCuadroNegro);
//	            
//	            if(i >= 4) {
//	            	g2d.setColor(Color.YELLOW);
//	            } else {
//	            	g2d.setColor(Color.GRAY);
//	            }
//	            
//	            g2d.fillRect (inicioX+borde, inicioY + borde, anchoCuadroNegro - 2 * borde, altoCuadroNegro - 2 * borde);
//	            inicioX += anchoCuadroNegro;
//			}
//		}
//		
//		
//		try {
//			
//			BufferedImage imagen = ImageIO.read(new File("imagenes/marioInterfaz.png"));
//	        BufferedImage imagenTunel = ImageIO.read(new File("imagenes/tunel.png"));
//	        BufferedImage personajeMario = ImageIO.read(new File("imagenes/mario.png"));
//	        BufferedImage enemigoPlanta = ImageIO.read(new File("imagenes/plantaMario.png"));
//	        BufferedImage enemigoTortugaInsana = ImageIO.read(new File("imagenes/enemigoMario.png"));
//	      	
//	        g2d.drawImage(imagen, 50, 50, 690,100,this);
//	        g2d.drawImage(imagenTunel, 315, 462, 170, 170, this);
//	        g2d.drawImage(imagenTunel, 680, 429, 190, 210, this);
//	        g2d.drawImage(personajeMario, 160, 510, 90, 90, this);
//	        g2d.drawImage(enemigoPlanta, 360, 404, 80, 90, this);
//	        g2d.drawImage(enemigoTortugaInsana, 500, 509, 160, 100, this);
//	        	
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		g2d.setColor(Color.BLACK);
//		g2d.fillOval(715, 420, 6, 11);
//		g2d.fillOval(728, 420, 6, 11);
//		g2d.fillOval(765, 420, 6, 11);
//		g2d.fillOval(778, 420, 6, 11);
//		
//		
//		
//	}
	
	
}
