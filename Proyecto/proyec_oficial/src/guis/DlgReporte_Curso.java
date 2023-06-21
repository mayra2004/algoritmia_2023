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
import java.awt.Font;
import java.awt.Color;

public class DlgReporte_Curso extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgReporte_Curso dialog = new DlgReporte_Curso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgReporte_Curso() {
		setBounds(100, 100, 294, 279);
		getContentPane().setLayout(null);
		{
			textField = new JTextField();
			textField.setBackground(new Color(204, 255, 255));
			textField.setBounds(142, 11, 86, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblCodigoDeCurso = new JLabel("Codigo de curso :");
			lblCodigoDeCurso.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblCodigoDeCurso.setBounds(26, 14, 106, 14);
			getContentPane().add(lblCodigoDeCurso);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBackground(new Color(0, 153, 255));
			btnAceptar.setBounds(43, 48, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.setBackground(new Color(255, 102, 102));
			btnEliminar.setBounds(152, 48, 89, 23);
			getContentPane().add(btnEliminar);
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 82, 266, 147);
			getContentPane().add(panel);
		}
	}

	public void setLocationRelativeTo(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

}
