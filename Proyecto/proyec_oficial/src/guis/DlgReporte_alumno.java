package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class DlgReporte_alumno extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgReporte_alumno dialog = new DlgReporte_alumno();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgReporte_alumno() {
		setBounds(100, 100, 286, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblCodigoAlumno = new JLabel("Codigo alumno :");
			lblCodigoAlumno.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblCodigoAlumno.setBounds(22, 15, 103, 14);
			getContentPane().add(lblCodigoAlumno);
		}
		{
			textField = new JTextField();
			textField.setBackground(new Color(204, 255, 255));
			textField.setBounds(135, 12, 86, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBackground(new Color(0, 153, 255));
			btnAceptar.setBounds(36, 45, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.setBackground(new Color(255, 102, 102));
			btnEliminar.setBounds(145, 45, 89, 23);
			getContentPane().add(btnEliminar);
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 79, 257, 175);
		getContentPane().add(panel);
	}

	public void setLocationRelativeTo(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
}
