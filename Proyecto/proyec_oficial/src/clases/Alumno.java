package clases;

public class Alumno {
	
		//	Atributos privados
		private int codigoAlumno;
		private String nombre, apellidos, telefono, dni;
		
		//	Constructor
		public Alumno(int codigoAlumno, 
				        String nombre, String apellidos, String telefono, String dni) {
			this.codigoAlumno = codigoAlumno;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.telefono = telefono;
			this.dni = dni;
			
		}
		//  Metodos de acceso publico: set/get
		public void setcodigoAlumno(int codigoAlumno) {
			this.codigoAlumno = codigoAlumno;
		}
		public void setnombre(String nombre) {
			this.nombre = nombre;
		}
		public void setapellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public void settelefono(String telefono) {
			this.telefono = telefono;
		}
		public void setdni(String dni) {
			this.dni = dni;
		}
		
		public int getcodigoAlumno() {
			return codigoAlumno;
		}
		public String nombres() {
			return nombre;
		}
		public String getapellidos() {
			return apellidos;
		}
		public String gettelefono() {
			return telefono;
		}
		public String getdni() {
			return dni;
		
		}
		
	
}
