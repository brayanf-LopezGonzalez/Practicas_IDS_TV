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
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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

public class InterfazPaint extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		formas.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Formas");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		formas.add(lblNewLabel);
		
		//Queria complicarme la vida y dibujar las formas en el mismo boton-
		//Me harte y tuve que recurir a chatGPT pipipi
		
		JButton dibujarRectangulo = new JButton("Rectangulo");					
		dibujarRectangulo.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		dibujarRectangulo.setOpaque(false);
		dibujarRectangulo.setContentAreaFilled(false);
		dibujarRectangulo.setBorderPainted(false);
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
		formas.add(dibujarRectangulo);
		
		JButton dibujarCirculo = new JButton("Circulo");
		dibujarCirculo.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		dibujarCirculo.setOpaque(false);
		dibujarCirculo.setContentAreaFilled(false);
		dibujarCirculo.setBorderPainted(false);
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
		formas.add(dibujarCirculo);
		
		JButton dibujarTriangulo = new JButton("Triangulo");
		dibujarTriangulo.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		dibujarTriangulo.setOpaque(false);
		dibujarTriangulo.setContentAreaFilled(false);
		dibujarTriangulo.setBorderPainted(false);
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
		formas.add(dibujarTriangulo);
		
		
		
		JPanel opciones = new JPanel();
		opciones.setOpaque(false);
		componentes.add(opciones);
		opciones.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.WHITE));
		opciones.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		opciones.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton botonPincel = new JButton("Pincel");
		botonPincel.setOpaque(false);
		botonPincel.setHorizontalAlignment(SwingConstants.LEFT);
		botonPincel.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		botonPincel.setContentAreaFilled(false);
		botonPincel.setBorderPainted(false);
		botonPincel.setBounds(0, 6, 87, 25);
		panel.add(botonPincel);
		
		JButton botonBorrador = new JButton("Borrador");
		botonBorrador.setOpaque(false);
		botonBorrador.setHorizontalAlignment(SwingConstants.LEFT);
		botonBorrador.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		botonBorrador.setContentAreaFilled(false);
		botonBorrador.setBorderPainted(false);
		botonBorrador.setBounds(0, 29, 99, 25);
		panel.add(botonBorrador);
		
		JRadioButton relleno = new JRadioButton("");
		relleno.setBounds(10, 58, 20, 20);
		relleno.setOpaque(false);
		panel.add(relleno);
		
		JLabel lblColorDeRelleno = new JLabel("Color de relleno");
		lblColorDeRelleno.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblColorDeRelleno.setBounds(35, 54, 99, 33);
		panel.add(lblColorDeRelleno);
		
		JLabel lblNewLabel_1 = new JLabel("Opciones");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		opciones.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JSlider slider = new JSlider(5,100);
		slider.setSnapToTicks(true);
		slider.setMajorTickSpacing(5);
		slider.setValue(5);
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
		
		JRadioButton botonRojo = crearRadioButton(Color.RED);
		botonRojo.setOpaque(false);
		botonRojo.setBounds(15, 37, 26, 26);
		panel_1.add(botonRojo);
		
		JRadioButton botonAzul = crearRadioButton(Color.BLUE);
		botonAzul.setOpaque(false);
		botonAzul.setBounds(56, 37, 26, 26);
		panel_1.add(botonAzul);
		
		JRadioButton botonAmarillo = crearRadioButton(Color.YELLOW);
		botonAmarillo.setOpaque(false);
		botonAmarillo.setBounds(93, 37, 26, 26);
		panel_1.add(botonAmarillo);
		
		JRadioButton botonVerde = crearRadioButton(Color.GREEN);
		botonVerde.setOpaque(false);
		botonVerde.setBounds(130, 37, 26, 26);
		panel_1.add(botonVerde);
		
		JRadioButton botonNegro = crearRadioButton(Color.BLACK);
		botonNegro.setOpaque(false);
		botonNegro.setBounds(163, 37, 26, 26);
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
		
		JButton crearCanvas = new JButton("Crear Canvas");
		crearCanvas.setOpaque(false);
		crearCanvas.setHorizontalAlignment(SwingConstants.CENTER);
		crearCanvas.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		crearCanvas.setContentAreaFilled(false);
		
		crearCanvas.setBounds(27, 10, 146, 39);
		archivoPaint.add(crearCanvas);
		
		JButton guardarImagen = new JButton("Guardar como imagen");
		guardarImagen.setForeground(new Color(255, 255, 255));
		guardarImagen.setHorizontalAlignment(SwingConstants.CENTER);
		guardarImagen.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		guardarImagen.setBackground(new Color(128, 128, 255));
		guardarImagen.setBounds(10, 68, 180, 39);
		archivoPaint.add(guardarImagen);
		
		JPanel lienzo = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2d.setColor(Color.WHITE);
                g2d.fillRoundRect(5, 5, getWidth() - 5, getHeight() - 5, 20, 20);
			}
		};
		lienzo.setOpaque(false);
		lienzo.setBorder(new LineBorder(Color.white, 10, true));
		lienzo.setBackground(Color.WHITE);
		lienzo.setBounds(251, 5, 633, 555);
		contentPane.add(lienzo);
		lienzo.setLayout(new GridLayout(4, 1, 5, 5));
		
		this.repaint();
		this.revalidate();
	}
	
	//Aqui tambien queria que se mirara mamalon el RadioButton sin necesidad de texto
	//para señalar el color, pero no encontre como hacerlo y recurri a ChatGPT de nuevo modificando algunas cosas
	
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
	
}
