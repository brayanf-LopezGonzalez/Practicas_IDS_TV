package package1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz extends JFrame{
	
	public Interfaz() {
		
		this.setTitle("Calculadora de intereses");
		this.setSize(600,700);
		//this.setBackground(Color.decode("#f5b862"));
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);//"false" bloquea el tamaño de la ventana
		
		this.add(this.panel());
		
		ImageIcon icono = new ImageIcon("imagenes/calculadora.png");
		this.setIconImage(icono.getImage());
				
		this.setVisible(true);
		this.repaint();
		
	}
	
	public JPanel panel() {
		
		JPanel ventanaPanel = new JPanel();
		
		ventanaPanel.setBackground(Color.white);
		ventanaPanel.setOpaque(true);
		ventanaPanel.setLayout(new BorderLayout());
		
		JLabel texto = new JLabel("Interes");
		texto.setFont(new Font("Corbel", Font.BOLD, 32));
		texto.setBackground(Color.white);
		texto.setOpaque(true);
		//texto.setHorizontalAlignment(JLabel.RIGHT);
		ventanaPanel.add(texto,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#62f591"));
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		ventanaPanel.add(centro,BorderLayout.CENTER);
		
		JLabel calcularInteres = new JLabel("Calcular Interes");
		calcularInteres.setFont(new Font("Corbel", Font.BOLD, 25));
		//calcularInteres.setOpaque(true);
		centro.add(calcularInteres,BorderLayout.NORTH);
		
//		JPanel espacioIzquierda = new JPanel();
//		espacioIzquierda.setSize(new Dimension(400,400));
//		espacioIzquierda.setOpaque(false);
//		ventanaPanel.add(espacioIzquierda, BorderLayout.WEST);
		ventanaPanel.add(espacio(),BorderLayout.WEST);
		ventanaPanel.add(espacio(),BorderLayout.EAST);
		
		
		JPanel datosVerde = new JPanel();
		datosVerde.setBackground(Color.decode("#62f591"));
		datosVerde.setOpaque(true);
		datosVerde.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		datosVerde.setLayout(new GridLayout(4,2,5,5));
		centro.add(datosVerde,BorderLayout.CENTER);
		
		JLabel capital = new JLabel("Capital:");
		capital.setBorder(BorderFactory.createMatteBorder(20, 60, 20, 3, Color.decode("#62f591")));
		datosVerde.add(capital);
		
		JTextField campo1 = new JTextField("1500");
		campo1.setBorder(BorderFactory.createMatteBorder(30, 20, 30, 50, Color.decode("#62f591")));
		datosVerde.add(campo1);
		
		JLabel tiempo = new JLabel("Tiempo:");
		tiempo.setBorder(BorderFactory.createMatteBorder(20, 60, 20, 3, Color.decode("#62f591")));
		datosVerde.add(tiempo);
		
		JTextField campo2 = new JTextField("2");
		campo2.setBorder(BorderFactory.createMatteBorder(30, 20, 30, 50, Color.decode("#62f591")));
		datosVerde.add(campo2);
		
		JLabel tasaInteres = new JLabel("Tasa Interes:");
		tasaInteres.setBorder(BorderFactory.createMatteBorder(20, 60, 20, 3, Color.decode("#62f591")));
		datosVerde.add(tasaInteres);
		
		JTextField campo3 = new JTextField("0.1");
		campo3.setBorder(BorderFactory.createMatteBorder(30, 20, 30, 50, Color.decode("#62f591")));
		datosVerde.add(campo3);
		
		JButton calcular = new JButton();
		ImageIcon calculadora = new ImageIcon("imagenes/calculadora.png");
		calcular.setIcon(calculadora);
		datosVerde.add(calcular);
		
		JButton cancelar = new JButton();
		ImageIcon equis = new ImageIcon("imagenes/cancelar.png");
		
		cancelar.setIcon(equis);
		datosVerde.add(cancelar);
		
		JPanel abajo = new JPanel();
		abajo.setOpaque(false);
		abajo.setLayout(new BorderLayout());
		ventanaPanel.add(abajo, BorderLayout.SOUTH);
		abajo.add(espacio(), BorderLayout.NORTH);
		abajo.add(espacio(), BorderLayout.SOUTH);
		abajo.add(espacio(), BorderLayout.WEST);
		abajo.add(espacio(), BorderLayout.EAST);
		
		JPanel rojo = new JPanel();
		rojo.setOpaque(true);
		rojo.setBackground(Color.decode("#d56e65"));
		rojo.setLayout(new GridLayout(2,2));
		abajo.add(rojo, BorderLayout.CENTER);
		
		JLabel texto1 = new JLabel("Interes:");
		texto1.setBorder(BorderFactory.createMatteBorder(30, 80, 40, 3, Color.decode("#d56e65")));
		rojo.add(texto1);
		
		JTextField texto2 = new JTextField("315.000000");
		texto2.setBorder(BorderFactory.createMatteBorder(30, 20, 20, 50, Color.decode("#d56e65")));
		rojo.add(texto2);
		
		JLabel texto3 = new JLabel("Monto:");
		texto3.setBorder(BorderFactory.createMatteBorder(30, 80, 40, 3, Color.decode("#d56e65")));
		rojo.add(texto3);
		
		JTextField texto4 = new JTextField("1815.0000000000");
		texto4.setBorder(BorderFactory.createMatteBorder(20, 20, 30, 50, Color.decode("#d56e65")));
		rojo.add(texto4);
		
		
//		String[] textos1 = {"Capital:","Tiempo:","Tasa interes:"};
//		JTextField[] campos = {new JTextField(), new JTextField(), new JTextField()};
//		
//		
//		JPanel cuadricula_1 = new JPanel();
//		cuadricula_1.setLayout(new GridLayout(3,2,5,5));
//		centro.add(cuadricula_1,BorderLayout.CENTER);
//		
//		int i = 0;
//		for(String etiqueta : textos1) {
//			
//			cuadricula_1.add(new JLabel(etiqueta));
//			cuadricula_1.add(campos[i]);
//			i++;
//		}
		
			
		
		return ventanaPanel;
	}
	
	
	public JPanel espacio() {
		
		JPanel panelBlanco = new JPanel();	
		panelBlanco.setSize(new Dimension(400,400));
		panelBlanco.setOpaque(false);
		
		return panelBlanco;
	}
	
	

}
