package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;

public class DlgRetiros_parciales extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRetiros_parciales dialog = new DlgRetiros_parciales();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRetiros_parciales() {
		setBounds(100, 100, 312, 195);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(204, 255, 255));
		textField.setBounds(163, 11, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCodigoDeAlumno = new JLabel("Codigo de Alumno :");
		lblCodigoDeAlumno.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblCodigoDeAlumno.setBounds(30, 14, 123, 14);
		getContentPane().add(lblCodigoDeAlumno);
		
		JLabel lblCuso = new JLabel("curso :");
		lblCuso.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblCuso.setBounds(56, 45, 46, 14);
		getContentPane().add(lblCuso);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(163, 42, 86, 20);
		getContentPane().add(comboBox);
		
		JButton btnRetirar = new JButton("Retirar");
		btnRetirar.setBackground(new Color(255, 153, 153));
		btnRetirar.setBounds(104, 109, 89, 23);
		getContentPane().add(btnRetirar);
	}

	public void setLocationRelativeTo(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
}
