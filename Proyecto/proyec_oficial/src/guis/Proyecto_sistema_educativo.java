package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;

public class Proyecto_sistema_educativo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto_sistema_educativo frame = new Proyecto_sistema_educativo();
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
	public Proyecto_sistema_educativo() {
		setBackground(new Color(204, 255, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(204, 255, 153));
		setJMenuBar(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Century", Font.PLAIN, 14));
		mnMantenimiento.setHorizontalAlignment(SwingConstants.CENTER);
		mnMantenimiento.setBackground(new Color(255, 255, 0));
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmAlumno = new JMenuItem("Alumno");
		mntmAlumno.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmAlumno.setBackground(new Color(204, 255, 204));
		mntmAlumno.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				DlgAlumno alum = new DlgAlumno();
				alum.setLocationRelativeTo(this);
				alum.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmAlumno);
		
		JMenuItem mntmDocente = new JMenuItem("Docente");
		mntmDocente.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmDocente.setBackground(new Color(204, 255, 204));
		mntmDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgDocente doc = new DlgDocente();
				doc.setLocationRelativeTo(this);
				doc.setVisible(true);
			}
		});
		
		JMenuItem mntmCurso = new JMenuItem("Curso");
		mntmCurso.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmCurso.setBackground(new Color(204, 255, 204));
		mntmCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgCurso cur = new DlgCurso();
				cur.setLocationRelativeTo(this);
				cur.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmCurso);
		mnMantenimiento.add(mntmDocente);
		
		JMenu mnMatricula = new JMenu("Matricula");
		mnMatricula.setFont(new Font("Century", Font.PLAIN, 14));
		mnMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		mnMatricula.setBackground(new Color(255, 255, 0));
		menuBar.add(mnMatricula);
		
		JMenuItem mntmMatricula = new JMenuItem("Matricula");
		mntmMatricula.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmMatricula.setBackground(new Color(204, 255, 204));
		mntmMatricula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgMatricula matri = new DlgMatricula();
				matri.setLocationRelativeTo(this);
				matri.setVisible(true);
			}
		});
		mnMatricula.add(mntmMatricula);
		
		JMenu mnRetiros = new JMenu("Retiros");
		mnRetiros.setFont(new Font("Century", Font.PLAIN, 14));
		mnRetiros.setHorizontalAlignment(SwingConstants.CENTER);
		mnRetiros.setBackground(new Color(255, 255, 0));
		menuBar.add(mnRetiros);
		
		JMenuItem mntmRetirosParciales = new JMenuItem("retiros parciales");
		mntmRetirosParciales.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmRetirosParciales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgRetiros_parciales retiro = new DlgRetiros_parciales();
				retiro.setLocationRelativeTo(this);
				retiro.setVisible(true);
			}
		});
		mntmRetirosParciales.setBackground(new Color(204, 255, 204));
		mnRetiros.add(mntmRetirosParciales);
		
		JMenu mnAsignacinDocente = new JMenu("Asignaci\u00F3n docente");
		mnAsignacinDocente.setFont(new Font("Century", Font.PLAIN, 14));
		mnAsignacinDocente.setHorizontalAlignment(SwingConstants.CENTER);
		mnAsignacinDocente.setBackground(new Color(255, 255, 0));
		menuBar.add(mnAsignacinDocente);
		
		JMenuItem mntmAsignacin = new JMenuItem("Asignaci\u00F3n ");
		mntmAsignacin.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmAsignacin.setBackground(new Color(204, 255, 204));
		mntmAsignacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgAsignar_docente asigna = new DlgAsignar_docente();
				asigna.setLocationRelativeTo(this);
				asigna.setVisible(true);
			}
		});
		mnAsignacinDocente.add(mntmAsignacin);
		
		JMenu mnReportes = new JMenu("reportes");
		mnReportes.setFont(new Font("Century", Font.PLAIN, 14));
		mnReportes.setHorizontalAlignment(SwingConstants.CENTER);
		mnReportes.setBackground(new Color(204, 255, 204));
		menuBar.add(mnReportes);
		
		JMenuItem mntmReporteAlumno = new JMenuItem("Reporte alumno");
		mntmReporteAlumno.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmReporteAlumno.setBackground(new Color(204, 255, 204));
		mntmReporteAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgReporte_alumno realum = new DlgReporte_alumno();
				realum.setLocationRelativeTo(this);
				realum.setVisible(true);
			}
		});
		mnReportes.add(mntmReporteAlumno);
		
		JMenuItem mntmReporteDocente = new JMenuItem("Reporte docente");
		mntmReporteDocente.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmReporteDocente.setBackground(new Color(204, 255, 204));
		mntmReporteDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgReporte_docente redoc = new DlgReporte_docente();
				redoc.setLocationRelativeTo(this);
				redoc.setVisible(true);
			}
		});
		mnReportes.add(mntmReporteDocente);
		
		JMenuItem mntmReporteCurso = new JMenuItem("Reporte curso");
		mntmReporteCurso.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmReporteCurso.setBackground(new Color(204, 255, 204));
		mntmReporteCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgReporte_Curso recur = new DlgReporte_Curso();
				recur.setLocationRelativeTo(this);
				recur.setVisible(true);
			}
		});
		mnReportes.add(mntmReporteCurso);
		
		JMenu mnArchivo = new JMenu("archivo");
		mnArchivo.setFont(new Font("Century", Font.PLAIN, 14));
		mnArchivo.setHorizontalAlignment(SwingConstants.CENTER);
		mnArchivo.setForeground(new Color(0, 0, 0));
		mnArchivo.setBackground(new Color(204, 255, 204));
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("salir");
		mntmSalir.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mntmSalir.setBackground(new Color(255, 255, 102));
		mnArchivo.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 498, 240);
		contentPane.add(lblNewLabel);
	}
}

