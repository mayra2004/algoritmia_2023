package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;

public class DlgCurso extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgCurso dialog = new DlgCurso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCurso() {
		setBounds(100, 100, 450, 351);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Codigo de curso  :");
			lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblNewLabel.setBounds(10, 11, 112, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Codigo de docente :");
			lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblNewLabel_1.setBounds(10, 36, 122, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Nombre :");
			lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblNewLabel_2.setBounds(10, 61, 69, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Horas :");
			lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblNewLabel_3.setBounds(10, 86, 46, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			textField = new JTextField();
			textField.setBackground(new Color(204, 255, 255));
			textField.setBounds(136, 9, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBackground(new Color(204, 255, 255));
			textField_1.setBounds(136, 34, 86, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBackground(new Color(204, 255, 255));
			textField_2.setBounds(136, 58, 86, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBackground(new Color(204, 255, 255));
			textField_3.setBounds(136, 83, 86, 20);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Consultar");
			btnNewButton.setBackground(new Color(102, 153, 255));
			btnNewButton.setBounds(335, 57, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Ingresar");
			btnNewButton_1.setBackground(new Color(102, 153, 255));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setBounds(335, 7, 89, 23);
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton("Listado");
			btnNewButton_2.setBackground(new Color(102, 153, 255));
			btnNewButton_2.setBounds(335, 82, 89, 23);
			contentPanel.add(btnNewButton_2);
		}
		{
			JButton btnNewButton_3 = new JButton("Eliminar");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_3.setBackground(new Color(255, 153, 153));
			btnNewButton_3.setBounds(335, 111, 89, 23);
			contentPanel.add(btnNewButton_3);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 141, 414, 160);
			contentPanel.add(scrollPane);
		}
		{
			JButton btnModificar = new JButton("Modificar");
			btnModificar.setBackground(new Color(0, 153, 255));
			btnModificar.setBounds(335, 32, 89, 23);
			contentPanel.add(btnModificar);
		}
	}

	public void setLocationRelativeTo(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

}
