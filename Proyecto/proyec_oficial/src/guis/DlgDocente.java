package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;

public class DlgDocente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDocente dialog = new DlgDocente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDocente() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombres :");
			lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblNewLabel.setBounds(10, 11, 62, 14);
			contentPanel.add(lblNewLabel);
		}
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos :");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 36, 62, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Categoria :");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 63, 71, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono :");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 88, 62, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DNI :");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 113, 46, 14);
		contentPanel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBackground(new Color(204, 255, 255));
		textField.setBounds(91, 9, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(204, 255, 255));
		textField_1.setBounds(91, 33, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(204, 255, 255));
		textField_3.setBounds(91, 110, 86, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(204, 255, 255));
		textField_4.setBounds(91, 85, 86, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(91, 60, 86, 20);
		contentPanel.add(comboBox);
		
		JButton btnAceptar = new JButton("Ingresar");
		btnAceptar.setBackground(new Color(102, 153, 255));
		btnAceptar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnAceptar);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(335, 59, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Listado");
		btnNewButton_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1.setBounds(335, 84, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setBackground(new Color(255, 153, 153));
		btnNewButton_2.setBounds(335, 109, 89, 23);
		contentPanel.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 138, 414, 113);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_3 = new JButton("Modificar");
		btnNewButton_3.setBackground(new Color(51, 153, 255));
		btnNewButton_3.setBounds(335, 32, 89, 23);
		contentPanel.add(btnNewButton_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}


	public void setLocationRelativeTo(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
}
