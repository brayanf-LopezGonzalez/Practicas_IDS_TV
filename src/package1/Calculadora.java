package package1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame{
	
	public Calculadora() {
		
		this.setTitle("Calculadora");
		this.setSize(500,600);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);//"false" bloquea el tamaño de la ventana
		
		this.add(this.panel());
		
		ImageIcon icono = new ImageIcon("imagenes/kingSoul-HollowKnight.png");
		this.setIconImage(icono.getImage());
		
		
		this.setVisible(true);
		this.repaint();
	}
	
	public JPanel panel() {
		
		JPanel ventanaPanel = new JPanel();
		
		ventanaPanel.setBackground(Color.decode("#48cae4"));
		ventanaPanel.setOpaque(true);
		ventanaPanel.setLayout(new BorderLayout());
		
		JLabel resultados = new JLabel("20.00");
		resultados.setFont(new Font("Corbel", Font.BOLD, 30));
		resultados.setBackground(Color.white);
		resultados.setOpaque(true);
		resultados.setHorizontalAlignment(JLabel.RIGHT);
		ventanaPanel.add(resultados,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#CF93F0"));
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		ventanaPanel.add(centro,BorderLayout.CENTER);
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,3,5,5));
		centro.add(botones,BorderLayout.CENTER);
		
		String[] numeros = {"9","8", "7","6","5", "4","3","2", "1","0","."};
		for (String nombre : numeros) {
			JButton boton = new JButton(nombre);
			botones.add(boton);		
		}
		
		JPanel signos = new JPanel();
		signos.setLayout(new GridLayout(6,1,5,5));
		centro.add(signos,BorderLayout.LINE_END);
		
		String[] operadores = {"CE", "+", "-", "*", "/","="};
		for (String nombre2 : operadores) {
			JButton signosBoton = new JButton(nombre2);
			signos.add(signosBoton);
		}
		
		
		
		
		return ventanaPanel;
	}

}
