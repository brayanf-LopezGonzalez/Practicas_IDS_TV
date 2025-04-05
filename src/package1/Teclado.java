package package1;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class Teclado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JLabel[] labels = new JLabel[27];
	private char[] letras = new char[27];
	private Color[] colores = {
			new Color(240, 128, 128),
            new Color(72, 209, 204),
            new Color(123, 104, 238),
            new Color(255, 105, 180),
            new Color(60, 179, 113),
            new Color(255, 160, 122),
            new Color(147, 112, 219),
            new Color(210, 105, 30),
            new Color(70, 130, 180)
	};
	private Set<Integer> pressedKeys = new HashSet<>(); // Para registrar teclas presionadas
	private int aux = 0;
	private List<String> palabras = ListaDePalabras.obtener100Palabras();
    private Random random = new Random();
    private long empezarContador;
    private boolean tiempoTranscurriendo = false;
    private JLabel labelContador = new JLabel("Tiempo: 0.00s");
    
    JLabel pizarron = new JLabel();
    JLabel pantalla = new JLabel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado frame = new Teclado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teclado() {
		setTitle("Teclado Digital");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.gray));
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.gray);
		panel_2.setBorder(BorderFactory.createMatteBorder(0, 40, 0, 40, Color.gray));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 2, 20, 20));
		
		JLabel labelEspacio = new JLabel("Espacio");
		labelEspacio.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		labelEspacio.setForeground(new Color(255, 255, 255));
		labelEspacio.setOpaque(true);
		labelEspacio.setBackground(Color.BLACK);
		labelEspacio.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(labelEspacio);
		
		JLabel labelBorrando = new JLabel("Borrando");
		labelBorrando.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		labelBorrando.setForeground(new Color(255, 255, 255));
		labelBorrando.setOpaque(true);
		labelBorrando.setBackground(Color.BLACK);
		labelBorrando.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(labelBorrando);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setBackground(Color.gray);
		panel_1.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.gray));
		panel_1.setLayout(new GridLayout(3, 9, 10, 10));
		
		JPanel panel_3 = new JPanel();
		
		panel_3.setBackground(Color.WHITE);
		contentPane.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(2, 2, 0, 0));
		panel_3.setBorder(BorderFactory.createMatteBorder(20, 10, 20, 10, Color.white));
		
		pantalla.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		pantalla.setOpaque(true);
		pantalla.setBackground(Color.BLACK);
		pantalla.setForeground(Color.WHITE);
		pantalla.setHorizontalAlignment(SwingConstants.CENTER);
		pantalla.setBorder(new LineBorder(Color.BLACK, 1));
		panel_3.add(pantalla);
		
		labelContador.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		labelContador.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(labelContador);
		mostrarPalabraAleatoria();
		
		//textField = new JTextField();
		pizarron.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		pizarron.setHorizontalAlignment(JLabel.CENTER);
		pizarron.setBorder(new LineBorder(Color.BLACK, 1));
		pizarron.setOpaque(true);
		pizarron.setBackground(Color.LIGHT_GRAY);
		panel_3.add(pizarron);
		
		for(int i = 0; i < 27; i++) {
			
			if(i < 14) {
		        labels[i] = new JLabel("" + (char)('A' + i));
		        letras[i] = (char)('A' + i);
		    } else if(i == 14) {
		        labels[i] = new JLabel("Ñ");
		        letras[i] = 'Ñ';
		    } else {
		        labels[i] = new JLabel("" + (char)('A' + i - 1));
		        letras[i] = (char)('A' + i - 1);
		    }
			labels[i].setHorizontalAlignment(SwingConstants.CENTER);
			labels[i].setBorder(BorderFactory.createMatteBorder(25, 0, 25, 0, Color.gray));
			labels[i].setOpaque(true);
			labels[i].setBackground(Color.BLACK);
			labels[i].setForeground(Color.WHITE);
			labels[i].setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
			
			panel_1.add(labels[i]);
			
		}
		
		setFocusable(true);
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {

				if (e.getKeyChar() != 8) {
		            pizarron.setText(pizarron.getText() + e.getKeyChar());
		            verificarPalabra();
				}
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				System.out.println(e.getKeyChar());
				
				for (JLabel label : labels) {
                    label.setBackground(Color.BLACK);
                    labelEspacio.setBackground(Color.BLACK);
                    labelBorrando.setBackground(Color.BLACK);
                }
				pressedKeys.remove(e.getKeyCode());//Remueve la tecla presionada anteriormente
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (!pressedKeys.contains(e.getKeyCode())) {
					pressedKeys.add(e.getKeyCode()); //Registrar la tecla presionada para evitar el cambio de color al mantener
                    
					if (e.getKeyCode() == 8) {
		                if (!pizarron.getText().isEmpty()) {
		                    String textoActual = pizarron.getText();
		                    pizarron.setText(textoActual.substring(0, textoActual.length() - 1));
		                    verificarPalabra();
		                }
		                labelBorrando.setBackground(colores[aux]);
		                aux = (aux + 1) % colores.length;
		                return;
		            }
					
                    for (int i = 0; i < letras.length; i++) {
                    	
                    	if (e.getKeyCode() == 32) {
                    		
                    		pizarron.setText(pizarron.getText() + "");
                    		
                    		if(aux < colores.length) {
                    			labelEspacio.setBackground(colores[aux]);
                    			
                    		}else {
                    			labelEspacio.setBackground(colores[aux]);
                    		}
                    		break;
                    		
                    	} else if (e.getKeyCode() == 8) {
                    		labelBorrando.setBackground(colores[aux]);
                    		String textoActual = pizarron.getText();
                    		
                            if (!textoActual.isEmpty()) {
                            	pizarron.setText(textoActual.substring(0, textoActual.length() - 1));
                            }
                    	}
                    	
                    	if (letras[i] == Character.toUpperCase(e.getKeyChar())) {
                    		if(aux < colores.length) {
                    			labels[i].setBackground(colores[aux]);
                    			
                    		}else {
                    			labels[i].setBackground(colores[aux]);
                    		}
                    		break;
                    		
                    	}
                    	aux = (aux + 1) % colores.length;//Reinicia aux (para empezar el arreglo de colores desde el inicio)
                    }
				}
			}
		});
	}
	
	
	public class ListaDePalabras {
	    public static List<String> obtener100Palabras() {
	        return new ArrayList<>(Arrays.asList(
	        		"Piloto", "Titan", "Ronin", "Legion", "Vanguardia", "Omniman", "Mark", "Nolan", "Debbie", "Robot",
	                "Grapplin", "Salto", "Fase", "Nucleo", "Astartes", "Sniper", "Milicia", "Ion", "Tone", "Northstar",
	                "HORUS", "IMPERIO", "CAOS", "BOLTER", "PRIMARCA", "EXTERMINATUS", "TITANIC", "ESTUS", "KINDLING", "GWYN",
	                "NITO", "ORO", "LUNA", "SEN", "HOLYTERRA", "PLAGAMARINE", "SACERDOTE", "ANILLO", "GARGOlA", "SOLAIRE",
	                "knight", "hornet", "mascara", "sueño", "clavo", "geo", "infectado", "vacio", "radiancia", "cuerno",
	                "pañuelo", "saltamontes", "angeles", "señor", "lagrima", "sombra", "ciudad", "reina", "nido", "cruzada",
	                "Spartan", "gUardian", "vIajero", "WhyverN", "bRuto", "eLite", "cAbal", "CAballO", "tOrreta", "nAve",
	                "eScudo", "aRmadura", "jUggernaut", "eSpada", "cAmpo", "fLota", "pRofeta", "CodEx", "cAñon", "dReadNougHT",
	                "pICO", "eNcAntAr", "rEdStOne", "cReEpeR", "eNdErDrAgOn", "nEtHeR", "aLdEaNo", "bLoQuE", "aRmAdUra", "hErRaMieNta",
	                "zOmBiE", "eXpLoSiVo", "AzUCAR", "Flecha", "FulgrIM", "mInErAl", "bRuJuLa", "AlpHarius", "vIlLaNo", "bOsQuE"    
	        ));
	    }
	}
	
	private void mostrarPalabraAleatoria() {
        String palabraAleatoria = palabras.get(random.nextInt(palabras.size()));
        pantalla.setText("Escribe: " + palabraAleatoria);
        pantalla.setForeground(Color.WHITE);
        empezarContador();
    }
	
	private void verificarPalabra() {
	    String palabraObjetivo = pantalla.getText().replace("Escribe: ", "");//Elimina el Escribe del texto extraido
	    String textoIngresado = pizarron.getText();
	    
	    for (int i = 0; i < textoIngresado.length(); i++) {
	    	
	    	char letraIngresada = textoIngresado.charAt(i);
	        char letraObjetivo = palabraObjetivo.charAt(i);
	    	
	        if (i >= palabraObjetivo.length()) {//Verificacion para ver si la palabra ingresada es mas grande que la objetivo
	        	pantalla.setForeground(Color.RED);
	            return;
	        }
	        
	        if (letraIngresada != letraObjetivo) {//Verificaciones para cada letra
	        	pantalla.setForeground(Color.RED);
	            return;
	        } else if (letraIngresada == letraObjetivo) {
	        	pantalla.setForeground(Color.GREEN);
	        }
	    }
	    
	    if (textoIngresado.equals(palabraObjetivo)) {//Verifica la palabra completa
	    	detenerTimer();
	    	double tiempo = (System.currentTimeMillis() - empezarContador) / 1000.0;
	    	Object[] opciones = {"Siguiente"};
	    	JOptionPane.showOptionDialog(this, "¡CORRECTO!", "Tiempo: " + String.format("%.2f", tiempo)+" segundos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
	    	
	    	pantalla.setForeground(Color.GREEN);
	        mostrarPalabraAleatoria();
	        pizarron.setText("");
	    }
	}
	
	private void empezarContador() {
		empezarContador = System.currentTimeMillis();
		tiempoTranscurriendo = true;
		actualizarTimer();
	}
	
	private void detenerTimer() {
		tiempoTranscurriendo = false;
	}
	
	private void actualizarTimer() {
		if(tiempoTranscurriendo) {
			long tiempoActual = System.currentTimeMillis();
			double tiempo = (tiempoActual - empezarContador)/1000.0;
			labelContador.setText(String.format("Tiempo: %.2fs", tiempo));
			
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					EventQueue.invokeLater(() -> actualizarTimer());
				}
			}, 100);
		}
	}
	
	
}
