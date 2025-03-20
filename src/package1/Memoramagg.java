package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

public class Memoramagg extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memoramagg frame = new Memoramagg();
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
	public Memoramagg() {
		setResizable(false);
		setTitle("Juego");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 647);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 83, 500, 500);
		panel.setOpaque(false);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("New button");
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("New button");
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_7 = new JButton("New button");
		panel.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_6 = new JButton("New button");
		panel.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_5 = new JButton("New button");
		panel.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_8 = new JButton("New button");
		panel.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("New button");
		panel.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("New button");
		panel.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_12 = new JButton("New button");
		panel.add(btnNewButton_1_12);
		
		JButton btnNewButton_1_11 = new JButton("New button");
		panel.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_13 = new JButton("New button");
		panel.add(btnNewButton_1_13);
		
		JButton btnNewButton_1_14 = new JButton("New button");
		panel.add(btnNewButton_1_14);
		
		JLabel lblNewLabel = new JLabel("Memorama");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Gadugi", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(121, 22, 441, 34);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(544, 83, 213, 500);
		panel_1.setOpaque(false);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Puntaje: 0");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1.setBounds(26, 77, 143, 67);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tiempo: 1:30");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(26, 154, 150, 67);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Aciertos");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(26, 231, 169, 67);
		panel_1.add(lblNewLabel_1_2);
		
		JButton btnNewButton_2 = new JButton("Reiniciar");
		btnNewButton_2.setFont(new Font("Century Gothic", Font.BOLD, 17));
		btnNewButton_2.setBounds(10, 423, 193, 67);
		panel_1.add(btnNewButton_2);
	}
}
