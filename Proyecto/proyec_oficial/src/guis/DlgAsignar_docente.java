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
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;

public class DlgAsignar_docente extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgAsignar_docente dialog = new DlgAsignar_docente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgAsignar_docente() {
		setBounds(100, 100, 256, 179);
		getContentPane().setLayout(null);
		{
			textField = new JTextField();
			textField.setBackground(new Color(204, 255, 255));
			textField.setBounds(144, 12, 86, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblCodigoDocente = new JLabel("Codigo Docente :");
			lblCodigoDocente.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblCodigoDocente.setForeground(new Color(0, 0, 0));
			lblCodigoDocente.setBounds(10, 14, 107, 14);
			getContentPane().add(lblCodigoDocente);
		}
		{
			JButton btnBuscar = new JButton("Asignar");
			btnBuscar.setBackground(new Color(0, 153, 255));
			btnBuscar.setBounds(20, 84, 89, 23);
			getContentPane().add(btnBuscar);
		}
		{
			JLabel lblCurso = new JLabel("Curso :");
			lblCurso.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblCurso.setBounds(20, 46, 46, 14);
			getContentPane().add(lblCurso);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(new Color(255, 255, 204));
			comboBox.setBounds(144, 43, 86, 20);
			getContentPane().add(comboBox);
		}
		{
			JButton btnNewButton = new JButton("Eliminar");
			btnNewButton.setBackground(new Color(255, 102, 102));
			btnNewButton.setBounds(119, 84, 89, 23);
			getContentPane().add(btnNewButton);
		}
	}

	public void setLocationRelativeTo(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

}
