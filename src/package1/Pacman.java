package package1;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;

public class Pacman implements KeyListener{

	private JFrame frame;
	DrawingPanel tablero = new DrawingPanel();
	private int x = 293, y = 308;
	private boolean bocaAbierta = true;
	private String direccion = "derecha";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman window = new Pacman();
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
	public Pacman() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(255, 128, 0));
		frame.getContentPane().add(footer, BorderLayout.SOUTH);
		
		
		tablero.setBackground(Color.BLACK);
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		tablero.setFocusable(true);
		tablero.addKeyListener(this);
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x = tablero.getWidth()/2;
				y = tablero.getHeight()/2;
//				System.out.println(x);
//				System.out.println(y);
				tablero.repaint();
				tablero.requestFocus();
			}
		});
		footer.add(reiniciar);
		
	}
	
	class DrawingPanel extends JPanel{
		public DrawingPanel(){
			setBackground(Color.WHITE);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(Color.YELLOW);
			
			if(bocaAbierta) {
				if(direccion == "derecha") {
					g2d.fillArc(x, y, 30, 30, 45, 270);
				} else if (direccion == "izquierda") {
					g2d.fillArc(x, y, 30, 30, 135, -270);
				} else if (direccion == "arriba") {
					g2d.fillArc(x, y, 30, 30, 135, 270);
				} else if(direccion == "abajo"){
					g2d.fillArc(x, y, 30, 30, 225, -270);
				}
				
			} else {
				g2d.fillOval(x, y, 30, 30);
			}
			
			
		}
	}
	
	//a = 65, d = 68, w = 87, s = 83
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		
		if(e.getKeyCode() == 65) {
			direccion = "izquierda";
			x-=5;
			if(x <= -20) {
				x = tablero.getWidth()-10;
			}
		}
		
		if(e.getKeyCode() == 68) {
			direccion = "derecha";
			x+=5;
			if(x >= tablero.getWidth()-10) {
				x = -20;
			}
		}
		
		if(e.getKeyCode() == 87) {
			direccion = "arriba";
			y-=5;
			if(y <= -20) {
				y = tablero.getHeight()-10;
			}
			
		}
		
		if(e.getKeyCode() == 83) {
			direccion = "abajo";
			y+=5;
			if(y >= tablero.getHeight()-10) {
				y = -20;
			}
		}
		
		bocaAbierta = !bocaAbierta;
		tablero.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
