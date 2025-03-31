package package1;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class InterfazPaint extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private ArrayList<Trazo> trazos = new ArrayList<>();
	private ArrayList<Point> puntosActuales = new ArrayList<>();
	private Color colorPincel;
	private String modoDibujo = "Pincel";
	private JSlider slider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazPaint frame = new InterfazPaint();
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
	public InterfazPaint() {
		setResizable(false);
		setTitle("Paind.exe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 602);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel componentes = new JPanel() {
			 @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D g2d = (Graphics2D) g;
	                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	                g2d.setColor(Color.WHITE);
	                g2d.fillRoundRect(5, 5, getWidth() - 5, getHeight() - 5, 20, 20);
	            }
		};
		componentes.setBounds(5, 5, 220, 555);
		
		componentes.setBackground(new Color(255, 255, 255));
		componentes.setBorder(new LineBorder(Color.white, 10, true));
		componentes.setOpaque(false);
		contentPane.add(componentes);
		componentes.setLayout(new GridLayout(4, 1, 5, 5));
		
		JPanel formas = new JPanel();
		formas.setOpaque(false);
		componentes.add(formas);
		formas.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(128, 128, 255)));
		formas.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Formas");
		lblNewLabel.setBounds(0, 2, 200, 25);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		formas.add(lblNewLabel);
		
		//Queria complicarme la vida y dibujar las formas en el mismo boton-
		//Me harte y tuve que recurir a chatGPT pipipi
		
		JToggleButton dibujarRectangulo = new JToggleButton("Rectangulo");					
		dibujarRectangulo.setBounds(40, 26, 125, 23);
		dibujarRectangulo.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		dibujarRectangulo.setOpaque(false);
		//dibujarRectangulo.setContentAreaFilled(false);
		//dibujarRectangulo.setBorderPainted(false);
		dibujarRectangulo.setHorizontalAlignment(JButton.LEFT);
		
		dibujarRectangulo.setIcon(new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
            	Graphics2D g2d = (Graphics2D) g.create();
            	g2d.setStroke(new BasicStroke(2));
                // Dibujar un cuadrado de 20x20 píxeles en la esquina superior izquierda
                g2d.setColor(Color.BLACK);  // Color del cuadrado
                g2d.drawRoundRect(x+1, y+1, 18, 18, 5, 5);  // Dibujar el cuadrado
            }

            public int getIconWidth() {
                return 20;  // Ancho del cuadrado
            }

            public int getIconHeight() {
                return 20;  // Alto del cuadrado
            }
        });
		dibujarRectangulo.addActionListener(e -> modoDibujo = "rectangulo");
		formas.add(dibujarRectangulo);
		
		JToggleButton dibujarCirculo = new JToggleButton("Circulo");
		dibujarCirculo.setBounds(40, 52, 125, 23);
		dibujarCirculo.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		dibujarCirculo.setOpaque(false);
		dibujarCirculo.setHorizontalAlignment(JButton.LEFT);
		
		dibujarCirculo.setIcon(new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
            	Graphics2D g2d = (Graphics2D) g.create();
            	g2d.setStroke(new BasicStroke(2));
                // Dibujar un cuadrado de 20x20 píxeles en la esquina superior izquierda
                g2d.setColor(Color.BLACK);  // Color del cuadrado
                g2d.drawOval(x+1, y+1, 18, 18);  // Dibujar el cuadrado
            }
            
            public int getIconWidth() {
                return 20;  // Ancho del cuadrado
            }

            public int getIconHeight() {
                return 20;  // Alto del cuadrado
            }
        });
		dibujarCirculo.addActionListener(e -> modoDibujo = "circulo");
		formas.add(dibujarCirculo);
		
		JToggleButton dibujarTriangulo = new JToggleButton("Triangulo");
		dibujarTriangulo.setBounds(40, 77, 125, 23);
		dibujarTriangulo.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		dibujarTriangulo.setOpaque(false);
		dibujarTriangulo.setHorizontalAlignment(JButton.LEFT);
		dibujarTriangulo.setIcon(new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
            	Graphics2D g2d = (Graphics2D) g.create();
            	g2d.setStroke(new BasicStroke(2));
            	
                int[] xPoints = {x, x + 10, x + 20};  // Coordenadas x de los tres vértices
                int[] yPoints = {y + 15, y, y + 15};  // Coordenadas y de los tres vértices

                // Establecer el color de relleno del triángulo
                g2d.setColor(Color.BLACK);
                g2d.drawPolygon(xPoints, yPoints, 3);  // Dibuja el triángulo relleno
            }

            @Override
            public int getIconWidth() {
                return 20;  // Ancho del triángulo
            }

            @Override
            public int getIconHeight() {
                return 20;  // Alto del triángulo
            }
        });
		dibujarTriangulo.addActionListener(e -> modoDibujo = "triangulo");
		formas.add(dibujarTriangulo);
		
		JToggleButton dibujarLinea = new JToggleButton("Linea");
		dibujarLinea.setBounds(40, 102, 125, 23);
		dibujarLinea.setOpaque(false);
		dibujarLinea.setHorizontalAlignment(SwingConstants.LEFT);
		dibujarLinea.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		dibujarLinea.setIcon(new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
            	Graphics2D g2d = (Graphics2D) g.create();
            	g2d.setStroke(new BasicStroke(2));
            	
                g2d.setColor(Color.BLACK);
                g2d.drawLine(x,y+10,x+15,y+10);
            }

            @Override
            public int getIconWidth() {
                return 20;
            }

            @Override
            public int getIconHeight() {
                return 20;
            }
        });
		dibujarLinea.addActionListener(e -> modoDibujo = "linea");
		formas.add(dibujarLinea);
		
		
		JPanel opciones = new JPanel();
		opciones.setOpaque(false);
		componentes.add(opciones);
		opciones.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.WHITE));
		opciones.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		opciones.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JRadioButton relleno = new JRadioButton("");
		relleno.setBounds(46, 57, 20, 20);
		relleno.setOpaque(false);
		panel.add(relleno);
		
		JLabel lblColorDeRelleno = new JLabel("Color de relleno");
		lblColorDeRelleno.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblColorDeRelleno.setBounds(72, 57, 99, 31);
		panel.add(lblColorDeRelleno);
		
		JToggleButton botonPincel = new JToggleButton("Pincel");
		botonPincel.setBounds(47, 0, 115, 21);
		botonPincel.addActionListener(e -> {
		    modoDibujo = "pincel";
		});
		panel.add(botonPincel);
		
		JToggleButton botonBorrador = new JToggleButton("Borrador");
		botonBorrador.setBounds(47, 31, 115, 21);
		botonBorrador.addActionListener(e -> {
		    modoDibujo = "borrador";
		    colorPincel = Color.WHITE;
		});
		panel.add(botonBorrador);
		
		botonPincel.setSelected(true);
		modoDibujo = "pincel";
		colorPincel = Color.BLACK;
		
		ButtonGroup grupoHerramientas = new ButtonGroup();
		grupoHerramientas.add(dibujarCirculo);
		grupoHerramientas.add(dibujarLinea);
		grupoHerramientas.add(dibujarTriangulo);
		grupoHerramientas.add(dibujarRectangulo);
		grupoHerramientas.add(botonPincel);
		grupoHerramientas.add(botonBorrador);
		
		
		JLabel lblNewLabel_1 = new JLabel("Opciones");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		opciones.add(lblNewLabel_1, BorderLayout.NORTH);
		
		this.slider = new JSlider(1,20);
		slider.setSnapToTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setValue(1);
		slider.setOpaque(false);
		slider.setPaintTicks(true);
		opciones.add(slider, BorderLayout.SOUTH);
		
		JPanel colores = new JPanel();
		colores.setOpaque(false);
		colores.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(128, 128, 255)));
		componentes.add(colores);
		colores.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Colores");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		lblNewLabel_2.setBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, Color.WHITE));
		colores.add(lblNewLabel_2, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		colores.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		LienzoPanel lienzo = new LienzoPanel(trazos);
		lienzo.setBounds(251, 5, 633, 555);
		contentPane.add(lienzo);
		lienzo.setLayout(null);
		
		JRadioButton botonRojo = crearRadioButton(Color.RED);
		botonRojo.addActionListener(e -> {
		    if (modoDibujo.equals("pincel")) {
		        colorPincel = Color.RED;
		    }
		});
		botonRojo.setOpaque(false);
		botonRojo.setBounds(15, 37, 26, 26);
		panel_1.add(botonRojo);
		
		JRadioButton botonAzul = crearRadioButton(Color.BLUE);
		botonAzul.addActionListener(e -> {
		    if (modoDibujo.equals("pincel")) {
		        colorPincel = Color.BLUE;
		    }
		});
		botonAzul.setOpaque(false);
		botonAzul.setBounds(56, 37, 26, 26);
		panel_1.add(botonAzul);
		
		JRadioButton botonAmarillo = crearRadioButton(Color.YELLOW);
		botonAmarillo.addActionListener(e -> {
		    if (modoDibujo.equals("pincel")) {
		        colorPincel = Color.YELLOW;
		    }
		});
		botonAmarillo.setOpaque(false);
		botonAmarillo.setBounds(93, 37, 26, 26);
		panel_1.add(botonAmarillo);
		
		JRadioButton botonVerde = crearRadioButton(Color.GREEN);
		botonVerde.addActionListener(e -> {
		    if (modoDibujo.equals("pincel")) {
		        colorPincel = Color.GREEN;
		    }
		});
		botonVerde.setOpaque(false);
		botonVerde.setBounds(130, 37, 26, 26);
		panel_1.add(botonVerde);
		
		JRadioButton botonNegro = crearRadioButton(Color.BLACK);
		botonNegro.addActionListener(e -> {
		    if (modoDibujo.equals("pincel")) {
		        colorPincel = Color.BLACK;
		    }
		});
		botonNegro.setOpaque(false);
		botonNegro.setBounds(163, 37, 26, 26);
		botonNegro.setSelected(true);
		panel_1.add(botonNegro);
		
		ButtonGroup grupo1 = new ButtonGroup();	
		grupo1.add(botonRojo);
		grupo1.add(botonAzul);
		grupo1.add(botonAmarillo);
		grupo1.add(botonVerde);
		grupo1.add(botonNegro);
		
		JPanel archivoPaint = new JPanel();
		archivoPaint.setOpaque(false);
		componentes.add(archivoPaint);
		archivoPaint.setLayout(null);
		
		JButton limpiarCanvas = new JButton("Limpiar Canvas");
		limpiarCanvas.addActionListener(new ActionListener() {
			
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        trazos.clear();
		        lienzo.repaint();
		    }
		});
		limpiarCanvas.setOpaque(false);
		limpiarCanvas.setHorizontalAlignment(SwingConstants.CENTER);
		limpiarCanvas.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		limpiarCanvas.setContentAreaFilled(false);
		
		limpiarCanvas.setBounds(27, 10, 146, 39);
		archivoPaint.add(limpiarCanvas);
		
		JButton guardarImagen = new JButton("Guardar como imagen");
		guardarImagen.setForeground(new Color(255, 255, 255));
		guardarImagen.setHorizontalAlignment(SwingConstants.CENTER);
		guardarImagen.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		guardarImagen.setBackground(new Color(128, 128, 255));
		guardarImagen.setBounds(10, 68, 180, 39);
		archivoPaint.add(guardarImagen);
		
	}
	
	//Aqui tambien queria que se mirara mamalon el RadioButton sin necesidad de texto
	//para señalar el color, pero no encontre como hacerlo y recurri a ChatGPT de nuevo, modificando algunas cosas
	
	// Método para crear un radio button con un color específico para la parte seleccionable
    public static JRadioButton crearRadioButton(Color color) {
        JRadioButton radioButton = new JRadioButton();
        radioButton.setIcon(new CustomRadioButtonIcon(color));  // Asignar el icono personalizado
        radioButton.setSelectedIcon(new CustomRadioButtonIcon(color));  // Asignar el icono cuando está seleccionado
        radioButton.setOpaque(false);  // No hacer opaco el fondo para que el color se vea en el icono
        radioButton.setBorderPainted(false); // Evitar que el borde predeterminado se pinte
        return radioButton;
    }

    // Clase que personaliza el icono del RadioButton
    static class CustomRadioButtonIcon implements Icon {
        private final Color color;  // Color que se utilizará para la parte seleccionable

        // Constructor que recibe el color
        public CustomRadioButtonIcon(Color color) {
            this.color = color;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            JRadioButton radioButton = (JRadioButton) c;
            int size = getIconWidth();  // Tamaño del icono

            // Dibujar el borde del círculo (parte no seleccionada)
            g.setColor(Color.WHITE);  // Siempre usar borde negro
            g.drawOval(x, y, size, size);  // Dibujar el borde del círculo

            // Siempre dibujar el círculo con el color asignado
            g.setColor(color);  // Color del círculo (siempre el color asignado)
            g.fillOval(x + 2, y + 2, size - 4, size - 4);  // Rellenar el círculo con el color

            // Si el botón está seleccionado, agregar un borde negro más grueso
            if (radioButton.isSelected()) {
                g.setColor(Color.BLACK);
                ((Graphics2D) g).setStroke(new BasicStroke(2));  // Borde más grueso cuando está seleccionado
                g.drawOval(x, y, size, size);  // Dibuja el borde grueso
            }
        }

        @Override
        public int getIconWidth() {
            return 20;  // Ancho del círculo
        }

        @Override
        public int getIconHeight() {
            return 20;  // Alto del círculo
        }
    }
    
    private class LienzoPanel extends JPanel {
        private static final long serialVersionUID = 1L;
        
        private ArrayList<Trazo> trazos;

        public LienzoPanel(ArrayList<Trazo> trazos) {
        	
        	this.trazos = trazos;
            this.setBackground(Color.WHITE);
            this.addMouseListener(new MouseAdapter() {
            	
            	@Override
            	public void mousePressed(MouseEvent e) {
            	    Point puntoClick = e.getPoint();
            	    float grosorActual = (float) slider.getValue();
            	    
            	    switch (modoDibujo) {
            	    
            	        case "pincel":
            	        case "borrador":
            	            // Para trazos libres (pincel/borrador)
            	            puntosActuales = new ArrayList<>();
            	            puntosActuales.add(puntoClick);
            	            trazos.add(new Trazo(
            	                modoDibujo.equals("borrador") ? Color.WHITE : colorPincel,
            	                grosorActual
            	            ));
            	            break;
            	            
            	        case "rectangulo":
            	        case "circulo":
            	        case "triangulo":
            	        case "linea":
            	            // Para figuras con tamaño predefinido
            	            trazos.add(new TrazoFigura(colorPincel, grosorActual, modoDibujo, puntoClick, 100, 100));
            	            break;
            	    }
            	    repaint();
            	}

                @Override
                public void mouseReleased(MouseEvent e) {
                	
                	if (puntosActuales != null && !puntosActuales.isEmpty()) {
                		
                        Trazo ultimoTrazo = trazos.get(trazos.size() - 1);
                        ultimoTrazo.puntos = new ArrayList<>(puntosActuales);
                        puntosActuales.clear();
                    }
                    repaint();
                	
                }
            });

            this.addMouseMotionListener(new MouseAdapter() {
            	
                @Override
                public void mouseDragged(MouseEvent e) {
                	if (puntosActuales != null) {
                		
                        puntosActuales.add(e.getPoint());
                        Trazo ultimoTrazo = trazos.get(trazos.size() - 1);
                        ultimoTrazo.puntos = new ArrayList<>(puntosActuales);
                        repaint();
                    }
                }
            });
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, getWidth(), getHeight());
            
            for (Trazo trazo : trazos) {
                g2d.setColor(trazo.color);
                g2d.setStroke(new BasicStroke(trazo.grosor));

                if (trazo instanceof TrazoFigura) {
                    //dibujo de figuras
                    TrazoFigura figura = (TrazoFigura) trazo;
                    Point inicio = figura.puntoInicio;
                    int ancho = figura.ancho;
                    int alto = figura.alto;

                    switch (figura.tipoFigura) {
                        case "rectangulo":
                        	g2d.drawRect(inicio.x, inicio.y, ancho, alto);
                        	break;
                            
                        case "circulo":
                            g2d.drawOval(inicio.x, inicio.y, ancho, alto);
                            break;
                            
                        case "triangulo":
                            int[] xPoints = {inicio.x, inicio.x + ancho, inicio.x + ancho/2};
                            int[] yPoints = {inicio.y + alto, inicio.y + alto, inicio.y};
                            g2d.drawPolygon(xPoints, yPoints, 3);
                            break;
                            
                        case "linea":
                            g2d.drawLine(inicio.x, inicio.y, inicio.x + ancho, inicio.y);
                            break;
                    }
                } else {
                    
                    for (int i = 0; i < trazo.puntos.size() - 1; i++) {
                        Point p1 = trazo.puntos.get(i);
                        Point p2 = trazo.puntos.get(i + 1);
                        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }
            }
        }
    }
	
    private class Trazo {
        ArrayList<Point> puntos;
        Color color;
        float grosor;
        
        Trazo(Color color, float grosor) {
            this.puntos = new ArrayList<>();
            this.color = color;
            this.grosor = grosor;
        }
    }
    
    private class TrazoFigura extends Trazo {
        String tipoFigura;
        Point puntoInicio;
        int ancho;
        int alto;
        
        TrazoFigura(Color color, float grosor, String tipoFigura, Point puntoInicio, int ancho, int alto) {
            super(color, grosor);
            this.tipoFigura = tipoFigura;
            this.puntoInicio = puntoInicio;
            this.ancho = ancho;
            this.alto = alto;
        }
    }
    
}


