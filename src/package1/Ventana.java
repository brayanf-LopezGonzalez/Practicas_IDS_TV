package package1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setTitle("Inicio de sesion");
		this.setVisible(true);
		this.setSize(500,500);
		
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
		
		ventanaPanel.setBackground(Color.decode("#feefda"));
		ventanaPanel.setOpaque(true);
		ventanaPanel.setSize(500,500);
		ventanaPanel.setLocation(0,0);
		ventanaPanel.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Bienvenid@");
		etiqueta1.setSize(200,60);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.RED);
		etiqueta1.setLocation(150, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Corbel", Font.BOLD, 24));	
		ventanaPanel.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Correo electronico:");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 100);
		etiqueta2.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(290, 30);
		email.setLocation(40, 130);
		email.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(email);
		
		JLabel etiqueta3 = new JLabel("Contraseña:");
		etiqueta3.setSize(200, 30);
		etiqueta3.setLocation(40, 200);
		etiqueta3.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(etiqueta3);
		
		JPasswordField password = new JPasswordField();
		password.setSize(290, 30);
		password.setLocation(40, 230);
		//password.setFont(new Font("Corbel", Font.BOLD, 18));	
		ventanaPanel.add(password);
		
		JCheckBox casilla = new JCheckBox("Mantener sesion iniciada");
		casilla.setSize(200, 30);
		casilla.setOpaque(false);
		casilla.setLocation(40, 270);
		casilla.setFont(new Font("Corbel", Font.BOLD, 12));	
		ventanaPanel.add(casilla);
		
		JLabel olvidada = new JLabel("<html><u>¿Has olvidado la contraseña?</u></html>");//subraya texto
		olvidada.setForeground(Color.BLUE);//color para simular un hipervinculo
		olvidada.setCursor(new Cursor(Cursor.HAND_CURSOR));//aqui se cambia la forma del cursor al tocar el texto
		olvidada.setSize(200, 30);
		olvidada.setLocation(270, 270);
		olvidada.setFont(new Font("Corbel", Font.BOLD, 12));	
		ventanaPanel.add(olvidada);
		
		JButton inicioSesion = new JButton("Iniciar sesion");
		inicioSesion.setSize(200, 30);
		inicioSesion.setLocation(150, 340);
		inicioSesion.setFont(new Font("Corbel", Font.BOLD, 12));	
		ventanaPanel.add(inicioSesion);
		
		
		
		return ventanaPanel;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
