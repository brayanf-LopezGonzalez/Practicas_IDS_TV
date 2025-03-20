package package1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class LoginYRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginYRegistro frame = new LoginYRegistro();
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
	public LoginYRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1158, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 1138, 776);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(new CardLayout(0, 0));
		
		JPanel loginPanel = crearPanelLogin();
        panelPrincipal.add(loginPanel, "Login");
        
        JPanel registroPanel = crearPanelRegistro();
        panelPrincipal.add(registroPanel, "Registro");
	}
	
	private JPanel crearPanelLogin() {
		JPanel loginPanel = new JPanel();
		
		loginPanel.setBackground(new Color(162, 235, 251));
        loginPanel.setLayout(null);

        JLabel lblLogin = new JLabel("Inicio de sesion");
        lblLogin.setFont(new Font("Gill Sans MT", Font.BOLD, 23));
        lblLogin.setBounds(44, 49, 187, 41);
        loginPanel.add(lblLogin);

        JLabel lblUsername = new JLabel("Usuario o correo electronico:");
        lblUsername.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
        lblUsername.setBounds(44, 138, 247, 29);
        loginPanel.add(lblUsername);
        
        ImageIcon iconoUsuario = new ImageIcon("imagenes/usuario2.png");
        Image imagenOriginal = iconoUsuario.getImage();
        
        JTextField textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 15));
        textField.setBounds(44, 172, 354, 41);
        loginPanel.add(textField);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
        lblPassword.setBounds(44, 244, 176, 29);
        loginPanel.add(lblPassword);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.BOLD, 16));
        passwordField.setEchoChar('*');
        passwordField.setBounds(44, 283, 354, 41);
        loginPanel.add(passwordField);

        JCheckBox chckbxMantenerSesion = new JCheckBox("Mantener sesión iniciada");
        chckbxMantenerSesion.setFont(new Font("Gill Sans MT", Font.BOLD, 12));
        chckbxMantenerSesion.setBounds(44, 340, 163, 21);
        chckbxMantenerSesion.setOpaque(false);
        loginPanel.add(chckbxMantenerSesion);

        JButton iniciarSesion = new JButton("Iniciar sesión");
        iniciarSesion.setFont(new Font("Gill Sans MT", Font.BOLD, 18));
        iniciarSesion.setBounds(104, 401, 225, 54);
        loginPanel.add(iniciarSesion);
        
        JLabel lblNewLabel = new JLabel("¿Olvido su contraseña?");
        lblNewLabel.setFont(new Font("Gill Sans MT", Font.BOLD, 12));
        lblNewLabel.setBounds(256, 336, 143, 29);
        loginPanel.add(lblNewLabel);
        
        JLabel lblO = new JLabel("¿Aun no tiene cuenta?");
        lblO.setFont(new Font("Gill Sans MT", Font.BOLD, 12));
        lblO.setBounds(153, 477, 143, 29);
        loginPanel.add(lblO);
        
        JButton crearCuenta = new JButton("Crear cuenta");
        crearCuenta.setFont(new Font("Gill Sans MT", Font.BOLD, 18));
        crearCuenta.setBounds(125, 506, 187, 41);
        loginPanel.add(crearCuenta);
        
        JPanel panel = new JPanel();
        panel.setBounds(431, 10, 697, 632);
        loginPanel.add(panel);
        
        
        
        
        
        
		
		return loginPanel;
	}
		
	private JPanel crearPanelRegistro() {
		JPanel registroPanel = new JPanel();
		
		registroPanel.setBackground(new Color(255, 238, 185));
        registroPanel.setLayout(null);

        JLabel lblRegistro = new JLabel("Registro de usuario");
        lblRegistro.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        lblRegistro.setBounds(42, 40, 193, 41);
        registroPanel.add(lblRegistro);

        JLabel lblUsernameRegistro = new JLabel("Nombre de usuario:");
        lblUsernameRegistro.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        lblUsernameRegistro.setBounds(42, 106, 160, 28);
        registroPanel.add(lblUsernameRegistro);

        JTextField txtElver = new JTextField();
        txtElver.setText("Tilin eso");
        txtElver.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        txtElver.setBounds(191, 103, 274, 35);
        registroPanel.add(txtElver);

        JLabel lblCorreo = new JLabel("Correo electrónico:");
        lblCorreo.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        lblCorreo.setBounds(42, 161, 175, 28);
        registroPanel.add(lblCorreo);

        JTextField txtEsotilinaluuabcscommx = new JTextField();
        txtEsotilinaluuabcscommx.setText("esoTilin_alu@uabcs.com.mx");
        txtEsotilinaluuabcscommx.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        txtEsotilinaluuabcscommx.setBounds(191, 158, 274, 35);
        registroPanel.add(txtEsotilinaluuabcscommx);

        JLabel lblPasswordRegistro = new JLabel("Contraseña:");
        lblPasswordRegistro.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        lblPasswordRegistro.setBounds(42, 214, 107, 28);
        registroPanel.add(lblPasswordRegistro);

        JPasswordField passwordField_1 = new JPasswordField();
        passwordField_1.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        passwordField_1.setBounds(133, 210, 332, 35);
        registroPanel.add(passwordField_1);

        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setFont(new Font("Gill Sans MT", Font.BOLD, 18));
        btnRegistrarse.setBounds(729, 570, 173, 41);
        registroPanel.add(btnRegistrarse);
        
        JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
        lblFechaDeNacimiento.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        lblFechaDeNacimiento.setBounds(42, 272, 160, 28);
        registroPanel.add(lblFechaDeNacimiento);
        
        textField_3 = new JTextField();
        textField_3.setText("30/02/1999");
        textField_3.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        textField_3.setBounds(202, 265, 98, 35);
        registroPanel.add(textField_3);
        
        JPanel panel = new JPanel();
        panel.setBounds(490, 82, 315, 374);
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.GRAY));
        registroPanel.add(panel);
        panel.setLayout(null);
        
        JLabel lblPrefetencias = new JLabel("Prefetencias:");
        lblPrefetencias.setBounds(26, 28, 106, 18);
        lblPrefetencias.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        panel.add(lblPrefetencias);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 47));
        chckbxNewCheckBox.setBounds(18, 67, 21, 21);
        chckbxNewCheckBox.setOpaque(false);
        panel.add(chckbxNewCheckBox);
        
        JLabel lblVideojuegos = new JLabel("Videojuegos");
        lblVideojuegos.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        lblVideojuegos.setBounds(45, 67, 106, 18);
        panel.add(lblVideojuegos);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
        chckbxNewCheckBox_1.setOpaque(false);
        chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 47));
        chckbxNewCheckBox_1.setBounds(18, 104, 21, 21);
        panel.add(chckbxNewCheckBox_1);
        
        JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("");
        chckbxNewCheckBox_1_1.setOpaque(false);
        chckbxNewCheckBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 47));
        chckbxNewCheckBox_1_1.setBounds(18, 143, 21, 21);
        panel.add(chckbxNewCheckBox_1_1);
        
        JLabel lblPeliculas = new JLabel("Peliculas");
        lblPeliculas.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        lblPeliculas.setBounds(45, 107, 75, 18);
        panel.add(lblPeliculas);
        
        JLabel lblLiteratura = new JLabel("Literatura");
        lblLiteratura.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        lblLiteratura.setBounds(45, 143, 75, 18);
        panel.add(lblLiteratura);
        
        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
        chckbxNewCheckBox_2.setOpaque(false);
        chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 47));
        chckbxNewCheckBox_2.setBounds(157, 67, 21, 21);
        panel.add(chckbxNewCheckBox_2);
        
        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
        chckbxNewCheckBox_3.setOpaque(false);
        chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 47));
        chckbxNewCheckBox_3.setBounds(157, 104, 21, 21);
        panel.add(chckbxNewCheckBox_3);
        
        JCheckBox chckbxNewCheckBox_4 = new JCheckBox("");
        chckbxNewCheckBox_4.setOpaque(false);
        chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 47));
        chckbxNewCheckBox_4.setBounds(157, 143, 21, 21);
        panel.add(chckbxNewCheckBox_4);
        
        JLabel lblComedia = new JLabel("Noticias");
        lblComedia.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        lblComedia.setBounds(184, 67, 106, 18);
        panel.add(lblComedia);
        
        JLabel lblTecnologia = new JLabel("Tecnologia");
        lblTecnologia.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        lblTecnologia.setBounds(184, 104, 106, 18);
        panel.add(lblTecnologia);
        
        JLabel lblEntretenimiento = new JLabel("Entretenimiento");
        lblEntretenimiento.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
        lblEntretenimiento.setBounds(184, 143, 106, 18);
        panel.add(lblEntretenimiento);
        
        ImageIcon icono_1 = new ImageIcon("imagenes/usuario.png");
        Image imagenOriginal_1 = icono_1.getImage();
        Image escalable_1 = imagenOriginal_1.getScaledInstance(80, 90, Image.SCALE_SMOOTH);
        
        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setBounds(26, 245, 106, 119);
        btnNewButton_1.setIcon(new ImageIcon(escalable_1));
        panel.add(btnNewButton_1);
        
        JLabel lblFotoDePerfil = new JLabel("Foto de perfil:");
        lblFotoDePerfil.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        lblFotoDePerfil.setBounds(26, 217, 106, 18);
        panel.add(lblFotoDePerfil);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mexico", "EU", "España", "Canada"}));
        comboBox.setBounds(169, 245, 121, 33);
        panel.add(comboBox);
        
        JLabel lblNacionalidad = new JLabel("Pais:");
        lblNacionalidad.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        lblNacionalidad.setBounds(169, 217, 106, 18);
        panel.add(lblNacionalidad);
        
        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        lblSexo.setBounds(169, 309, 106, 18);
        panel.add(lblSexo);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer", "Otro..."}));
        comboBox_1.setSelectedIndex(2);
        comboBox_1.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
        comboBox_1.setBounds(169, 331, 121, 33);
        panel.add(comboBox_1);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setBounds(314, 265, 35, 35);
        registroPanel.add(btnNewButton);
        
        ImageIcon icono_2 = new ImageIcon("imagenes/calendario.png");
		
		Image imagenOriginal_2 = icono_2.getImage();
		Image escalable_2 = imagenOriginal_2.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(escalable_2));
		
		JLabel lblBiografia = new JLabel("Biografia:");
		lblBiografia.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
		lblBiografia.setBounds(42, 326, 160, 28);
		registroPanel.add(lblBiografia);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 355, 286, 101);
		registroPanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Gill Sans MT", Font.PLAIN, 16));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Gill Sans MT", Font.BOLD, 18));
		btnRegresar.setBounds(42, 595, 173, 41);
		registroPanel.add(btnRegresar);
		
		ImageIcon icono_3 = new ImageIcon("imagenes/cancelar.png");
		
		Image imagenOriginal_3 = icono_3.getImage();
		Image escalable_3 = imagenOriginal_3.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnRegresar.setIcon(new ImageIcon(escalable_3));
		
		return registroPanel;
	}
}
