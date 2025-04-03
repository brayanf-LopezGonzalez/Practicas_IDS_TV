package package1;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Teclado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JLabel[] lables = new JLabel[27];
	private String [] letras = {};

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Esperando");
		lblNewLabel.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.white));
		panel.setLayout(new GridLayout(1, 2, 10, 10));
		
		JLabel lblEspacio = new JLabel("Espacio");
		lblEspacio.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
		lblEspacio.setBorder(new LineBorder(Color.black, 1, true));
		lblEspacio.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblEspacio);
		
		JLabel lblNewLabel_1_1 = new JLabel("Borrando");
		lblNewLabel_1_1.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
		lblNewLabel_1_1.setBorder(new LineBorder(Color.black, 1, true));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setBackground(Color.gray);
		panel_1.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.gray));
		panel_1.setLayout(new GridLayout(3, 9, 10, 10));
		
		for(int i = 0; i < 26; i++) {
			
			lables[i] = new JLabel("" + (char) ('A' + i));
			lables[i].setHorizontalAlignment(SwingConstants.CENTER);
			lables[i].setBorder(new LineBorder(Color.black, 1, true));
			lables[i].setOpaque(true);
			lables[i].setBackground(Color.BLACK);
			lables[i].setForeground(Color.WHITE);
			panel_1.add(lables[i]);
			
		}
		
		
	}

}
