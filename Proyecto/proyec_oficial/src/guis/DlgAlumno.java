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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DlgAlumno extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgAlumno dialog = new DlgAlumno();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgAlumno() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Codigo de alumno :");
			lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
			lblNewLabel.setBounds(10, 11, 111, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nombre :");
			lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
			lblNewLabel_1.setBounds(10, 36, 62, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Apellidos :");
			lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
			lblNewLabel_2.setBounds(10, 61, 84, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Telefono :");
			lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblNewLabel_3.setBounds(10, 86, 62, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			textField = new JTextField();
			textField.setBackground(new Color(204, 255, 255));
			textField.setBounds(124, 8, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBackground(new Color(204, 255, 255));
			textField_1.setBounds(124, 33, 86, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBackground(new Color(204, 255, 255));
			textField_2.setBounds(124, 58, 86, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBackground(new Color(204, 255, 255));
			textField_3.setBounds(124, 83, 86, 20);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Ingresar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBackground(new Color(102, 153, 255));
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setBounds(335, 7, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Consultar");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setBackground(new Color(102, 153, 255));
			btnNewButton_1.setForeground(new Color(0, 0, 0));
			btnNewButton_1.setBounds(335, 57, 89, 23);
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton("Modificar");
			btnNewButton_2.setBackground(new Color(102, 153, 255));
			btnNewButton_2.setForeground(new Color(0, 0, 0));
			btnNewButton_2.setBounds(335, 32, 89, 23);
			contentPanel.add(btnNewButton_2);
		}
		{
			JButton btnNewButton_3 = new JButton("Eliminar");
			btnNewButton_3.setBackground(new Color(255, 153, 153));
			btnNewButton_3.setForeground(new Color(0, 0, 0));
			btnNewButton_3.setBounds(335, 107, 89, 23);
			contentPanel.add(btnNewButton_3);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 136, 414, 114);
			contentPanel.add(scrollPane);
			{
				table = new JTable();
				scrollPane.setViewportView(table);
			}
		}
		{
			JLabel lblNewLabel_4 = new JLabel("DNI :");
			lblNewLabel_4.setBounds(10, 111, 46, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBackground(new Color(204, 255, 255));
			textField_4.setBounds(124, 107, 86, 20);
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
		}
		
		JButton btnListado = new JButton("Listado");
		btnListado.setBackground(new Color(102, 153, 255));
		btnListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListado.setBounds(335, 82, 89, 23);
		contentPanel.add(btnListado);
	}

	public void setLocationRelativeTo(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
}
