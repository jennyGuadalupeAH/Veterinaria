package edu.tesji.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.tesji.model.ventaModel;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class viewVeterinaria extends JFrame {
	
	private JTextField txtcantidad;
	private JComboBox cmbproducto;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewVeterinaria frame = new viewVeterinaria();
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
	public viewVeterinaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 390);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		 cmbproducto = new JComboBox();
		cmbproducto.setModel(new DefaultComboBoxModel(new String[] {"PRODUCTOS", "Comida de Perro", "Comida de Gato", "ACCESORIOS", "Juguetes", "Collar", "Medalla"}));
		cmbproducto.setBounds(95, 60, 136, 33);
		getContentPane().add(cmbproducto);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(139, 103, 55, 33);
		getContentPane().add(txtcantidad);
		txtcantidad.setColumns(10);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(304, 47, 136, 21);
		getContentPane().add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSalir.setBounds(304, 78, 136, 21);
		getContentPane().add(btnSalir);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventaModel misProcesos = new ventaModel();
				//referenciar
				double cantidad = Double.parseDouble(txtcantidad.getText());
				misProcesos.prod = cmbproducto.getSelectedItem().toString();
				//instacia
				 String res = misProcesos.calcularCantidad(cantidad);
				//resultado
				 lblResultado.setText(res + "");
				
				
			}
		});
		btnNewButton.setBounds(304, 16, 136, 21);
		getContentPane().add(btnNewButton);
		
		JLabel lblCantidad = new JLabel("CANTIDAD:");
		lblCantidad.setBounds(27, 113, 67, 13);
		getContentPane().add(lblCantidad);
		
		 lblResultado = new JLabel("");
		 lblResultado.setVerticalAlignment(SwingConstants.TOP);
		lblResultado.setBounds(10, 160, 696, 156);
		getContentPane().add(lblResultado);
	}
}
