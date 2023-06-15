package clases;

public class Docente {
	//declaracion_de variables
	private int codigoDocente;
	private String nombres, apellidos,categoria, telefono, dni;
	
	//constructor
	public Docente(int codigoDocente, String nombres, String apellidos, String categoria, String telefono, String dni) {
		super();
		this.codigoDocente = codigoDocente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.categoria = categoria;
		this.telefono = telefono;
		this.dni = dni;
	}
	
	//get y set
	public int getCodigoDocente() {
		return codigoDocente;
	}
	public void setCodigoDocente(int codigoDocente) {
		this.codigoDocente = codigoDocente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	

	


}
