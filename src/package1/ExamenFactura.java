package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JEditorPane;
import java.awt.Canvas;
import java.awt.Checkbox;

public class ExamenFactura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtJhonDoe;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamenFactura frame = new ExamenFactura();
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
	public ExamenFactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 646, 671);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("         Factura en Java - Eclipse - Arraylist y POO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setBounds(0, 0, 637, 50);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 81, 637, 553);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel_1.setBounds(10, 20, 615, 87);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(21, 20, 81, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Direccion:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(21, 50, 81, 20);
		panel_1.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setText("123456");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(96, 20, 194, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 #123");
		txtCalle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCalle.setColumns(10);
		txtCalle.setBounds(96, 50, 194, 21);
		panel_1.add(txtCalle);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombres:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(322, 20, 81, 20);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Telefono:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_3.setBounds(322, 50, 81, 20);
		panel_1.add(lblNewLabel_2_3);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("Jhon Doe");
		txtJhonDoe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtJhonDoe.setColumns(10);
		txtJhonDoe.setBounds(390, 20, 194, 21);
		panel_1.add(txtJhonDoe);
		
		textField_3 = new JTextField();
		textField_3.setText("5554433");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(390, 50, 194, 21);
		panel_1.add(textField_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setOpaque(false);
		panel_1_1.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel_1_1.setBounds(10, 116, 615, 87);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("N° Factura:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(85, 34, 81, 20);
		panel_1_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Fecha:");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(329, 35, 81, 20);
		panel_1_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("1");
		lblNewLabel_2_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4_1.setBounds(169, 34, 81, 20);
		panel_1_1.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("2021/50/21");
		lblNewLabel_2_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4_2.setBounds(398, 34, 108, 20);
		panel_1_1.add(lblNewLabel_2_4_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setOpaque(false);
		panel_1_1_1.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel_1_1_1.setBounds(10, 211, 615, 47);
		panel.add(panel_1_1_1);
		
		JButton btnNewButton = new JButton("Ver lista de facturas");
		ImageIcon icono_1 = new ImageIcon("imagenes/lista.png");
		Image escalable_1 = icono_1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(escalable_1));
		btnNewButton.setBounds(10, 10, 179, 27);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		panel_1_1_1.add(btnNewButton);
		
		JButton btnAgregar = new JButton("Agregar") {
			@Override
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            
	            Graphics2D g2d = (Graphics2D) g.create();
	            
	            try {
	            	
	                BufferedImage img = ImageIO.read(new File("imagenes/agregarMas.png"));
	                g2d.drawImage(img, 5, 7, 15, 15, this);
	               
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            
	        }
		};
		btnAgregar.setContentAreaFilled(false);
		btnAgregar.setBorderPainted(false);
		btnAgregar.setBounds(404, 10, 90, 27);
		panel_1_1_1.add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar") {
				@Override
		        protected void paintComponent(Graphics g) {
		            super.paintComponent(g);
		            
		            Graphics2D g2d = (Graphics2D) g.create();
		            
		            try {
		            	
		                BufferedImage img = ImageIO.read(new File("imagenes/cancelar.png"));
		                g2d.drawImage(img, 5, 7, 15, 15, this);
		               
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		            
				}
		};
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBounds(515, 10, 90, 27);
		panel_1_1_1.add(btnEliminar);
		
		String[][] datos = {
		            {"Producto", "Cantidad", "Valor", "SubTotal"},
		            {"Agua", "2", "500", "1000"},
		            {"Cereal", "5", "1000", "5000"},
		            {"Leche", "2", "300", "600"}
		};
		
		String[] columnas = {"ID", "Nombre", "Edad", "Tilin"};
		DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
		table_2 = new JTable(modelo);
		table_2.setCellSelectionEnabled(true);
		table_2.setBounds(10, 285, 615, 79);
		panel.add(table_2);
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		JLabel lblNewLabel_2_4_3 = new JLabel("SubTotal:");
		lblNewLabel_2_4_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4_3.setBounds(33, 374, 81, 20);
		panel.add(lblNewLabel_2_4_3);
		
		JLabel lblNewLabel_2_4_3_1 = new JLabel("Descuento:");
		lblNewLabel_2_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4_3_1.setBounds(33, 404, 81, 20);
		panel.add(lblNewLabel_2_4_3_1);
		
		JLabel lblNewLabel_2_4_3_2 = new JLabel("IVA 19%:");
		lblNewLabel_2_4_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4_3_2.setBounds(33, 436, 81, 20);
		panel.add(lblNewLabel_2_4_3_2);
		
		JLabel lblNewLabel_2_4_3_2_1 = new JLabel("Total Factura:");
		lblNewLabel_2_4_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4_3_2_1.setBounds(33, 476, 100, 20);
		panel.add(lblNewLabel_2_4_3_2_1);
		
		JLabel lblNewLabel_2_4_2_1 = new JLabel("6600");
		lblNewLabel_2_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4_2_1.setBounds(106, 374, 81, 20);
		panel.add(lblNewLabel_2_4_2_1);
		
		textField_1 = new JTextField();
		textField_1.setText("5%");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(116, 404, 54, 21);
		panel.add(textField_1);
		
		JLabel lblNewLabel_2_4_2_1_1 = new JLabel("1254.0");
		lblNewLabel_2_4_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4_2_1_1.setBounds(106, 434, 81, 20);
		panel.add(lblNewLabel_2_4_2_1_1);
		
		Checkbox checkbox = new Checkbox("");
		checkbox.setBounds(190, 404, 19, 21);
		panel.add(checkbox);
		
		JLabel lblNewLabel_2_4_3_1_1 = new JLabel("Valor descontado:");
		lblNewLabel_2_4_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4_3_1_1.setBounds(215, 404, 123, 20);
		panel.add(lblNewLabel_2_4_3_1_1);
		
		JLabel lblNewLabel_2_4_2_1_1_1 = new JLabel("330.0");
		lblNewLabel_2_4_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4_2_1_1_1.setBounds(336, 404, 81, 20);
		panel.add(lblNewLabel_2_4_2_1_1_1);
		
		JLabel lblNewLabel_2_4_2_1_1_2 = new JLabel("7524.0");
		lblNewLabel_2_4_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4_2_1_1_2.setBounds(128, 476, 81, 20);
		panel.add(lblNewLabel_2_4_2_1_1_2);
		
		JButton btnNewButton_1 = new JButton("Finalizar Factura");
		btnNewButton_1.setBounds(336, 498, 140, 33);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpiar");
		btnNewButton_2.setBounds(499, 498, 89, 33);
		panel.add(btnNewButton_2);
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("[Sin base de datos]");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(47, 43, 142, 28);
		contentPane.add(lblNewLabel_1);
	}
}
