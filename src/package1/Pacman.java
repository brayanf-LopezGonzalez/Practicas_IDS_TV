package package1;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;

public class Pacman implements KeyListener{

	private JFrame frmPacmantilin;
	
	private List<Player> paredes = new ArrayList<>();
	private List<Player> comida = new ArrayList<>();
	
	DrawingPanel tablero = new DrawingPanel();
	
	private boolean bocaAbierta = true;
	
	private String direccion = "derecha";
	
	private Player pacman;
	
	private int keyCode = 0;
	private int tiempoSegundos = 0;
	private int score = 0;
	
	JLabel labelPuntuacion = new JLabel("Score: " + score);
	JLabel labelTiempo = new JLabel("Tiempo: " + tiempoSegundos + "s");
	
	private Timer controladorTiempo;
	private Timer controladorMovimiento;
	
	private int[][] mapa = {
		    {1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1},
		    {1,2,2,2,2,2,2,1,2,1,2,2,2,2,2,2,1},
		    {1,2,1,1,2,1,2,1,2,1,2,1,2,1,1,2,1},
		    {1,2,1,1,2,1,2,2,2,2,2,1,2,1,1,2,1},
		    {1,2,2,2,2,2,2,1,1,1,2,2,2,2,2,2,1},
		    {1,2,1,1,1,1,2,1,1,1,2,1,1,1,1,2,1},
		    {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
		    {1,1,1,2,1,2,1,1,2,1,1,2,1,2,1,1,1},
		    {0,2,2,2,1,2,1,2,2,2,1,2,1,2,2,2,0},
		    {1,1,1,2,1,2,1,1,1,1,1,2,1,2,1,1,1},
		    {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
		    {1,2,1,1,1,1,2,1,1,1,2,1,1,1,1,2,1},
		    {1,2,2,2,2,2,2,1,0,1,2,2,2,2,2,2,1},
		    {1,2,1,1,2,1,2,2,2,2,2,1,2,1,1,2,1},
		    {1,2,1,1,2,1,2,1,2,1,2,1,2,1,1,2,1},
		    {1,2,2,2,2,2,2,1,2,1,2,2,2,2,2,2,1},
		    {1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1}
		};

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
		
		pacman = new Player(325, 488, 30, 30, Color.YELLOW);
		
		int anchoCelda = pacman.w+10;
		int altoCelda = pacman.h+10;
		
		for (int i = 0; i < mapa.length; i++) {
		    for (int j = 0; j < mapa[0].length; j++) {
		        if (mapa[i][j] == 1) {
		            paredes.add(new Player(j * anchoCelda, i * altoCelda, anchoCelda, altoCelda, Color.BLUE));
		        } else if (mapa[i][j] == 2) {
		        	int xPildora = j * anchoCelda + (anchoCelda - 10) / 2;
		        	int yPildora = i * altoCelda + (altoCelda - 10) / 2;
		        	comida.add(new Player(xPildora, yPildora, 10, 10, Color.white));
		        }
		    }
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPacmantilin = new JFrame();
		frmPacmantilin.setResizable(false);
		frmPacmantilin.setTitle("pacman.tilin");
		frmPacmantilin.setBounds(100, 100, 696, 750);
		frmPacmantilin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPacmantilin.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		frmPacmantilin.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel footer = new JPanel();
		footer.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, new Color(255, 128, 0)));
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
				reiniciarJuego();
			}
		});
		footer.setLayout(new GridLayout(0, 3, 0, 0));
		footer.add(labelPuntuacion);
		
		labelPuntuacion.setForeground(new Color(255, 255, 255));
		labelPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		labelPuntuacion.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 20));
		
//		paredes.add(new Player(280, 130, 5, 300, Color.BLUE));
//		paredes.add(new Player(100, 330, 300, 5, Color.BLUE));
		footer.add(reiniciar);
		footer.add(labelTiempo);
		
		labelTiempo.setForeground(new Color(255, 255, 255));
		labelTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTiempo.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 20));
		
		timers();
			
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
			
			for(Player pildora : comida) {
				g2d.setColor(pildora.c);
				g2d.fillOval(pildora.x, pildora.y, pildora.w, pildora.h);
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
	        	
//	        	System.out.println("colision");
	        	pacman.x = xAnterior;
	        	pacman.y = yAnterior;
	        }
		}
		
		for (int i = 0; i < comida.size(); i++) {
		    Player pildora = comida.get(i);
		    if (pacman.colision(pildora)) {
		    	score+=10;
		    	labelPuntuacion.setText("Score: " + score);
		        comida.remove(i);
		        break;
		    }
		}
		
		ganar();
		
		tablero.repaint();
	}
	
	private void reiniciarJuego() {
	    pacman.x = 325;
	    pacman.y = 488;
	    direccion = "derecha";
	    keyCode = 0;
	    score = 0;
	    tiempoSegundos = 0;
	    labelTiempo.setText("Tiempo: " + tiempoSegundos + "s");
	    labelPuntuacion.setText("Score: " + score);

	    comida.clear();
	    
	    controladorMovimiento.start();
	    controladorTiempo.start();

	    int anchoCelda = pacman.w + 10;
	    int altoCelda = pacman.h + 10;

	    for (int i = 0; i < mapa.length; i++) {
	        for (int j = 0; j < mapa[0].length; j++) {
	            if (mapa[i][j] == 2) {
	                int xPildora = j * anchoCelda + (anchoCelda - 10) / 2;
	                int yPildora = i * altoCelda + (altoCelda - 10) / 2;
	                comida.add(new Player(xPildora, yPildora, 10, 10, Color.white));
	            }
	        }
	    }

	    tablero.repaint();
	    tablero.requestFocus();
	}
	
	private void ganar() {
		if(score >= 1400) {
			controladorTiempo.stop();
			controladorMovimiento.stop();
			
			Object[] opciones = {"Reiniciar"};
			
			String mensaje = "Puntaje: " + score + "\nTiempo: " + tiempoSegundos + "s";
			String titulo = "Ganaste!";
			int opcion = javax.swing.JOptionPane.showOptionDialog(frmPacmantilin, mensaje, titulo, javax.swing.JOptionPane.DEFAULT_OPTION,
			javax.swing.JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones);

			if (opcion == 0) {
				reiniciarJuego();
			}
		}
	}
	
	private void timers() {
		int delay1 = 3;
		ActionListener taskPerformer = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				update();
				
			}
		};
		controladorMovimiento = new Timer(delay1, taskPerformer);
		controladorMovimiento.start();
		
		int delayBoca = 180;
		ActionListener animacionBoca = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bocaAbierta = !bocaAbierta;
				
			}
		};
		new Timer(delayBoca, animacionBoca).start();
		
		int delayTiempo = 1000;
		ActionListener actualizarTiempo = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        tiempoSegundos++;
		        labelTiempo.setText("Tiempo: " + tiempoSegundos + "s");
		    }
		};
		controladorTiempo = new Timer(delayTiempo, actualizarTiempo);
		controladorTiempo.start();
	}

}
