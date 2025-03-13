package package1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class ImagenMario extends JFrame {
	
	public ImagenMario() {
		this.setTitle("Super Mario Deluxe Edition 2045");
		this.setVisible(true);
		this.setSize(900,600);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//"false" bloquea el tamaño de la ventana
		
		this.repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setStroke(new BasicStroke(5));
		
		g2d.setColor(Color.decode("#7fe6fd"));//fondo
		g2d.fillRect(0, 0, 900, 600);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 500, 900, 100);
		
		g2d.setColor(Color.decode("#fce6c3"));
		g2d.fillRoundRect(0, 503, 900, 97, 30, 30);
		
		g2d.setColor(Color.decode("#ffbf98"));
		g2d.fillRoundRect(10, 507, 900, 93, 10, 10);
		
		
		
		
	}

}
