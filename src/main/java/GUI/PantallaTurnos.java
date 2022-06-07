package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ENTIDADES.RecursoTecnologico;
import GESTOR.GestorTurnos;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PantallaTurnos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaTurnos frame = new PantallaTurnos();
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
	public PantallaTurnos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		pedirSeleccion();
		
	}

	private void pedirSeleccion() {
		ArrayList<String> tipoTurnos = GestorTurnos.buscarTipoDeRecurso();
		final JComboBox cmbTiposRecursos = new JComboBox(tipoTurnos.toArray());
		cmbTiposRecursos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				ArrayList<RecursoTecnologico> recursosActivos = GestorTurnos.tomarSeleccion(cmbTiposRecursos.getSelectedItem());
			}
		});
		cmbTiposRecursos.setBounds(10, 11, 174, 22);
		contentPane.add(cmbTiposRecursos);
	}
	
	
	
	
}
