package package1;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;

public class Pacman implements KeyListener{

	private JFrame frmPacmantilin;
	DrawingPanel tablero = new DrawingPanel();
	private boolean bocaAbierta = true;
	private String direccion = "derecha";
	private List<Player> paredes = new ArrayList<>();
	private Player pacman;
	private int keyCode = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman window = new Pacman();
					window.frmPacmantilin.setVisible(true);
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
		pacman = new Player(343, 358, 30, 30, Color.YELLOW);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPacmantilin = new JFrame();
		frmPacmantilin.setTitle("pacman.tilin");
		frmPacmantilin.setBounds(100, 100, 700, 800);
		frmPacmantilin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPacmantilin.getContentPane().setLayout(new BorderLayout(0, 0));
		
		try {
	        InputStream pacmanIcon = getClass().getResourceAsStream("/icono.png");
	        if (pacmanIcon != null) {
	        	frmPacmantilin.setIconImage(ImageIO.read(pacmanIcon));
	        }
	    } catch (IOException e) {
	    
	    }
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		frmPacmantilin.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(255, 128, 0));
		frmPacmantilin.getContentPane().add(footer, BorderLayout.SOUTH);
		
		
		tablero.setBackground(Color.BLACK);
		frmPacmantilin.getContentPane().add(tablero, BorderLayout.CENTER);
		tablero.setFocusable(true);
		tablero.addKeyListener(this);
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pacman.x = tablero.getWidth()/2;
				pacman.y = tablero.getHeight()/2;
				System.out.println(pacman.x);
				System.out.println(pacman.y);
				tablero.repaint();
				tablero.requestFocus();
			}
		});
		
		paredes.add(new Player(280, 130, 5, 300, Color.BLUE));
		paredes.add(new Player(100, 330, 300, 5, Color.BLUE));
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
					g2d.fillArc(pacman.x, pacman.y, pacman.w, pacman.h, 45, 270);
				} else if (direccion == "izquierda") {
					g2d.fillArc(pacman.x, pacman.y, pacman.w, pacman.h, 135, -270);
				} else if (direccion == "arriba") {
					g2d.fillArc(pacman.x, pacman.y, pacman.w, pacman.h, 135, 270);
				} else if(direccion == "abajo"){
					g2d.fillArc(pacman.x, pacman.y, pacman.w, pacman.h, 225, -270);
				}
				
			} else {
				g2d.fillOval(pacman.x, pacman.y, pacman.w, pacman.h);
			}
			
			for(Player pared : paredes) {
		        g2d.setColor(pared.c);
		        g2d.fillRect(pared.x, pared.y, pared.w, pared.h);
		        
		        
		    }
			
			
		}
	}
	
	//a = 65, d = 68, w = 87, s = 83
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		keyCode = e.getKeyCode();
		update();
		bocaAbierta = !bocaAbierta;
		tablero.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	class Player{
		
		int x,y,w,h;
		Color c;
		
		public Player(int x, int y, int w, int h, Color c) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;
			
		}
		
		public boolean colision(Player target) {
			if(this.x < target.x + target.w &&

					this.x + this.w > target.x &&

					this.y < target.y + target.h &&

					this.y + this.h > target.y) {

					return true;

					}
			return false;
		}
	}
	
	public void update(){
		int xAnterior = pacman.x;
		int yAnterior = pacman.y;
		
		//------------------------------------------------
		if(keyCode == 65) {
			direccion = "izquierda";
			pacman.x-=1;
			
			if(pacman.x <= -20) {
				pacman.x = tablero.getWidth()-10;
			}
		}
		//------------------------------------------------
		if(keyCode == 68) {
			direccion = "derecha";
			pacman.x+=1;
			
			if(pacman.x >= tablero.getWidth()-10) {
				pacman.x = -20;
			}
		}
		//------------------------------------------------
		if(keyCode == 87) {
			direccion = "arriba";
			pacman.y-=1;
			
			if(pacman.y <= -20) {
				pacman.y = tablero.getHeight()-10;
			}
			
		}
		//------------------------------------------------
		if(keyCode == 83) {
			direccion = "abajo";
			pacman.y+=1;
			
			if(pacman.y >= tablero.getHeight()-10) {
				pacman.y = -20;
			}
			
		}
		//------------------------------------------------
		
		for(Player pared : paredes) {
	        if(pacman.colision(pared)) {
	        	
	        	System.out.println("colision");
	        	pacman.x = xAnterior;
	        	pacman.y = yAnterior;
	        }
		}
	}

}
