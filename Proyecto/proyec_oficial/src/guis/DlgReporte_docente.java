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

public class DlgReporte_docente extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgReporte_docente dialog = new DlgReporte_docente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgReporte_docente() {
		setBounds(100, 100, 279, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblCodigo = new JLabel("Codigo docente :");
			lblCodigo.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblCodigo.setBounds(10, 15, 112, 14);
			getContentPane().add(lblCodigo);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBackground(new Color(0, 153, 255));
			btnAceptar.setBounds(42, 45, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.setBackground(new Color(255, 102, 102));
			btnEliminar.setBounds(142, 45, 89, 23);
			getContentPane().add(btnEliminar);
		}
		{
			textField = new JTextField();
			textField.setBackground(new Color(204, 255, 255));
			textField.setBounds(132, 12, 86, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 75, 252, 175);
			getContentPane().add(panel);
		}
	}

	public void setLocationRelativeTo(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

}
