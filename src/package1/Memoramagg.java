package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

public class Memoramagg extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public int cartas[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

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
		panel.setBounds(30, 33, 450, 450);
		panel.setOpaque(false);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		//------------------------------------------------------ BOTONES ----------------------------------
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_1 = new ImageIcon("iconos/arandano.jpg");
                btnNewButton_1.setIcon(icono_1);
            }
        });
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_2 = new ImageIcon("iconos/cereza.jpg");
                btnNewButton.setIcon(icono_2);
            }
        });
		panel.add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_3 = new ImageIcon("iconos/Durazno.jpg");
                btnNewButton_1_1.setIcon(icono_3);
            }
        });
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_4 = new ImageIcon("iconos/fresa.jpg");
                btnNewButton_1_2.setIcon(icono_4);
            }
        });
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_5 = new ImageIcon("iconos/limon.jpg");
                btnNewButton_1_3.setIcon(icono_5);
            }
        });
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("");
		btnNewButton_1_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_6 = new ImageIcon("iconos/mango.jpg");
                btnNewButton_1_4.setIcon(icono_6);
            }
        });
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_7 = new JButton("");
		btnNewButton_1_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_7 = new ImageIcon("iconos/naranja.jpg");
                btnNewButton_1_7.setIcon(icono_7);
            }
        });
		panel.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_6 = new JButton("");
		btnNewButton_1_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_8 = new ImageIcon("iconos/uvas.jpg");
                btnNewButton_1_6.setIcon(icono_8);
            }
        });
		panel.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_5 = new JButton("");
		btnNewButton_1_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_9 = new ImageIcon("iconos/arandano.jpg");
                btnNewButton_1_5.setIcon(icono_9);
            }
        });
		panel.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_8 = new JButton("");
		btnNewButton_1_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_10 = new ImageIcon("iconos/cereza.jpg");
                btnNewButton_1_8.setIcon(icono_10);
            }
        });
		panel.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("");
		btnNewButton_1_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_11 = new ImageIcon("iconos/limon.jpg");
                btnNewButton_1_9.setIcon(icono_11);
            }
        });
		panel.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("");
		btnNewButton_1_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_12 = new ImageIcon("iconos/mango.jpg");
                btnNewButton_1_10.setIcon(icono_12);
            }
        });
		panel.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("");
		btnNewButton_1_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_13 = new ImageIcon("iconos/arandano.jpg");
                btnNewButton_1_11.setIcon(icono_13);
            }
        });
		panel.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_12 = new JButton("");
		btnNewButton_1_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono_14 = new ImageIcon("iconos/arandano.jpg");
                btnNewButton_1_12.setIcon(icono_14);
            }
        });
		panel.add(btnNewButton_1_12);
		
		JButton btnNewButton_1_13 = new JButton("");
		panel.add(btnNewButton_1_13);
		
		JButton btnNewButton_1_14 = new JButton("");
		
		panel.add(btnNewButton_1_14);
		
		//--------------------------------------------------------------------------------------------------------------
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(537, 21, 213, 500);
		panel_1.setOpaque(false);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Puntaje: 0");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1.setBounds(45, 82, 143, 67);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tiempo: 1:30");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(45, 171, 150, 67);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Aciertos");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(45, 248, 158, 67);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel = new JLabel("Memorama");
		lblNewLabel.setBounds(11, 10, 184, 34);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Gadugi", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton_2 = new JButton("Reiniciar");
		btnNewButton_2.setBounds(165, 516, 193, 67);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Century Gothic", Font.BOLD, 17));
	}
}
