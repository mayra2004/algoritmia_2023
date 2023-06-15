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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import javax.swing.JComboBox;
import java.awt.Font;

public class DlgMatricula extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgMatricula dialog = new DlgMatricula();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgMatricula() {
		setBounds(100, 100, 311, 170);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Codigo de alumno :");
			lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblNewLabel.setBounds(10, 28, 137, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Codigo de curso  :");
			lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
			lblNewLabel_2.setBounds(10, 59, 137, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			textField = new JTextField();
			textField.setBackground(new Color(204, 255, 255));
			textField.setBounds(155, 25, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnNewButton_1 = new JButton("Matricular");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setBackground(new Color(102, 153, 255));
			btnNewButton_1.setBounds(41, 97, 89, 23);
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnNewButton_3 = new JButton("Eliminar");
			btnNewButton_3.setBackground(new Color(255, 102, 102));
			btnNewButton_3.setBounds(165, 97, 89, 23);
			contentPanel.add(btnNewButton_3);
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(155, 56, 86, 20);
		contentPanel.add(comboBox);
	}

	public void setLocationRelativeTo(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
}
