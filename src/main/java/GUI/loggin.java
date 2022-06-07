package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GESTOR.GestorUsuario;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loggin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JPasswordField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loggin frame = new loggin();
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
	public loggin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		txtNombre = new JTextField();
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setBounds(153, 45, 244, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("nombre:");
		lblNewLabel.setBounds(10, 48, 120, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(10, 80, 120, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnLoggin = new JButton("Iniciar Sesi\u00F3n");
		btnLoggin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (GestorUsuario.validarUsuario(txtNombre.getText(), txtContraseña.getText())) {
					habilitarVentanaPrincipal();

				}
			}

		});
		btnLoggin.setBounds(249, 108, 148, 23);
		contentPane.add(btnLoggin);

		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(153, 77, 244, 20);
		contentPane.add(txtContraseña);

	}

	protected void habilitarVentanaPrincipal() {
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.show();
	}
}
